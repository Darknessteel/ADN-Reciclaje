package com.ceiba.compra.puerto.dao;

import com.ceiba.compra.modelo.dto.DtoCompra;

import java.util.List;

public interface DaoCompra {
    /**
     * Permite listar usuarios
     * @return los usuarios
     */
    List<DtoCompra> listar();
}
