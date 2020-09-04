CREATE DATABASE IF NOT EXISTS Wydawnictwo
character set UTF8 collate urf8_bin;

USE Wydawnictwo;

CREATE TABLE IF NOT EXISTS Magazyny (ISSN INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
title VARCHAR (45),
type VARCHAR (45),
id_red INT,
id_second_red INT,
colored VARCHAR(45));

/*INSERT INTO Magazyny (title, type, id_red, id_second_red, colored) values
('Twoje Imperium', 'Tygodnik', 9, 10, 'Tak'),
('Viva', 'Miesiecznik', 11, 12, 'Tak'),
('Fakt', 'Dwutygodnik', 13, 14, 'Tak'),
('Pani Domu', 'Tygodnik', 15, 16, 'Nie');*/

SELECT * FROM Wydawnictwo.Magazyny;

CREATE TABLE IF NOT EXISTS Redaktorzy (
    ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    imie VARCHAR(45),
    nazwisko VARCHAR(45),
    czy_naczelny VARCHAR(3),
    data_rozpoczecia VARCHAR(10)
);


SELECT*FROM Wydawnictwo.Redaktorzy;
/*INSERT INTO Redaktorzy (imie, nazwisko, czy_naczelny, data_rozpoczecia) values
('Anna', 'Bąk', 'Tak', '1990-03-02'),
('Zofia', 'Trzmiel', 'Nie', '2002-01-03'),
('Tomasz', 'Gracz', 'Tak', '2010-08-25'),
('Zbigniew', 'Przegryw', 'Nie', '2000-11-05'),
('Karolina', 'Malec', 'Tak','1986-15-23'),
('Witold', 'Dłużyński', 'Nie', '2001-03-04'),
('Zofia', 'Trzmiel', 'Tak', '1982-06-03'),
('Dominik', 'Malinowski', 'Nie', '2010-06-07');

INSERT INTO Magazyny (ISSN, title, type, id_red, id_second_red, colored) values (1, 'aaa', 'bbb', 4, 5, 'ccc');
DELETE FROM Magazyny WHERE ISSN = 22;*/