package com.ceiba.producto.adaptador.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.producto.modelo.dto.DtoProducto;
import org.springframework.jdbc.core.RowMapper;

public class MapeoProducto implements RowMapper<DtoProducto>, MapperResult {
    @Override
    public DtoProducto mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        String nombre = resultSet.getString("nombre");
        String valor = resultSet.getString("valor");
        LocalDate fecha = extraerLocalDate(resultSet, "fecha_creacion");

        return new DtoProducto(id,nombre,valor,fecha);
    }
}
