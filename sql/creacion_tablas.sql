-- sql
-- CREACIÓN DE LA BASE DE DATOS Y LAS TABLAS NECESARIAS PARA EL SISTEMA DE GESTIÓN Y CONTROL DE HERRAMIENTAS

-- Crear tabla de herramientas
CREATE TABLE herramientas (
    id INT PRIMARY KEY AUTO_INCREMENT,  -- La columna 'id' es clave primaria y auto-incrementable
    nombre VARCHAR(100) NOT NULL,       -- Nombre de la herramienta
    categoria_id INT,                   -- Relacionada con la tabla de categorías (si existe)
    estado VARCHAR(50),                 -- Estado de la herramienta (por ejemplo, 'Disponible', 'En reparación')
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)  -- Relaciona con la tabla 'categorias', si existe
);

-- Crear tabla de usuarios
CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,  -- La columna 'id' es clave primaria y auto-incrementable
    nombre VARCHAR(100) NOT NULL,       -- Nombre del usuario
    tipo VARCHAR(50)                    -- Tipo de usuario ('Estudiante', 'Administrador', etc.)
);

-- Crear tabla de préstamos
CREATE TABLE prestamos (
    id INT PRIMARY KEY AUTO_INCREMENT,  -- La columna 'id' es clave primaria y auto-incrementable
    herramienta_id INT,                 -- ID de la herramienta prestada
    usuario_id INT,                     -- ID del usuario que solicita el préstamo
    fecha_prestamo DATETIME,            -- Fecha en la que se realizó el préstamo
    fecha_devolucion DATETIME,          -- Fecha en la que se debe devolver la herramienta
    FOREIGN KEY (herramienta_id) REFERENCES herramientas(id),  -- Relaciona con la tabla 'herramientas'
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)           -- Relaciona con la tabla 'usuarios'
);

-- Opcional: Si se tiene una tabla de categorías de herramientas, la puedes crear como sigue:
-- CREATE TABLE categorias (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     nombre VARCHAR(100) NOT NULL
-- );
