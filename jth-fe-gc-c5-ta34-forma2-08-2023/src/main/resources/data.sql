
DROP table IF EXISTS empleados;

create table empleados (
	id int auto_increment,
	nombre varchar(250),
	trabajo ENUM('PROGRAMADOR', 'BOMBERO', 'JUEZ', 'PESCADERO'),
	salario double
);

insert into empleados (nombre, trabajo, salario) values ('Joel', 'PROGRAMADOR', 2000);
insert into empleados (nombre, trabajo, salario) values ('Laura', 'JUEZ', 5000);
insert into empleados (nombre, trabajo, salario) values ('Antonio', 'BOMBERO', 3000);
insert into empleados (nombre, trabajo, salario) values ('Oscar', 'JUEZ', 5000);
insert into empleados (nombre, trabajo, salario) values ('Alex', 'PESCADERO', 1000);
insert into empleados (nombre, trabajo, salario) values ('Alba', 'BOMBERO', 3000);