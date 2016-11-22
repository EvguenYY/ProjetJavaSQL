package com.iia.shop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowSupprimer {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowSupprimer window = new WindowSupprimer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public WindowSupprimer() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelVehicule = new JLabel("Liste véhicules");
		labelVehicule.setBounds(10, 22, 85, 14);
		frame.getContentPane().add(labelVehicule);
		
		JList list = new JList();
		list.setBounds(116, 22, 143, 14);
		frame.getContentPane().add(list);
		
		JButton buttonDelete = new JButton("Supprimer ");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Souhaitez vous supprimer ce véhicule ?", "Suppression du véhicule",
						JOptionPane.YES_NO_OPTION);
			}
		});
		buttonDelete.setBounds(30, 107, 89, 23);
		frame.getContentPane().add(buttonDelete);
	}

}
