package homepage;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class Symptoms {
	public Symptoms()
	{
		JFrame fsymp = new JFrame();
		fsymp.setTitle("Symptoms of covid-19");
		fsymp.setSize(800,800);
		fsymp.setLocationRelativeTo(null);
		fsymp.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fsymp.setVisible(true);
	
	
		fsymp.setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\15DB1059TU (5GGD)\\Desktop\\Symptoms.jpeg"));
		fsymp.add(background);
		background.setLayout(new FlowLayout());
		background.setSize(499,499);
		background.setSize(500,500);
	}
	public static void main(String args[])
	{
		new Symptoms();
	}

}
