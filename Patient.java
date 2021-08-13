package homepage;
import java.awt.*;  
import java.awt.event.*; 
import javax.swing.*;
import java.sql.*;

public class Patient 
{
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JRadioButton male,female;
    JComboBox cb;
    
    public boolean validate(){
    	  System.out.println("in validate");
    	  
    	  if(tf1.getText().length()==0){
    		// System.out.println("in tf1");
    	     return false;
    	     
    	  }
    	  else if(tf2.getText().length()==0){
    		 //System.out.println("in tf2");
    		return false;
    	    //field2.setBackground(Color.red);
    	  }
    	  else if(tf3.getText().length()==0){
    		 //System.out.println("in tf3");
    		return false;
    	    //field2.setBackground(Color.red);
    	  }
    	  else if(tf4.getText().length()==0){
     		 //System.out.println("in tf2");
     		return false;
     	    //field2.setBackground(Color.red);
     	  }
     	  else if(tf5.getText().length()==0){
     		 //System.out.println("in tf3");
     		return false;
     	    //field2.setBackground(Color.red);
     	  }
     	 else if(tf6.getText().length()==0){
     		 //System.out.println("in tf2");
     		return false;
     	    //field2.setBackground(Color.red);
     	  }
     	  else if(tf7.getText().length()==0){
     		 //System.out.println("in tf3");
     		return false;
     	    //field2.setBackground(Color.red);
     	  }
    	  else {
    		  return true;
    	  }
    	}
 
