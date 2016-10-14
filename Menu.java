package com.iia.btse2d.projetjavasql;

import java.util.List;

import com.iia.btse2d.projetjavasql.dao.VehiculeDAO;
import com.iia.btse2d.projetjavasql.dao.Connexion;
import com.iia.btse2d.projetjavasql.entity.Vehicule;

public class Menu {

	public static void main(String[] args) {
		//Création du vehicule DAO
		VehiculeDAO cDao = new VehiculeDAO();
		
		//Retrieve single vehicule
		Vehicule vehicule = (Vehicule) cDao.findById(2);
		System.out.println(vehicule.getMarque());
		
		//Update vehicule
		vehicule.setMarque("Citroen");
		vehicule.setModel("Picasso");
		vehicule.setPrice(3000);
		vehicule.setSpeed(200);
		vehicule.setYear(2005);
		vehicule.setColor("red");
		boolean result = cDao.update(vehicule);
		System.out.println("resultat : " + result);
		
		//Create vehicule
		Vehicule newVehicule = new Vehicule();
		vehicule.setMarque("bidule");
		vehicule.setModel("bidule");
		vehicule.setPrice(2500);
		vehicule.setSpeed(180);
		vehicule.setYear(2001);
		vehicule.setColor("blue");
		result = cDao.create(newVehicule);
		
		System.out.println("resultat : " + result);
		
		//Remove vehicule
		result = cDao.delete(vehicule);
		System.out.println("resultat : " + result);
		
		//Retrieve all
		List<Vehicule> vehicules = cDao.findAll();
		for (Vehicule vehicules2 : vehicules) {
			System.out.println(vehicules2.getId());
		}
		
		Connexion.close();
	}

	
}
