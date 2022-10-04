import javax.swing.*;
import java.awt.*;

class Test extends JFrame
{
	JPanel top,left,right;
	JLabel head;
	JButton login,reg,faculty,lab,treat,wards,map;
    Test()
{

	
	top =new JPanel();
	left=new JPanel();
	right=new JPanel();
	login=new JButton("LOGIN");
	reg=new JButton("REGISTER");
	head=new JLabel("CITY HOSPITAL");
	head.setForeground(Color.WHITE);
    Font f=new Font("Times New Roman",Font.BOLD,80);
	head.setFont(f);
	head.setBounds(330,20,1000,60);
	top.setBounds(0,0,1500,100);
	top.setBackground(Color.DARK_GRAY);
	left.setBounds(10,150,400,550);
	left.setBackground(Color.LIGHT_GRAY);
	right.setBounds(500,150,950,550);
	right.setBackground(Color.LIGHT_GRAY);
	login.setBounds(925,375,100,25);
	login.setBackground(Color.GRAY);
	login.setForeground(Color.WHITE);
	reg.setBounds(925,425,100,25);
	reg.setBackground(Color.GRAY);
	reg.setForeground(Color.WHITE);
	
	top.add(head);
	right.add(login);
	right.add(reg);
	add(left);
	add(right);
	add(top);
}
}
class HMS1
{
	public static void main(String args[])
	{
		
		Test t1=new Test();
		t1.setSize(1500,800);// size of frame
		t1.setTitle("City Hospital");//heading similar to(*C:\JAVA PGMS\...
		//t1.setLocation(300,300);
		t1.getContentPane().setBackground(Color.WHITE);
		t1.setVisible(true);//turns on the visibility of frame
		t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//not mandate to wrie JFrame here coz we are extending
	}
}