	Patient()
	{  
		Font ft=new Font("Arial",Font.BOLD,14);
		
		l1=new JLabel("First name:");
		tf1=new JTextField(); 
		l1.setFont(ft); 
		l2=new JLabel("Middle name:");
		tf2=new JTextField(); 
		l2.setFont(ft);  
		l3=new JLabel("Last name:");
		tf3=new JTextField();  
		l3.setFont(ft); 
		l4=new JLabel("Phone number:");
		tf4=new JTextField(); 
		l4.setFont(ft); 
		l5=new JLabel("Landline number:");
		tf5=new JTextField();
		tf6=new JTextField();
		l5.setFont(ft);
		l6=new JLabel("Gender");
		l6.setFont(ft); 
		l7=new JLabel("Select Hospital");
		l7.setFont(ft); 
		l8=new JLabel("Medical history");
		l8.setFont(ft);
		l9=new JLabel("Address");
		l9.setFont(ft);
		l10=new JLabel("Age");
		l10.setFont(ft);
		
		l1.setBounds(50,25,150,20);
		tf1.setBounds(200,25,150,20); 
		tf1.setSize(300,30);
		
		l2.setBounds(50,60,150,20);
		tf2.setBounds(200,60,150,20);
		tf2.setSize(50,30);
		
		l3.setBounds(50,100,150,20);  
		tf3.setBounds(200,100,150,20); 
		tf3.setSize(300,30);
		
		l4.setBounds(50,150,150,20); 
		tf4.setBounds(200,150,150,20); 
		tf4.setSize(200,20);
		
		l5.setBounds(50,200,150,20); 
		tf5.setBounds(200,200,150,20); 
		tf5.setSize(200,20);
		
		tf7=new JTextField();
		l10.setBounds(50,250,150,20);
		tf7.setBounds(100,250,150,20);//age
		tf7.setSize(50,30);
		
		
		l6.setBounds(170,250,150,20);
		
		
		male = new JRadioButton("Male"); 
		male.setFont(new Font("Arial", Font.BOLD, 14)); 
		male.setSelected(true); 
		male.setSize(75, 20); 
		male.setBounds(225,250,60,20); 
		
		female = new JRadioButton("Female"); 
		female.setFont(new Font("Arial", Font.BOLD, 14)); 
		female.setSelected(false); 
		female.setSize(80, 20); 
		female.setBounds(300,250,150,20); 
		       
		l7.setBounds(50,310,150,20);
		     
		String Hospitals[]={"Select","Fortis[Kalyan]","Shreedevi","Appollo","Mamta","Jupiter","Fortis[Mulund]","Lifeline","Kohinoor","Noor","Krishna","Thakur","Hinduja","Balaji","Masina","Diamond","Rajawadi","Platinum","Thakur","Zynova","Sarvodaya"};        
		cb=new JComboBox(Hospitals);    
		cb.setBounds(50,340,150,50); 
		
		l8.setBounds(50,410,150,20);
		l8.setSize(200,50);
		tf6.setBounds(50,460,150,20);//medical_hist
		tf6.setSize(300,30);
		l9.setBounds(50,490,150,20);  
		
		
		JTextArea ta= new JTextArea(); 
		ta.setFont(new Font("Arial", Font.BOLD, 14));  
		ta.setBounds(50,510,200,50);
		
		
		
		JButton b=new JButton("Submit");  
		b.setBounds(50,580,50,50); 
		b.setSize(120,50); 
		
		JButton back=new JButton("Go back");  
		back.setBounds(200,580,50,50); 
		back.setSize(120,50); 
		
		
		
		 
		JFrame f=new JFrame();
		f.setTitle("Patient Form"); 
		f.add(tf1);  
		f.add(tf2); 
		f.add(tf3); 
		f.add(tf4); 
		f.add(tf5);
		f.add(tf6);
		f.add(tf7);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(male); 
		f.add(female); 
		f.add(cb); 
		f.add(b);
		f.add(ta); 
		f.add(back);
		f.setSize(1000,1000);  
		f.setLayout(null);  
		f.setVisible(true);  
		f.getContentPane().setBackground(new Color(187, 220, 248));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ 
				new Homepage();
			}
		});
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ 
			    String gender="";
			    String n1="";
			    if(male.isSelected())
			    {
			        gender="M";
			        female.setSelected(false);
			    }
			    else if(female.isSelected())
			    {
			        gender="F";
			        male.setSelected(false);
			    }
			    String selectedValue=cb.getSelectedItem().toString();
			    System.out.println(selectedValue);
			    
			    boolean valid = validate();
                System.out.println(valid);
                if(!valid)
                {
               	 JOptionPane.showMessageDialog(null,"Please fill all the fields","Alert",JOptionPane.WARNING_MESSAGE); 
                }
                else {
                	try{
         			   String connString = "jdbc:sqlserver://LAPTOP-NUUHFJ1O;username=sa;Password=shi@14801;";
         			   Connection conn = DriverManager.getConnection(connString);
         			   Statement stmt=conn.createStatement();
         			   String q1 = "Select hosp_id from Hospital where hosp_name='"+selectedValue+"'";
         			   ResultSet r1=stmt.executeQuery(q1);
         			   while(r1.next())
         			   {
         				   System.out.println("in while");
         				   n1=r1.getString("hosp_id");
         				   System.out.println(n1);
         			   }
         			    PreparedStatement st = conn .prepareStatement("insert into Patient values(?,?,?,?,?,?,?,?,?)");
         			    //SET IDENTITY_INSERT patient ON;
         			     //st.setInt(1,1);
         			     st.setString(1, tf1.getText()); 
         			     st.setString(2, tf2.getText());
         			     st.setString(3, tf3.getText());
         			     st.setString(6, ta.getText());
         			     st.setString(7, tf4.getText());
         			     st.setString(4,gender);
         			     st.setString(5,tf7.getText());
         			     st.setString(9,tf6.getText());
         			     int id=Integer.parseInt(n1);
         			     st.setInt(8,id);
         			     
         			     int res=st.executeUpdate(); 
         			     if(res>0) {
         						JOptionPane.showMessageDialog(null,"Form Submitted");
         					}
         					else {
         						JOptionPane.showMessageDialog(null,"Sorry! some Error Occured");
         					}
         			     st.close(); 
         			     conn.close(); 
         			    
         			}  
         			catch (SQLException e1) {
         				// TODO Auto-generated catch block
         				e1.printStackTrace();
         			}
                }
			   
			
	        }
		});
		
	}

    public static void main(String[] args) {
        // TODO code application logic here
        new Patient();
    }
    
}