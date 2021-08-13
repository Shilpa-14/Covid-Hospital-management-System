package homepage;
import java.awt.*;  
import java.awt.event.*; 
import java.io.IOException;
import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
	public class Prevention  {
	       JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	     Prevention()      
	     { 
	    	 JFrame fprev = new JFrame();

	         fprev.setTitle("Prevention of covid-19");
	          
	         fprev.setSize(800,800);
	         fprev.setLocationRelativeTo(null);
	         fprev.setDefaultCloseOperation(EXIT_ON_CLOSE);
	         fprev.setVisible(true);
	   	
	   	
	         fprev.setLayout(new BorderLayout());
			 JLabel background=new JLabel(new ImageIcon("C:\\Users\\15DB1059TU (5GGD)\\Desktop\\Prevention1.png"));
			 fprev.add(background);
			 background.setLayout(new FlowLayout());
		
			 background.setSize(499,499);
			 background.setSize(500,500); 
			 fprev.getContentPane().setBackground(new Color(187, 220, 248));
			
	    }

 public static void main(String[] args) {
     
     // TODO code application logic here
     new Prevention();
     
 }

}