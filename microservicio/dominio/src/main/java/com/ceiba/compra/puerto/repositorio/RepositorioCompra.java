package com.ceiba.compra.puerto.repositorio;

import com.ceiba.compra.modelo.entidad.Compra;

public interface RepositorioCompra {
    /**
 * Permite crear una compra
 * @param compra
 * @return el id generado
 */
Long crear(Compra compra);

    /**
     * Permite actualizar una compra
     * @param compra
     */
    void actualizar(Compra compra);

    /**
     * Permite eliminar una compra
     * @param id_compra
     */
    void eliminar(Long id_compra);

    /**
     * Permite validar si existe una compra con un usuario
     * @param id_usuario
     * @return si existe o no
     */
    boolean existe(Long id_usuario);

    /**
     * Permite validar si existe una compra con un usuario excluyendo un id
     * @param id_usuario
     * @return si existe o no
     */
    boolean existeExcluyendoId(Long id_compra,Long id_usuario);
}
