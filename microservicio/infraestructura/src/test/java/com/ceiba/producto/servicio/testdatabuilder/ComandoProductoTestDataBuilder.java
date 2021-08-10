package com.ceiba.producto.servicio.testdatabuilder;

import com.ceiba.producto.comando.ComandoProducto;

import java.time.LocalDate;
import java.util.UUID;

public class ComandoProductoTestDataBuilder {
    private Long id;
    private String nombre;
    private String valor;
    private LocalDate fecha;

    public ComandoProductoTestDataBuilder() {
        nombre = UUID.randomUUID().toString();
        valor = "54321";
        fecha = LocalDate.now();
    }

    public ComandoProductoTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ComandoProducto build() {
        return new ComandoProducto(id,nombre, valor,fecha);
    }
}
