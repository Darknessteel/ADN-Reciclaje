package com.ceiba.producto.modelo.entidad;

import lombok.Getter;

import java.time.LocalDate;


import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;

@Getter
public class Producto {
    private String SE_DEBE_INGRESAR_LA_FECHA_CREACION = "Se debe ingresar la fecha de creación";

    private String SE_DEBE_INGRESAR_EL_VALOR = "Se debe ingresar el valor";
    private String SE_DEBE_INGRESAR_EL_NOMBRE_DE_PRODUCTO = "Se debe ingresar el nombre de producto";

    private Long id;
    private String nombre;
    private String valor;
    private LocalDate fechaCreacion;

    public Producto(Long id, String nombre, String valor, LocalDate fechaCreacion) {
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_PRODUCTO);
        validarObligatorio(valor, SE_DEBE_INGRESAR_EL_VALOR);

        validarObligatorio(fechaCreacion, SE_DEBE_INGRESAR_LA_FECHA_CREACION);

        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.fechaCreacion = fechaCreacion;
    }
}
