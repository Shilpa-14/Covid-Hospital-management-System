package homepage;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.*; 

public class Homepage {
	JButton btn1, btn2,btn3,btn4,btn5;
	private JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	private JFrame f;
	Homepage(){
		f=new JFrame();
		f.setTitle("Home Page");
		JLabel l1 = new JLabel("Get Covid-19 Related Information Here");
		l1.setBounds(50,0,560,50);
		f.add(l1);
		Font f1 = new Font("Arial",Font.BOLD,28);
        l1.setFont(f1);
		
		btn1 = new JButton("Administrator Login");  
        btn2 = new JButton("Patient Form");
        btn3 = new JButton("Symptoms");
        btn4 = new JButton("Prevention");
        btn1.setBounds(20,50,150,50);
        btn2.setBounds(170,50,150,50);
        btn3.setBounds(320,50,150,50);
        btn4.setBounds(470,50,150,50);
        
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.setSize(700,800);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
        Font f4 = new Font("Arial",Font.BOLD,18);
        
        JLabel l2 = new JLabel("Know about Number of cases and hospital in your area here:");
		l2.setBounds(20,160,650,50);
		f.add(l2);
        l2.setFont(f4);
        
        JLabel l3 = new JLabel("Enter City");
        l3.setBounds(30, 228,160,30);
        f.add(l3);
        l3.setFont(f4);
        
        tf1 = new JTextField();
    	tf1.setBounds(125, 230,160,30);
    	f.add(tf1);
    	tf1.setColumns(10);
		
    	JLabel l4 = new JLabel("Enter Area");
        l4.setBounds(400, 228,160,30);
        f.add(l4);
        l4.setFont(f4);
        
        tf2 = new JTextField();
    	tf2.setBounds(496, 230,160,30);
    	f.add(tf2);
    	tf2.setColumns(10);
    	
    	btn5=new JButton("Go");
    	btn5.setBounds(280, 300,160,30);
    	f.add(btn5);
    	btn5.setFont(f4);
    	
    	JLabel l5 = new JLabel("Total Cases:");
    	l5.setBounds(30,360,160, 30);
    	f.add(l5);
    	l5.setFont(f4);
    		
    	tf3 = new JTextField();
    	tf3.setBounds(145,357,160, 30);
    	f.add(tf3);
    	tf3.setColumns(10);
    	
    	JLabel l6 = new JLabel("Recovered:");
    	l6.setBounds(30,400,160, 30);
    	f.add(l6);
    	l6.setFont(f4);
    	
    	tf4 = new JTextField();
    	tf4.setBounds(145,397,160, 30);
    	f.add(tf4);
    	tf4.setColumns(10);
    	
    	JLabel l7 = new JLabel("Deaths:");
    	l7.setBounds(30,440,160, 30);
    	f.add(l7);
    	l7.setFont(f4);
    	
    	tf5 = new JTextField();
    	tf5.setBounds(145,437,160, 30);
    	f.add(tf5);
    	tf5.setColumns(10);
    	
    	JLabel l8 = new JLabel("Hospital:");
    	l8.setBounds(30,480,160, 30);
    	f.add(l8);
    	l8.setFont(f4);
    	
    	tf6 = new JTextField();
    	tf6.setBounds(145,477,160, 30);
    	f.add(tf6);
    	tf6.setColumns(10);
    	
    	JLabel l9 = new JLabel("Active Cases:");
    	l9.setBounds(24,520,160, 30);
    	f.add(l9);
    	l9.setFont(f4);
    	
    	tf7 = new JTextField();
    	tf7.setBounds(148,517,160, 30);
    	f.add(tf7);
    	tf7.setColumns(10);
    	 JLabel background=new JLabel(new ImageIcon("C:\\Users\\15DB1059TU (5GGD)\\Desktop\\homepg.png"));
		 f.add(background);
		 background.setLayout(new FlowLayout());
	
		 background.setBounds(10,90, 650,600);
		 //background.setSize(500,500); 
    	f.getContentPane().setBackground(new Color(187, 220, 248));
    	btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()==btn2)
				{
					new Patient();
					//f.dispose();
				}
			}
		});
    	btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()==btn1)
				{
					new Admin();
					//f.dispose();
				}
			}
		});
    	btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()==btn3)
				{
					new Symptoms();
				}
			}
		});
    	btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()==btn4)
				{
					new Prevention();
					
				}
			}
		});
    	btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String city = tf1.getText();
                String area = tf2.getText(); 
                int n1=0,n2=0,n3=0,n4=0,n6=0,cn1=0,cn2=0,cn3=0,cn4=0,cn5=0;
                String n5="",hp1="",hp2="";
               
                

				try{
					String connString = "jdbc:sqlserver://LAPTOP-NUUHFJ1O;username=sa;Password=shi@14801;";
					Connection conn = DriverManager.getConnection(connString);
					Statement stmt=conn.createStatement();
					if(tf2.getText().length()!=0)
					{
						String q1 = "Select area_no from Area where area_name='"+area+"'";
						ResultSet r1=stmt.executeQuery(q1);
		                while(r1.next())
		                {
		                	 n1=r1.getInt(1);
		                	
		                	System.out.println(n1);
		                }
		                String q2 = "Select * from cases where area_no="+n1;
						ResultSet r2=stmt.executeQuery(q2);
						while(r2.next())
						{
							n2=r2.getInt(1);//no of cases
							n3=r2.getInt(2);//deaths
							n4=r2.getInt(3);//recovered
							n6=n2-(n3+n4);
						}
						String s = Integer.toString(n2);
						tf3.setText(s);
						String s2=Integer.toString(n3);
						tf5.setText(s2);
						String s3=Integer.toString(n4);
						tf4.setText(s3);
						String s4=Integer.toString(n6);
						tf7.setText(s4);
						String q3 = "Select hosp_name from Hospital where area_no="+n1;
						ResultSet r3=stmt.executeQuery(q3);
						while(r3.next())
						{
							n5=r3.getString(1);
						}
						tf6.setText(n5);
						if(n6>50) {
							JOptionPane.showMessageDialog(null,"Avoid going to this area since it has more Covide-19 Cases!!");
						}
						else {
							JOptionPane.showMessageDialog(null,"The area is safe!!");
						}
						r1.close();
					}
					else {
					String cq1="Select city_no from City where city_name='"+city+"'";
					ResultSet cr1=stmt.executeQuery(cq1);
					while(cr1.next())
	                {
	                	cn1=cr1.getInt(1);
	                	System.out.println(cn1);
	                }
					 String cq2="select sum(No_of_cases),sum(Deaths),sum(Recovered) from Cases where city_no="+cn1+" group by city_no";
		                ResultSet cr2=stmt.executeQuery(cq2);
		                while(cr2.next())
		                {
		                	cn2=cr2.getInt(1);//no of cases
							cn3=cr2.getInt(2);//deaths
							cn4=cr2.getInt(3);//recovered
							cn5=cn2-(cn3+cn4);
		                }
		                String cs = Integer.toString(cn2);
						tf3.setText(cs);
						String cs2=Integer.toString(cn3);
						tf5.setText(cs2);
						String cs3=Integer.toString(cn4);
						tf4.setText(cs3);
						String cs4=Integer.toString(cn5);
						tf7.setText(cs4);
						String cq7 = "Select hosp_name from Hospital where city_no="+cn1;
						ResultSet cr7=stmt.executeQuery(cq7);
						if(cr7.next())
						{
							hp1=cr7.getString(1);
							System.out.println("hp1="+hp1);
						}
						if(cr7.next())
						{
							hp2=cr7.getString(1);
							System.out.println("hp2="+hp2);
						}
						String hospital=hp1+","+hp2;
						tf6.setText(hospital);
						if(cn5>50) {
							JOptionPane.showMessageDialog(null,"Avoid going to this city since it has more Covide-19 Cases!!");
						}
						else {
							JOptionPane.showMessageDialog(null,"The city is safe!!");
						}
						cr1.close();
					
				 }   
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
                            
                        
                        
            }          
        });
       
        
		
	}
	public static void main(String[] args) {
		new Homepage();

	}

}