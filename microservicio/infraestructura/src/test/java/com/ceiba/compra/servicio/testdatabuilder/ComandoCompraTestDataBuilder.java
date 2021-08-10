package com.ceiba.compra.servicio.testdatabuilder;

import com.ceiba.compra.comando.ComandoCompra;

import com.ceiba.compra.servicio.testdatabuilder.ComandoCompraTestDataBuilder;

import java.time.LocalDate;
import java.util.UUID;

public class ComandoCompraTestDataBuilder {
    private Long id_compra;
    private Long id_usuario;
    private Long id_producto;
    private Double total;
    private Double descuento;
    private String codigo;
    private LocalDate fecha;

    public ComandoCompraTestDataBuilder() {
        id_usuario = Long.parseLong(UUID.randomUUID().toString());
        id_producto = Long.parseLong(UUID.randomUUID().toString());
        total = Double.parseDouble(UUID.randomUUID().toString());
        descuento = Double.parseDouble(UUID.randomUUID().toString());
        codigo = UUID.randomUUID().toString();
        fecha = LocalDate.now();
    }

    public ComandoCompraTestDataBuilder conNombre(Long id_usuario) {
        this.id_usuario = id_usuario;
        return this;
    }

    public ComandoCompra build() {
        return new ComandoCompra(id_compra,id_usuario,id_producto,total,descuento,codigo,fecha);
    }
}
