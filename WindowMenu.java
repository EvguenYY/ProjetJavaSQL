package com.iia.btse2d.projetjavasqlp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;

public class WindowMenu {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowMenu windowMenu = new WindowMenu();
					windowMenu.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public WindowMenu() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenu newMenu = new JMenu("Menu");
		newMenu.setBounds(10, 0, 107, 22);
		frame.getContentPane().add(newMenu);
		
		JMenuItem newMenuItem = new JMenuItem("Ajouter");
		newMenu.add(newMenuItem);
		
		JSeparator separatorItem = new JSeparator();
		newMenu.add(separatorItem);
		
		JMenuItem newMenuItem1 = new JMenuItem("Modifier");
		newMenu.add(newMenuItem1);
		
		JSeparator separatorItem1 = new JSeparator();
		newMenu.add(separatorItem1);
		
		JMenuItem newMenuItem2 = new JMenuItem("Supprimer");
		newMenu.add(newMenuItem2);
		
		JSeparator separatorItem2 = new JSeparator();
		newMenu.add(separatorItem2);
		
		JMenuItem newMenuItem3 = new JMenuItem("Lecture");
		newMenu.add(newMenuItem3);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
