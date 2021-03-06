package com.ceiba.producto.adaptador.dao;

import java.util.List;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.producto.puerto.dao.DaoProducto;
import com.ceiba.producto.modelo.dto.DtoProducto;
import org.springframework.stereotype.Component;

@Component
public class DaoProductoMysql implements DaoProducto{
    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="producto", value="listar")
    private static String sqlListar;

    public DaoProductoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoProducto> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoProducto());
    }
}
