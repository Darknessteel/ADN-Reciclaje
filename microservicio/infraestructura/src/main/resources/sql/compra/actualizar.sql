update producto
set id_usuario = :id_usuario,
	id_producto = :id_producto,
	total = :total,
	descuento = :descuento,
	codigo = :codigo,
	fecha_creacion = :fechaCreacion
where id_compra = :id_compra