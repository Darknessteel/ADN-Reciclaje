package com.ceiba.producto.servicio.testdatabuilder;

import com.ceiba.producto.modelo.entidad.Producto;

import java.time.LocalDate;

public class ProductoTestDataBuilder {

    private Long id;
    private String nombreProducto;
    private String valor;
    private LocalDate fecha;

    public ProductoTestDataBuilder() {
        nombreProducto = "1234";
        valor = "54321";
        fecha = LocalDate.now();
    }

    public ProductoTestDataBuilder conValor(String valor) {
        this.valor = valor;
        return this;
    }

    public ProductoTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public Producto build() {
        return new Producto(id,nombreProducto, valor,fecha);
    }
}
