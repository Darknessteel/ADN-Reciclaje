create table usuario (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 clave varchar(45) not null,
 fecha_creacion datetime null,
 primary key (id)
);
create table producto (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 valor varchar(45) not null,
 fecha_creacion date null,
 primary key (id)
);

create table compra (
  id_compra int(11) not null auto_increment,
  id_usuario int(11) not null,
  id_producto int(11) not null,
  total float not null,
  descuento float not null,
  codigo varchar(100) null,
  fecha datetime NULL,
  primary key (id_compra),
  constraint fk_compra_usuario1
    foreign key (id_usuario)
    references usuario (id)
    on delete no action
    on update no action,
   constraint fk_compra_producto1
   foreign key (id_producto)
   references producto (id)
    on delete no action
    on update no action
);

