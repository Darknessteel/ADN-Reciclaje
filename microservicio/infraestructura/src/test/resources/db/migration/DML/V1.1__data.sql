insert into usuario(nombre,clave,fecha_creacion) values('test','1234',now());
insert into producto(nombre,valor,fecha_creacion) values('test_producto','54321',now());
insert into compra(id_usuario,id_producto,total,descuento,codigo,fecha) values(1,1,54321,10,'7b458657',now());