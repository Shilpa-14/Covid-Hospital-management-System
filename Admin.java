package homepage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class Admin 
{
    JTextField t1,t2;
     JLabel l1,l2,l3;
     JButton b1;
     

     Admin()
     {
          Font f1=new Font("Times new Roman",Font.BOLD,12);
      
          l1=new JLabel("Admin id:");
          t1=new JTextField();
          l1.setFont(f1);
          l2=new JLabel("Password:");
          t2=new JPasswordField();
          l2.setFont(f1);
    
	        l1.setBounds(50,50,150,20); 
	        t1.setBounds(50,100,150,30);
	        l1.setSize(100,50);
	        t1.setSize(100,50);
	
	        l2.setBounds(50,150,150,30); 
	        t2.setBounds(50,200,150,30); 
	        l2.setSize(100,50);
     
	        t2.setSize(100,50);
	
	        b1=new JButton("Login");
	        b1.setBounds(50,300,150,20);
	        b1.setSize(120,50);
	        
	        JButton back=new JButton("Go back");  
			back.setBounds(220,300,50,50); 
			back.setSize(120,50); 
	        
	        JFrame f=new JFrame();
	        f.add(l1);
	        f.add(l2);
	        f.add(t1);
	        f.add(t2);
	        f.add(b1);
	        f.add(back);
	        f.setSize(600, 600);
	        f.setLayout(null);
	        f.setVisible(true);
	        f.getContentPane().setBackground(new Color(187, 220, 248));
	        back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{ 
					new Homepage();
				}
			});
	        b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{ 
			        Font f2=new Font("Times new Roman",Font.BOLD,12);
			        int id= Integer.parseInt(t1.getText());
			        t1.setFont(f2);
			        t1.setText(String.valueOf(id));
			
			        String password=t2.getText();
			        t2.setFont(f2); 
			        t2.setText(password);
			        String query="Select Fname from administrator where Admin_id="+id+"and Password='"+password+"'";

		         try{
		        	 	String connString = "jdbc:sqlserver://LAPTOP-NUUHFJ1O;username=sa;Password=shi@14801;";
					    Connection conn = DriverManager.getConnection(connString);
				        Statement st=conn.createStatement();
				        ResultSet rs=st.executeQuery(query);
				        if(rs.next()){
				        	String name=rs.getString(1);
					        System.out.println(name);
					        
					        JOptionPane.showMessageDialog(null,"Successfully logged in as "+name,"Alert",JOptionPane.WARNING_MESSAGE);
					        
					        if(e.getSource()==b1)
							{
								new AfteradminLogin();
								f.dispose();
							}
				        }
				        else {
				        	JOptionPane.showMessageDialog(null,"Login unsucessful.Please enter a valid username or password.","Alert",JOptionPane.WARNING_MESSAGE);
				        }
		                
		                
		            }
		            catch(SQLException e1){
		                System.out.println(e1);
		            }       
		        
		      	}   
		    
		     });
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Admin();
	}

}