create database Netfils;

use Netfils;

CREATE TABLE peliculas (
    pin INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255)not null,
	clasificacion VARCHAR(255)not null,
    duracion time not null,
    director VARCHAR(255)not null,
    estreno time(6)not null
    
    
    
);

CREATE TABLE series (
    pin INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255)not null,
    genero VARCHAR(255)not null,
    temporadas INT not null ,
    capitulos int not null,
	duracion time(6)not null
    
    
);

CREATE TABLE clientes (
    cedula INT PRIMARY KEY AUTO_INCREMENT,
    nombreC varchar(255)not null unique,
    nombre varchar(255)not null,
    direccion VARCHAR(255)not null,
    contraseña varchar(255)not null,
    tarjeta int(16) not null,
    pin int (4) not null,
    plan int(1) not null
    
    
);
select * from clientes;
