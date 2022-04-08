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
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Main {
	private static JTextField nameInput;
	private static JTextField addressInput;
	private static JRadioButton rentalYesRadio;
	private static JRadioButton rentalRadioNo;
	private static JRadioButton basicRadio;
	private static JRadioButton standardRadio;
	private static JRadioButton premiumRadio;
	private static ButtonGroup planRadioBtns;
	private static ButtonGroup rentalRadioBtns;

	public static void main(String[] args) {
		JFrame mainMenu = new JFrame();
		Dimension size
        = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)size.getWidth();
	    int height = (int)size.getHeight();
		mainMenu.setSize(553,488);
		mainMenu.setSize(width,height);
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
		
		JLabel titleLbl = new JLabel("Internet Service Plan Calculator");
		titleLbl.setFont(new Font("Calibri", Font.PLAIN, 48));
		north.add(titleLbl);
		
		JPanel west = new JPanel();
		mainMenu.getContentPane().add(west, BorderLayout.WEST);
		
		JPanel south = new JPanel();
		mainMenu.getContentPane().add(south, BorderLayout.SOUTH);
		
		JPanel center = new JPanel();
		mainMenu.getContentPane().add(center,BorderLayout.CENTER);
		GridBagLayout gbl_center = new GridBagLayout();
		gbl_center.columnWidths = new int[]{197, 31, 0, 0, 0, 86, 0};
		gbl_center.rowHeights = new int[]{20, 0, 0, 0, 0};
		gbl_center.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_center.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		center.setLayout(gbl_center);
		
		JLabel nameLbl = new JLabel("Name:");
		GridBagConstraints gbc_nameLbl = new GridBagConstraints();
		gbc_nameLbl.insets = new Insets(0, 0, 5, 5);
		gbc_nameLbl.gridx = 1;
		gbc_nameLbl.gridy = 0;
		center.add(nameLbl, gbc_nameLbl);
		
		nameInput = new JTextField();
		GridBagConstraints gbc_nameInput = new GridBagConstraints();
		gbc_nameInput.insets = new Insets(0, 0, 5, 5);
		gbc_nameInput.anchor = GridBagConstraints.NORTHWEST;
		gbc_nameInput.gridx = 2;
		gbc_nameInput.gridy = 0;
		center.add(nameInput, gbc_nameInput);
		nameInput.setColumns(10);
		
		JLabel invalidNameLbl = new JLabel("Invalid Input");
		invalidNameLbl.setEnabled(false);
		invalidNameLbl.setForeground(Color.RED);
		GridBagConstraints gbc_invalidNameLbl = new GridBagConstraints();
		gbc_invalidNameLbl.insets = new Insets(0, 0, 5, 0);
		gbc_invalidNameLbl.gridx = 5;
		gbc_invalidNameLbl.gridy = 0;
		center.add(invalidNameLbl, gbc_invalidNameLbl);
		
		JLabel addressLbl = new JLabel("Address:");
		GridBagConstraints gbc_addressLbl = new GridBagConstraints();
		gbc_addressLbl.anchor = GridBagConstraints.EAST;
		gbc_addressLbl.insets = new Insets(0, 0, 5, 5);
		gbc_addressLbl.gridx = 1;
		gbc_addressLbl.gridy = 1;
		center.add(addressLbl, gbc_addressLbl);
		
		addressInput = new JTextField();
		GridBagConstraints gbc_addressInput = new GridBagConstraints();
		gbc_addressInput.insets = new Insets(0, 0, 5, 5);
		gbc_addressInput.anchor = GridBagConstraints.WEST;
		gbc_addressInput.gridx = 2;
		gbc_addressInput.gridy = 1;
		center.add(addressInput, gbc_addressInput);
		addressInput.setColumns(10);
		
		JLabel InvalidAddressLbl = new JLabel("Invalid Input");
		InvalidAddressLbl.setEnabled(false);
		InvalidAddressLbl.setForeground(Color.RED);
		GridBagConstraints gbc_InvalidAddressLbl = new GridBagConstraints();
		gbc_InvalidAddressLbl.insets = new Insets(0, 0, 5, 0);
		gbc_InvalidAddressLbl.gridx = 5;
		gbc_InvalidAddressLbl.gridy = 1;
		center.add(InvalidAddressLbl, gbc_InvalidAddressLbl);
		
		JLabel planLbl = new JLabel("Plan");
		GridBagConstraints gbc_planLbl = new GridBagConstraints();
		gbc_planLbl.insets = new Insets(0, 0, 5, 5);
		gbc_planLbl.gridx = 1;
		gbc_planLbl.gridy = 2;
		center.add(planLbl, gbc_planLbl);
		
		basicRadio = new JRadioButton("Basic");
		GridBagConstraints gbc_basicRadio = new GridBagConstraints();
		gbc_basicRadio.insets = new Insets(0, 0, 5, 5);
		gbc_basicRadio.gridx = 2;
		gbc_basicRadio.gridy = 2;
		center.add(basicRadio, gbc_basicRadio);
		
		standardRadio = new JRadioButton("Standard");
		GridBagConstraints gbc_standardRadio = new GridBagConstraints();
		gbc_standardRadio.insets = new Insets(0, 0, 5, 5);
		gbc_standardRadio.gridx = 3;
		gbc_standardRadio.gridy = 2;
		center.add(standardRadio, gbc_standardRadio);
		
		premiumRadio = new JRadioButton("Premium");
		GridBagConstraints gbc_premiumRadio = new GridBagConstraints();
		gbc_premiumRadio.anchor = GridBagConstraints.EAST;
		gbc_premiumRadio.insets = new Insets(0, 0, 5, 5);
		gbc_premiumRadio.gridx = 4;
		gbc_premiumRadio.gridy = 2;
		center.add(premiumRadio, gbc_premiumRadio);
		
		planRadioBtns = new ButtonGroup();
		planRadioBtns.add(basicRadio);
		planRadioBtns.add(standardRadio);
		planRadioBtns.add(premiumRadio);
		gbc_invalidNameLbl.insets = new Insets(0, 0, 0, 5);
		gbc_invalidNameLbl.gridx = 1;
		gbc_invalidNameLbl.gridy = 3;
		
		JLabel invalidPlanLbl = new JLabel("Select One");
		invalidPlanLbl.setEnabled(false);
		invalidPlanLbl.setForeground(Color.RED);
		GridBagConstraints gbc_invalidPlanLbl = new GridBagConstraints();
		gbc_invalidPlanLbl.insets = new Insets(0, 0, 5, 0);
		gbc_invalidPlanLbl.gridx = 5;
		gbc_invalidPlanLbl.gridy = 2;
		center.add(invalidPlanLbl, gbc_invalidPlanLbl);
		
		JLabel rentalLbl = new JLabel("Rental");
		GridBagConstraints gbc_rentalLbl = new GridBagConstraints();
		gbc_rentalLbl.insets = new Insets(0, 0, 0, 5);
		gbc_rentalLbl.gridx = 1;
		gbc_rentalLbl.gridy = 3;
		center.add(rentalLbl, gbc_rentalLbl);
		
		rentalYesRadio = new JRadioButton("Yes");
		GridBagConstraints gbc_rentalYesRadio = new GridBagConstraints();
		gbc_rentalYesRadio.insets = new Insets(0, 0, 0, 5);
		gbc_rentalYesRadio.gridx = 2;
		gbc_rentalYesRadio.gridy = 3;
		center.add(rentalYesRadio, gbc_rentalYesRadio);
		
		rentalRadioNo = new JRadioButton("No");
		GridBagConstraints gbc_rentalRadioNo = new GridBagConstraints();
		gbc_rentalRadioNo.insets = new Insets(0, 0, 0, 5);
		gbc_rentalRadioNo.gridx = 3;
		gbc_rentalRadioNo.gridy = 3;
		center.add(rentalRadioNo, gbc_rentalRadioNo);
		
		rentalRadioBtns = new ButtonGroup();
		rentalRadioBtns.add(rentalRadioNo);
		
		rentalRadioBtns.add(rentalYesRadio);
		
		JLabel invalidRental = new JLabel("Select one");
		invalidRental.setEnabled(false);
		invalidRental.setForeground(Color.RED);
		GridBagConstraints gbc_invalidRental = new GridBagConstraints();
		gbc_invalidRental.gridx = 5;
		gbc_invalidRental.gridy = 3;
		center.add(invalidRental, gbc_invalidRental);
		
	
		
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(e -> exit());
		south.add(exit);
		
		JButton calculateBtn = new JButton("Calculate");
		calculateBtn.addActionListener(e ->calculate());
		south.add(calculateBtn);
		
		JButton clearBtn= new JButton("Clear");
		clearBtn.addActionListener(e->clear());
		south.add(clearBtn);
		
		JPanel east = new JPanel();
		mainMenu.getContentPane().add(east, BorderLayout.EAST);
		
		
		
		mainMenu.setVisible(true);
		
	}
	//functions to execute when button clicked
		public static void exit() {
			System.exit(0);
		}
		//function to calculate total price
		public static double getPrice(int plan,boolean rental) {
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
	    price*=1.0625;//tax
	    price = Math.round(price*100);
	    return price/100;//returns price before tax rounded to two decimal places
			
		}
		public static void tempFunc(){
	   System.out.println(getPrice(2,false)); System.out.println("Button clicked");
	  }
	  public static void clear(){
	   nameInput.setText("");
	   addressInput.setText(""); 
	   
	  }
	  
	  
	  public static void calculate(){//
		  //String name,String address, int planType,boolean rental
		String name = nameInput.getText();
		String addressData=addressInput.getText();
		int planType;
		String planString;
		boolean rental=false;
		boolean error = false;
		if(basicRadio.isSelected()) {
			planType=0;
			planString = "Basic";
		}else if(standardRadio.isSelected()) {
			planType=1;
			planString = "Standard";
		}else if(premiumRadio.isSelected()) {
			planType=2;
			planString = "Premium";
		}else {
			System.out.println("Plan Error");
			error = true;
			
		}
		
		if(rentalYesRadio.isSelected()) {
			rental = true;
		}else if(!rentalRadioNo.isSelected()) {
			error = true;
			System.out.println("rental error!");
		}
		System.out.println(addressData);
	    clear();
	    
	  } 
		
}

