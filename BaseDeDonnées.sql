CREATE DATABASE ManageVehicule;

USE ManageVehicule;


CREATE TABLE Vehicule (
	Vehicule_Id INT NOT NULL AUTO_INCREMENT ,
    Marque VARCHAR (100) NOT NULL ,
    Annee INT NOT NULL ,
    Vitesse INT NOT NULL ,
    Modele VARCHAR (100) NOT NULL ,
    Couleur VARCHAR (100) NOT NULL ,
    Prix DECIMAL (8.0) NOT NULL,
	PRIMARY KEY (Vehicule_Id)
)
ENGINE = INNODB