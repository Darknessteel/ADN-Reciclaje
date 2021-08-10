package com.ceiba.compra.adaptador.repositorio;

import com.ceiba.compra.modelo.entidad.Compra;
import com.ceiba.compra.puerto.repositorio.RepositorioCompra;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioCompraMysql implements RepositorioCompra {
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="compra", value="crear")
    private static String sqlCrear;

    @SqlStatement(namespace="compra", value="actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace="compra", value="eliminar")
    private static String sqlEliminar;

    @SqlStatement(namespace="compra", value="existe")
    private static String sqlExiste;

    @SqlStatement(namespace="compra", value="existeExcluyendoId")
    private static String sqlExisteExcluyendoId;

    public RepositorioCompraMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(Compra compra) {
        return this.customNamedParameterJdbcTemplate.crear(compra, sqlCrear);
    }

    @Override
    public void eliminar(Long id_compra) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id_compra", id_compra);

        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);
    }

    @Override
    public boolean existe(Long id_usuario) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id_usuario", id_usuario);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste,paramSource, Boolean.class);
    }

    @Override
    public void actualizar(Compra compra) {
        this.customNamedParameterJdbcTemplate.actualizar(compra, sqlActualizar);
    }

    @Override
    public boolean existeExcluyendoId(Long id_compra, Long id_usuario) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id_compra", id_compra);
        paramSource.addValue("id_usuario", id_usuario);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteExcluyendoId,paramSource, Boolean.class);
    }
}
