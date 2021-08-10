package com.ceiba.compra.modelo.entidad;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Compra {
    private Long id_compra;
    private Long id_usuario;
    private Long id_producto;
    private Double total;
    private Double descuento;
    private String codigo;
    private LocalDate fechaCreacion;


    public Compra(Long id_compra, Long id_usuario, Long id_producto, Double total, Double descuento, String codigo, LocalDate fechaCreacion) {

        this.id_compra = id_compra;
        this.id_usuario = id_usuario;
        this.id_producto = id_producto;
        this.total = total;
        this.descuento = descuento;
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
    }
}
