package com.ceiba.compra.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.compra.modelo.entidad.Compra;
import com.ceiba.compra.puerto.repositorio.RepositorioCompra;
import com.ceiba.compra.servicio.testdatabuilder.CompraTestDataBuilder;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.producto.modelo.entidad.Producto;
import com.ceiba.producto.puerto.repositorio.RepositorioProducto;
import com.ceiba.producto.servicio.ServicioActualizarProducto;
import com.ceiba.producto.servicio.testdatabuilder.ProductoTestDataBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class ServicioActualizarCompraTest {
    @Test
    public void validarCompraExistenciaPreviaTest() {
    // arrange
    Compra compra = new CompraTestDataBuilder().conId_compra(1L).build();
    RepositorioCompra repositorioCompra = Mockito.mock(RepositorioCompra.class);
        Mockito.when(repositorioCompra.existeExcluyendoId(Mockito.anyLong(),Mockito.anyLong())).thenReturn(true);
    ServicioActualizarCompra servicioActualizarCompra = new ServicioActualizarCompra(repositorioCompra);
    // act - assert
        BasePrueba.assertThrows(() -> servicioActualizarCompra.ejecutar(compra), ExcepcionDuplicidad .class,"La compra ya existe en el sistema");
}
}
