//Project 2, Contestant 11
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.BoxLayout;

public class Main {
	public static void main(String[] args) {
		JFrame mainMenu = new JFrame();
		Dimension size
        = Toolkit.getDefaultToolkit().getScreenSize();
		mainMenu.setSize(1080,720);
		int width = (int)size.getWidth();
	    int height = (int)size.getHeight();
		int scale=width/height;
		mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainMenu.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		
		/*
		JButton calculate = new JButton("Calculate");
		horizontalBox.add(calculate);
		calculate.addActionListener(e -> exit());
		*/
		JLabel label = new JLabel("");
		mainMenu.getContentPane().add(label);
		
		JPanel north = new JPanel();
		mainMenu.getContentPane().add(north, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Internet Service Plan Calculator");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 48));
		north.add(lblNewLabel);
		
		JPanel west = new JPanel();
		mainMenu.getContentPane().add(west, BorderLayout.WEST);
		
		JPanel south = new JPanel();
		mainMenu.getContentPane().add(south, BorderLayout.SOUTH);
		
		JPanel center = new JPanel();
		mainMenu.getContentPane().add(center,BorderLayout.CENTER);
		center.setLayout(new BoxLayout(center, BoxLayout.X_AXIS));
		
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(e -> exit());
		south.add(exit);
		
		JButton Calculate = new JButton("Calculate");
		south.add(Calculate);
		
		JButton clear = new JButton("Clear");
		south.add(clear);
		
		JPanel east = new JPanel();
		mainMenu.getContentPane().add(east, BorderLayout.EAST);
		
		
		
		mainMenu.setVisible(true);
		
	}
	//functions to execute when button clicked
	public static void exit() {
		System.exit(0);
	}
	//function to calculate total price
	public double getPrice(int plan,boolean rental) {
		double price;
		switch(plan) {
		case 0://basic plan
				price = 39.99;
			break;
		case 1://standard plan
				price = 64.99;
			break;
		case 2://premium plan
				price = 89.99;
			break;
			default:
				price=0;
				break;
		}
		if(rental) {
			price+=12;
		}
		return price;//returns price before tax
		
	}
	
	public double round(double num) {
		return num%2;
	}
}
