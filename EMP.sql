CREATE DATABASE IF NOT EXISTS EMP
character set UTF8 collate utf8_bin; 

USE EMP;

CREATE TABLE IF NOT EXISTS Employees (
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT
);

SELECT * FROM EMP.Employees;

INSERT INTO Employees (first_name, last_name, age) values 
('Paulina', 'Bury', 26),
('Bercik', 'Bercicki', 25),
('Adam', 'Nowak', 33),
('Alicja', 'Piasek', 22),
('Piotr', 'Dębski', 41);

INSERT INTO Employees(id, first_name, last_name, age) VALUES(6, "Test","Test2",99);
-- UPDATE Employees SET first_name="Test", last_name="Test2", age=99 WHERE id=1;
-- DELETE FROM Employees WHERE id=6;

