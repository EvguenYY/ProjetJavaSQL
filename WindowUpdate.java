package com.iia.btse2d.projetjavasql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowUpdate {

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
					WindowUpdate window = new WindowUpdate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public WindowUpdate() {
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
		
		JLabel labelmodifvehicule = new JLabel("Modification véhicule");
		GridBagConstraints modifvehicule = new GridBagConstraints();
		modifvehicule.insets = new Insets(0, 0, 5, 5);
		modifvehicule.gridx = 0;
		modifvehicule.gridy = 0;
		frame.getContentPane().add(labelmodifvehicule, modifvehicule);
		
		JLabel labelList = new JLabel("Liste véhicule");
		GridBagConstraints labelListVehicule = new GridBagConstraints();
		labelListVehicule.insets = new Insets(0, 0, 5, 5);
		labelListVehicule.gridx = 0;
		labelListVehicule.gridy = 1;
		frame.getContentPane().add(labelList, labelListVehicule);
		
		JList listvéhicule = new JList();
		GridBagConstraints listVehic = new GridBagConstraints();
		listVehic.insets = new Insets(0, 0, 5, 5);
		listVehic.fill = GridBagConstraints.BOTH;
		listVehic.gridx = 1;
		listVehic.gridy = 1;
		frame.getContentPane().add(listvéhicule, listVehic);
		
		JLabel labelId = new JLabel("Identifiant");
		GridBagConstraints newLabel = new GridBagConstraints();
		newLabel.anchor = GridBagConstraints.EAST;
		newLabel.insets = new Insets(0, 0, 5, 5);
		newLabel.gridx = 0;
		newLabel.gridy = 2;
		frame.getContentPane().add(labelId, newLabel);
		
		textIdentifiant = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		frame.getContentPane().add(textIdentifiant, gbc_textField);
		textIdentifiant.setColumns(10);
		
		JLabel labelModel = new JLabel("Model");
		GridBagConstraints newlabelModel = new GridBagConstraints();
		newlabelModel.anchor = GridBagConstraints.EAST;
		newlabelModel.insets = new Insets(0, 0, 5, 5);
		newlabelModel.gridx = 2;
		newlabelModel.gridy = 2;
		frame.getContentPane().add(labelModel, newlabelModel);
		
		textModel = new JTextField();
		GridBagConstraints textModelGrid = new GridBagConstraints();
		textModelGrid.insets = new Insets(0, 0, 5, 0);
		textModelGrid.fill = GridBagConstraints.HORIZONTAL;
		textModelGrid.gridx = 3;
		textModelGrid.gridy = 2;
		frame.getContentPane().add(textModel, textModelGrid);
		textModel.setColumns(10);
		
		JLabel labelMarque = new JLabel("Marque");
		GridBagConstraints newlabelMarque = new GridBagConstraints();
		newlabelMarque.anchor = GridBagConstraints.EAST;
		newlabelMarque.insets = new Insets(0, 0, 5, 5);
		newlabelMarque.gridx = 0;
		newlabelMarque.gridy = 4;
		frame.getContentPane().add(labelMarque, newlabelMarque);
		
		textMarque = new JTextField();
		GridBagConstraints textMarqueGrid = new GridBagConstraints();
		textMarqueGrid.anchor = GridBagConstraints.WEST;
		textMarqueGrid.insets = new Insets(0, 0, 5, 5);
		textMarqueGrid.gridx = 1;
		textMarqueGrid.gridy = 4;
		frame.getContentPane().add(textMarque, textMarqueGrid);
		textMarque.setColumns(10);
		
		JLabel labelColor = new JLabel("Color");
		GridBagConstraints newlabelColor = new GridBagConstraints();
		newlabelColor.anchor = GridBagConstraints.EAST;
		newlabelColor.insets = new Insets(0, 0, 5, 5);
		newlabelColor.gridx = 2;
		newlabelColor.gridy = 4;
		frame.getContentPane().add(labelColor, newlabelColor);
		
		textColor = new JTextField();
		GridBagConstraints textColorGrid = new GridBagConstraints();
		textColorGrid.insets = new Insets(0, 0, 5, 0);
		textColorGrid.fill = GridBagConstraints.HORIZONTAL;
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
		textYearGrid.insets = new Insets(0, 0, 5, 5);
		textYearGrid.anchor = GridBagConstraints.WEST;
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
		textPriceGrid.insets = new Insets(0, 0, 5, 0);
		textPriceGrid.fill = GridBagConstraints.HORIZONTAL;
		textPriceGrid.gridx = 3;
		textPriceGrid.gridy = 6;
		frame.getContentPane().add(textPrice, textPriceGrid);
		textPrice.setColumns(10);
		
		JLabel LabelSpeed = new JLabel("Speed");
		GridBagConstraints newlabelSpeed = new GridBagConstraints();
		newlabelSpeed.anchor = GridBagConstraints.EAST;
		newlabelSpeed.insets = new Insets(0, 0, 5, 5);
		newlabelSpeed.gridx = 0;
		newlabelSpeed.gridy = 8;
		frame.getContentPane().add(LabelSpeed, newlabelSpeed);
		
		textSpeed = new JTextField();
		GridBagConstraints textSpeedGrid = new GridBagConstraints();
		textSpeedGrid.insets = new Insets(0, 0, 5, 5);
		textSpeedGrid.anchor = GridBagConstraints.WEST;
		textSpeedGrid.gridx = 1;
		textSpeedGrid.gridy = 8;
		frame.getContentPane().add(textSpeed, textSpeedGrid);
		textSpeed.setColumns(10);
		
		JButton buttonModif = new JButton("Modifier");
		buttonModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Souhaitez vous modifier ce véhicule ?", "Modification du véhicule",
						JOptionPane.YES_NO_OPTION);
			}
		});
		GridBagConstraints buttonModifierGrid = new GridBagConstraints();
		buttonModifierGrid.gridx = 3;
		buttonModifierGrid.gridy = 9;
		frame.getContentPane().add(buttonModif, buttonModifierGrid);
	}

}
