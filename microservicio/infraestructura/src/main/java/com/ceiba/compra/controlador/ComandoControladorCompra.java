package com.ceiba.compra.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.compra.comando.ComandoCompra;
import com.ceiba.compra.comando.manejador.ManejadorActualizarCompra;
import com.ceiba.compra.comando.manejador.ManejadorCrearCompra;
import com.ceiba.compra.comando.manejador.ManejadorEliminarCompra;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
@Api(tags = { "Controlador comando compra"})
public class ComandoControladorCompra {
    private final ManejadorCrearCompra manejadorCrearCompra;
    private final ManejadorEliminarCompra manejadorEliminarCompra;
    private final ManejadorActualizarCompra manejadorActualizarCompra;

    @Autowired
    public ComandoControladorCompra(ManejadorCrearCompra manejadorCrearCompra,
                                      ManejadorEliminarCompra manejadorEliminarCompra,
                                      ManejadorActualizarCompra manejadorActualizarCompra) {
        this.manejadorCrearCompra = manejadorCrearCompra;
        this.manejadorEliminarCompra = manejadorEliminarCompra;
        this.manejadorActualizarCompra = manejadorActualizarCompra;
    }

    @PostMapping
    @ApiOperation("Crear Compra")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoCompra comandoCompra) {
        return manejadorCrearCompra.ejecutar(comandoCompra);
    }

    @DeleteMapping(value="/{id_compra}")
    @ApiOperation("Eliminar Compra")
    public void eliminar(@PathVariable Long id_compra) {
        manejadorEliminarCompra.ejecutar(id_compra);
    }

    @PutMapping(value="/{id_compra}")
    @ApiOperation("Actualizar Compra")
    public void actualizar(@RequestBody ComandoCompra comandoCompra,@PathVariable Long id_compra) {
        comandoCompra.setId_compra(id_compra);
        manejadorActualizarCompra.ejecutar(comandoCompra);
    }
}
