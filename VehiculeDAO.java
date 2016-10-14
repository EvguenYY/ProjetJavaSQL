package com.iia.btse2d.projetjavasql.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iia.btse2d.projetjavasql.entity.Vehicule;

public class VehiculeDAO implements IDao<Vehicule> {

	private static final String MARQUE = "marque";
	private static final String MODELE = "modele";
	private static final String PRICE = "price";
	private static final String SPEED = "speed";
	private static final String YEAR = "year";
	private static final String COLOR = "color";
	private static final String ID = "id";
	private static final String TABLENAME = "vehicule";


	@Override
	public boolean create(Vehicule object) {
		String req = "INSERT INTO " + VehiculeDAO.TABLENAME + " (" + VehiculeDAO.MARQUE + ", " + VehiculeDAO.MODELE 
				+ VehiculeDAO.PRICE + " , " + VehiculeDAO.SPEED + " , " + VehiculeDAO.YEAR + " ' "
				+ VehiculeDAO.COLOR
				+ ") VALUES ('" + object.getMarque() + "','" + object.getModel() + 
				"','" + object.getPrice() + "','" + object.getSpeed() +
				"','" + object.getYear() + "','" + object.getColor() + "')";

		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			if (st.executeUpdate() == 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("erreur lors de l'insertion du véhicule");
		}

		return false;
	}

	@Override
	public boolean update(Vehicule object) {
		String req = String.format("UPDATE %s SET %s=%s, %s=%s WHERE %s=?",
				VehiculeDAO.TABLENAME,
				VehiculeDAO.MARQUE,
				object.getMarque(),
				VehiculeDAO.MODELE,
				object.getModel(),
				VehiculeDAO.PRICE,
				object.getPrice(),
				VehiculeDAO.SPEED,
				object.getSpeed(),
				VehiculeDAO.YEAR,
				object.getYear(),
				VehiculeDAO.COLOR,
				object.getColor(),
				VehiculeDAO.ID);
		
		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			st.setInt(1, object.getId());
			if (st.executeUpdate() >= 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("erreur lors de la mise à jour du véhicule");
		}

		return false;
	}

	@Override
	public boolean delete(Vehicule object) {
		String req = String.format("DELETE FROM %s WHERE %s=?",
				VehiculeDAO.TABLENAME,
				VehiculeDAO.ID);

		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			st.setInt(1, object.getId());
			if (st.executeUpdate() >= 1) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("erreur lors de la suppression du véhicule");
		}

		return false;
	}

	@Override
	public Vehicule findById(int id) {
		String req = String.format("SELECT * FROM %s WHERE %s=%d", VehiculeDAO.TABLENAME, VehiculeDAO.ID, id);

		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				return this.cursorToVehicule(rs);
			}
		} catch (SQLException e) {
			System.out.println("erreur lors de la récupération du véhicule");
		}
		return null;
	}

	@Override
	public List<Vehicule> findAll() {
		List<Vehicule> vehicules = new ArrayList<Vehicule>();

		String req = String.format("SELECT * FROM %s", VehiculeDAO.TABLENAME);

		try {
			PreparedStatement st = Connexion.getConnection().prepareStatement(req);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				vehicules.add(this.cursorToVehicule(rs));
			}

			return vehicules;

		} catch (SQLException e) {
			System.out.println("erreur lors de la récupération des vehicules");
		}

		return null;
	}

	private Vehicule cursorToVehicule(ResultSet resultSet) {
		Vehicule vehicule = null;
		try {
			vehicule = new Vehicule();
			vehicule.setId(resultSet.getInt(VehiculeDAO.ID));
			vehicule.setMarque(resultSet.getString(VehiculeDAO.MARQUE));
			vehicule.setModel(resultSet.getString(VehiculeDAO.MODELE));
			vehicule.setPrice(resultSet.getInt(VehiculeDAO.PRICE));
			vehicule.setSpeed(resultSet.getInt(VehiculeDAO.SPEED));
			vehicule.setYear(resultSet.getInt(VehiculeDAO.YEAR));
			vehicule.setColor(resultSet.getString(VehiculeDAO.COLOR));
		} catch (SQLException e) {
			System.out.println("erreur lors de la récupération du vehicule");
		}

		return vehicule;
	}
}