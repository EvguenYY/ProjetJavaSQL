package com.iia.btse2d.projetjavasql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowAjout {

	private JFrame frame;
	private JTextField textIdentifiant;
	private JTextField textModel;
	private JTextField textMarque;
	private JTextField textColor;
	private JTextField textYear;
	private JTextField textPrice;
	private JTextField textSpeed;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowAjout window = new WindowAjout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WindowAjout() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel labelAddVehicule = new JLabel("Ajout d'un vehicule");
		GridBagConstraints newlabelAddVehicule = new GridBagConstraints();
		newlabelAddVehicule.insets = new Insets(0, 0, 5, 5);
		newlabelAddVehicule.gridwidth = 3;
		newlabelAddVehicule.gridx = 0;
		newlabelAddVehicule.gridy = 0;
		frame.getContentPane().add(labelAddVehicule, newlabelAddVehicule);
		
		JLabel labelIdentifiant = new JLabel("Identifiant");
		GridBagConstraints newlabelIdentifiant = new GridBagConstraints();
		newlabelIdentifiant.anchor = GridBagConstraints.EAST;
		newlabelIdentifiant.insets = new Insets(0, 0, 5, 5);
		newlabelIdentifiant.gridx = 0;
		newlabelIdentifiant.gridy = 2;
		frame.getContentPane().add(labelIdentifiant, newlabelIdentifiant);
		
		textIdentifiant = new JTextField();
		GridBagConstraints textIdentifiantGrid = new GridBagConstraints();
		textIdentifiantGrid.anchor = GridBagConstraints.WEST;
		textIdentifiantGrid.insets = new Insets(0, 0, 5, 5);
		textIdentifiantGrid.gridx = 1;
		textIdentifiantGrid.gridy = 2;
		frame.getContentPane().add(textIdentifiant, textIdentifiantGrid);
		textIdentifiant.setColumns(10);
		
		JLabel labelModel = new JLabel("Model");
		GridBagConstraints newLabelModel = new GridBagConstraints();
		newLabelModel.anchor = GridBagConstraints.EAST;
		newLabelModel.insets = new Insets(0, 0, 5, 5);
		newLabelModel.gridx = 2;
		newLabelModel.gridy = 2;
		frame.getContentPane().add(labelModel, newLabelModel);
		
		textModel = new JTextField();
		GridBagConstraints textModelGrid = new GridBagConstraints();
		textModelGrid.anchor = GridBagConstraints.WEST;
		textModelGrid.insets = new Insets(0, 0, 5, 0);
		textModelGrid.gridx = 3;
		textModelGrid.gridy = 2;
		frame.getContentPane().add(textModel, textModelGrid);
		textModel.setColumns(10);
		
		JLabel LabelMarque = new JLabel("Marque");
		GridBagConstraints newLabelMarque = new GridBagConstraints();
		newLabelMarque.anchor = GridBagConstraints.EAST;
		newLabelMarque.insets = new Insets(0, 0, 5, 5);
		newLabelMarque.gridx = 0;
		newLabelMarque.gridy = 4;
		frame.getContentPane().add(LabelMarque, newLabelMarque);
		
		textMarque = new JTextField();
		GridBagConstraints textMarqueGrid = new GridBagConstraints();
		textMarqueGrid.anchor = GridBagConstraints.WEST;
		textMarqueGrid.insets = new Insets(0, 0, 5, 5);
		textMarqueGrid.gridx = 1;
		textMarqueGrid.gridy = 4;
		frame.getContentPane().add(textMarque, textMarqueGrid);
		textMarque.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Color");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 4;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textColor = new JTextField();
		GridBagConstraints textColorGrid = new GridBagConstraints();
		textColorGrid.anchor = GridBagConstraints.WEST;
		textColorGrid.insets = new Insets(0, 0, 5, 0);
		textColorGrid.gridx = 3;
		textColorGrid.gridy = 4;
		frame.getContentPane().add(textColor, textColorGrid);
		textColor.setColumns(10);
		
		JLabel labelYear = new JLabel("Year");
		GridBagConstraints newlabelYear = new GridBagConstraints();
		newlabelYear.anchor = GridBagConstraints.EAST;
		newlabelYear.insets = new Insets(0, 0, 5, 5);
		newlabelYear.gridx = 0;
		newlabelYear.gridy = 6;
		frame.getContentPane().add(labelYear, newlabelYear);
		
		textYear = new JTextField();
		GridBagConstraints textYearGrid = new GridBagConstraints();
		textYearGrid.anchor = GridBagConstraints.WEST;
		textYearGrid.insets = new Insets(0, 0, 5, 5);
		textYearGrid.gridx = 1;
		textYearGrid.gridy = 6;
		frame.getContentPane().add(textYear, textYearGrid);
		textYear.setColumns(10);
		
		JLabel labelPrice = new JLabel("Price");
		GridBagConstraints newlabelPrice = new GridBagConstraints();
		newlabelPrice.anchor = GridBagConstraints.EAST;
		newlabelPrice.insets = new Insets(0, 0, 5, 5);
		newlabelPrice.gridx = 2;
		newlabelPrice.gridy = 6;
		frame.getContentPane().add(labelPrice, newlabelPrice);
		
		textPrice = new JTextField();
		GridBagConstraints textPriceGrid = new GridBagConstraints();
		textPriceGrid.anchor = GridBagConstraints.WEST;
		textPriceGrid.insets = new Insets(0, 0, 5, 0);
		textPriceGrid.gridx = 3;
		textPriceGrid.gridy = 6;
		frame.getContentPane().add(textPrice, textPriceGrid);
		textPrice.setColumns(10);
		
		JLabel labelSpeed = new JLabel("Speed");
		GridBagConstraints newlabelSpeed = new GridBagConstraints();
		newlabelSpeed.anchor = GridBagConstraints.EAST;
		newlabelSpeed.insets = new Insets(0, 0, 5, 5);
		newlabelSpeed.gridx = 0;
		newlabelSpeed.gridy = 8;
		frame.getContentPane().add(labelSpeed, newlabelSpeed);
		
		textSpeed = new JTextField();
		GridBagConstraints textSpeedGrid = new GridBagConstraints();
		textSpeedGrid.anchor = GridBagConstraints.WEST;
		textSpeedGrid.insets = new Insets(0, 0, 5, 5);
		textSpeedGrid.gridx = 1;
		textSpeedGrid.gridy = 8;
		frame.getContentPane().add(textSpeed, textSpeedGrid);
		textSpeed.setColumns(10);
		
		JButton buttonAdd = new JButton("Ajouter");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int result = JOptionPane.showConfirmDialog(null, "Voulez vous ajouter ce véhicule ?", "Ajout du véhicule",
						JOptionPane.YES_NO_OPTION);
			}
			
			
		});
		GridBagConstraints buttonAddGrid = new GridBagConstraints();
		buttonAddGrid.insets = new Insets(0, 0, 0, 5);
		buttonAddGrid.gridx = 1;
		buttonAddGrid.gridy = 9;
		frame.getContentPane().add(buttonAdd, buttonAddGrid);
	}

}
