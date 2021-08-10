package com.ceiba.compra.servicio;

import com.ceiba.compra.modelo.entidad.Compra;
import com.ceiba.compra.puerto.repositorio.RepositorioCompra;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;

public class ServicioCrearCompra {
    private static final String LA_COMPRA_YA_EXISTE_EN_EL_SISTEMA = "El producto ya existe en el sistema";

    private final RepositorioCompra repositorioCompra;

    public ServicioCrearCompra(RepositorioCompra repositorioCompra) {
        this.repositorioCompra = repositorioCompra;
    }

    public Long ejecutar(Compra compra) {
        validarExistenciaPrevia(compra);
        return this.repositorioCompra.crear(compra);
    }

    private void validarExistenciaPrevia(Compra compra) {
        boolean existe = this.repositorioCompra.existe(compra.getId_usuario());
        if(existe) {
            throw new ExcepcionDuplicidad(LA_COMPRA_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
