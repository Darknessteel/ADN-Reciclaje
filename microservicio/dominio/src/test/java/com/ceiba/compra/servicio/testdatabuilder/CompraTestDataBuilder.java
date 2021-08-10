package com.ceiba.compra.servicio.testdatabuilder;

import com.ceiba.compra.modelo.entidad.Compra;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.servicio.testdatabuilder.ProductoTestDataBuilder;

import java.time.LocalDate;

public class CompraTestDataBuilder {
    private Long id_compra;
    private Long id_usuario;
    private Long id_producto;
    private Double total;
    private Double descuento;
    private String codigo;
    private LocalDate fechaCreacion;

    public CompraTestDataBuilder() {
        total = 10000d;
        descuento = 10d;
        codigo = "7b458657";
        fechaCreacion = LocalDate.now();
    }

    public CompraTestDataBuilder conTotal(Double total) {
        this.total = total;
        return this;
    }
    public CompraTestDataBuilder conDescuento(Double descuento) {
        this.descuento = descuento;
        return this;
    }
    public CompraTestDataBuilder conCodigo(Double total) {
        this.codigo = codigo;
        return this;
    }

    public CompraTestDataBuilder conId_compra(Long id_compra) {
        this.id_compra = id_compra;
        return this;
    }

    public CompraTestDataBuilder conId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
        return this;
    }
    public CompraTestDataBuilder conId_producto(Long id_producto) {
        this.id_producto = id_producto;
        return this;
    }

    public Compra build() {
        return new Compra(id_compra,id_usuario,id_producto,total,descuento,codigo,fechaCreacion);
    }
}

