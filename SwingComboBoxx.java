import javax.swing.*;
import java.awt.*;
import java.util.*;
public class SwingComboBoxx extends JFrame
{
	public SwingComboBoxx()
	{
	String names[]= {"Baburao","Raju","Shyam","Pushpa"};
	
	JComboBox cb = new JComboBox(names);
	add(cb);
	cb.setBounds(30, 30, 80, 50);
	JTextArea ta = new JTextArea("Hera Pheri");
	add(ta);
	ta.setBounds(30, 100, 200, 200);
	this.getContentPane().setBackground(Color.blue);
	setLayout(null);
	setVisible(true);
	setSize(5005,500);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingComboBoxx();
	}

}
