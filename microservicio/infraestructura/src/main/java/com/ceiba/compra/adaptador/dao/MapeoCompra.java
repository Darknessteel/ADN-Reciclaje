package com.ceiba.compra.adaptador.dao;

import com.ceiba.compra.modelo.dto.DtoCompra;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class MapeoCompra implements RowMapper<DtoCompra>, MapperResult {
    @Override
    public DtoCompra mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id_compra = resultSet.getLong("id_compra");
        Long id_usuario = resultSet.getLong("id_usuario");
        Long id_producto = resultSet.getLong("id_producto");
        Double total = resultSet.getDouble("total");
        Double descuento = resultSet.getDouble("descuento");
        String codigo = resultSet.getString("codigo");
        LocalDate fecha = extraerLocalDate(resultSet, "fecha_creacion");

        return new DtoCompra(id_compra,id_usuario,id_producto,total,descuento,codigo,fecha);
    }
}
