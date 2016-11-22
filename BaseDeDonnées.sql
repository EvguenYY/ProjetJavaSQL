CREATE DATABASE ManageVehicule;

USE ManageVehicule;


CREATE TABLE Vehicule (
    Identifiant INT NOT NULL AUTO_INCREMENT ,
    Marque VARCHAR (100) NOT NULL ,
    Year INT NOT NULL ,
    Speed INT NOT NULL ,
    Modele VARCHAR (100) NOT NULL ,
    Colo VARCHAR (100) NOT NULL ,
    Price DECIMAL (8.0) NOT NULL,
    PRIMARY KEY (Vehicule_Id)
)
ENGINE = INNODB
