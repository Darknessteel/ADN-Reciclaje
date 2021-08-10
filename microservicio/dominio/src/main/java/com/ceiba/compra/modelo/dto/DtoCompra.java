package com.ceiba.compra.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class DtoCompra {
    private Long id_compra;
    private Long id_usuario;
    private Long id_producto;
    private Double total;
    private Double descuento;
    private String codigo;
    private LocalDate fechaCreacion;

}
