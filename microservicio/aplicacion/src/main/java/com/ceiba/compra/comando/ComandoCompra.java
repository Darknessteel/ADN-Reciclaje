package com.ceiba.compra.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoCompra {
    private Long id_compra;
    private Long id_usuario;
    private Long id_producto;
    private Double total;
    private Double descuento;
    private String codigo;
    private LocalDate fecha;
}
