package com.ceiba.producto.comando;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoProducto {
    private Long id;
    private String nombre;
    private String valor;
    private LocalDate fecha;
}
