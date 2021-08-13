package homepage;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class AfteradminLogin{
     JTextField t1,t2,t3,t4;
     JLabel l1,l2,l3,l4;
     JButton b1,b2;
     Font font;
     
     public boolean validate(){
      	  System.out.println("in validate");
      	  
      	  if(t1.getText().length()==0){
      		// System.out.println("in tf1");
      	     return false;
      	     
      	  }
      	  else if(t2.getText().length()==0){
      		 //System.out.println("in tf2");
      		return false;
      	    //field2.setBackground(Color.red);
      	  }
      	  else if(t3.getText().length()==0){
      		 //System.out.println("in tf3");
      		return false;
      	    //field2.setBackground(Color.red);
      	  }
      	  else {
      		  return true;
      	  }
      	}
     
     public AfteradminLogin()
     {
        font=new Font("Times new Roman",Font.BOLD,12);
      
        l1=new JLabel("Hospital name:");
        t1=new JTextField();
        l1.setFont(font);
        l2=new JLabel("City name:");
        t2=new JTextField();
        l2.setFont(font);
        l3=new JLabel("Area name:");
        t3=new JTextField();
        l3.setFont(font);
        
        l1.setBounds(50,50,150,20); 
        t1.setBounds(50,100,150,30);
        l1.setSize(100,50);
        t1.setSize(100,50);

        l2.setBounds(50,150,150,30); 
        t2.setBounds(50,200,150,30); 
        l2.setSize(100,50);
        t2.setSize(100,50);
        
        l3.setBounds(50,250,150,20);
        t3.setBounds(50,300,150,30);
        l3.setSize(100,50);
        t3.setSize(100,50);
        
        b1 =new JButton("View");
        b1.setBounds(50,400,150,20);
        b1.setSize(100,50);
        
        b2 =new JButton("Update");
        b2.setBounds(180,400,150,20);
        b2.setSize(100,50);
        
        JButton back=new JButton("Go back");  
		back.setBounds(300,400,50,50); 
		back.setSize(120,50); 
        
        JFrame f=new JFrame();
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(back);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(new Color(187, 220, 248));
        //after clicking view
        JFrame frame=new JFrame();
        JLabel lbed,lrec,lact,lcase,ldeaths;
        JTextField tbed,trec,tact,tcase,tdeaths;
        
        lcase=new JLabel("No of cases:");
        lcase.setBounds(50,30, 80, 20);
        frame.add(lcase);
        tcase= new JTextField();
        tcase.setBounds(150,27,160,30);
    	frame.add(tcase);
    	//tcase.setColumns(10);
    	
    	lrec=new JLabel("Recovered");
        lrec.setBounds(50,70, 80, 20);
        frame.add(lrec);
        trec= new JTextField();
        trec.setBounds(150,67,160,30);
    	frame.add(trec);
    	//trec.setColumns(10);
    	
    	ldeaths=new JLabel("deaths");
        ldeaths.setBounds(50, 110, 80, 20);
        frame.add(ldeaths);
        tdeaths= new JTextField();
        tdeaths.setBounds(150, 107,160,30);
    	frame.add(tdeaths);
    	//tdeaths.setColumns(10);
    	
    	lbed=new JLabel("Beds");
        lbed.setBounds(50, 150, 80, 20);
        frame.add(lbed);
        tbed= new JTextField();
        tbed.setBounds(150, 150,160,30);
    	frame.add(tbed);
    	
    	lact=new JLabel("Active Cases");
        lact.setBounds(50, 190, 80, 20);
        frame.add(lact);
        tact= new JTextField();
        tact.setBounds(150, 190,160,30);
    	frame.add(tact);
    	
    	frame.setSize(600,600);
    	frame.setLayout(null);
    	frame.setVisible(false);
    	 frame.getContentPane().setBackground(new Color(187, 220, 248));
    	//after clicking update
    	JFrame frame2 = new JFrame();
    	JTextField tf1,tf2,tf3;
        JLabel la1,la2,la3;
        JButton btn;
        la1=new JLabel("Total cases:");
        tf1=new JTextField();
        la1.setFont(font);
        la2=new JLabel("Recovered:");
        tf2=new JTextField();
        la2.setFont(font);
        la3=new JLabel("Deaths:");
        tf3=new JTextField();
        la3.setFont(font);
           
           la1.setBounds(50,50,150,20); 
           tf1.setBounds(50,100,150,30);
           la1.setSize(100,50);
           tf1.setSize(100,50);

           la2.setBounds(50,150,150,30); 
           tf2.setBounds(50,200,150,30); 
           la2.setSize(100,50);
           tf2.setSize(100,50);
           
           la3.setBounds(50,250,150,20);
           tf3.setBounds(50,300,150,30);
           la3.setSize(100,50);
           tf3.setSize(100,50);
           
           btn =new JButton("update");
           btn.setBounds(50,400,150,20);
           btn.setSize(100,50);
           
           frame2.add(la1);
           frame2.add(la2);
           frame2.add(la3);
           frame2.add(tf1);
           frame2.add(tf2);
           frame2.add(tf3);
           frame2.add(btn);
           
           frame2.setSize(500,500);
           frame2.setLayout(null);
           frame2.setVisible(false);
           frame2.getContentPane().setBackground(new Color(187, 220, 248));
           back.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e)
   			{ 
   				new Admin();
   			}
   		});
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	 int n1=0,n2=0,n3=0,n4=0,n6=0;
                 String n5="";
                 String hospname=t1.getText();
                 String city=t2.getText();
                 String area=t3.getText();
                 boolean valid = validate();
                 System.out.println(valid);
                 if(!valid)
                 {
                	 JOptionPane.showMessageDialog(null,"Please fill all the fields","Alert",JOptionPane.WARNING_MESSAGE); 
                	 frame.setVisible(false);
                 }
                 else {
                	 frame.setVisible(true);
                 }
                    
            	try{
            		
                	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					String connString = "jdbc:sqlserver://LAPTOP-NUUHFJ1O;username=sa;Password=shi@14801;";
					Connection conn = DriverManager.getConnection(connString);
					Statement stmt=conn.createStatement();
					String q1 = "Select Area_no from Area where Area_name='"+area+"'";
					ResultSet r1=stmt.executeQuery(q1);
	                while(r1.next())
	                {
	                	 n1=r1.getInt(1);
	                	 System.out.println(n1);
	                }
	                String q2 = "Select * from cases where Area_no="+n1;
					ResultSet r2=stmt.executeQuery(q2);
					while(r2.next())
					{
						n2=r2.getInt(1);//no of cases
						n3=r2.getInt(2);//deaths
						n4=r2.getInt(3);//recovered
						n6=n2-(n3+n4);//active
					}
					String s = Integer.toString(n2);
					tcase.setText(s);
					String s2=Integer.toString(n3);
					tdeaths.setText(s2);
					String s3=Integer.toString(n4);
					trec.setText(s3);
					String s4=Integer.toString(n6);
					tact.setText(s4);
					
					String q3 = "Select Total_beds from Hospital where Area_no="+n1;
					ResultSet r3=stmt.executeQuery(q3);
					while(r3.next())
					{
						n5=r3.getString(1);
					}
					tbed.setText(n5);
            	}
            	catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				  }
              }
            	
            
        });
         btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	int n1=0;
            	String area=t3.getText();
            	int totalcases = Integer.parseInt(tf1.getText());
                int recovered = Integer.parseInt(tf2.getText());
                int deaths = Integer.parseInt(tf3.getText());
                try {
                	String connString = "jdbc:sqlserver://DESKTOP-3QCMFIL;instanceName=ADITISQL;Database=covid19;user=sa;Password=ak$ingh76;";
					Connection conn = DriverManager.getConnection(connString);
					Statement stmt=conn.createStatement();
					String q1 = "Select Area_no from Area where Area_name='"+area+"'";
					ResultSet rs1=stmt.executeQuery(q1);
	                while(rs1.next())
	                {
	                	 n1=rs1.getInt(1);
	                	 System.out.println(n1);
	                }
					String query1="update Cases set No_of_cases="+totalcases+",Recovered="+recovered+",Deaths="+deaths+" where Area_no ="+n1;
					int res = stmt.executeUpdate(query1);
					if(res>0){
	                    JOptionPane.showMessageDialog(null,"Successfully updated","Alert",JOptionPane.WARNING_MESSAGE);                        
	                }
	                else{
	                    JOptionPane.showMessageDialog(null,"Not updated","Alert",JOptionPane.WARNING_MESSAGE);
	                }

                }
                catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
         b2.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
            	 frame2.setVisible(true);
             }
         });
       
        
        
               
   }
     
     public static void main(String[] args) {
         // TODO code application logic here
         new AfteradminLogin();
     }
}