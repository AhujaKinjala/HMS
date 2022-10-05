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
	faculty=new JButton("FACULTY");
	lab=new JButton("LAB TESTS");
	treat=new JButton("FACILITIES");
	wards=new JButton("WARDS");
	map=new JButton("MAP");
	head=new JLabel("CITY HOSPITAL");
	
	head.setForeground(Color.WHITE);
    Font f=new Font("Times New Roman",Font.BOLD,80);
	head.setFont(f);
	head.setBounds(330,20,1000,60);
	
	top.setBounds(0,0,1500,100);
	top.setBackground(Color.DARK_GRAY);
	
	left.setBounds(25,150,400,550);
	left.setLayout(null);
	left.setBackground(Color.LIGHT_GRAY);
	
	right.setBounds(500,150,950,550);
	right.setBackground(Color.LIGHT_GRAY);
	right.setLayout(null);
	
	Font f1=new Font("Arial",Font.PLAIN,30);
	login.setFont(f1);
	login.setBounds(420,200,200,50);
	login.setBackground(Color.GRAY);
	login.setForeground(Color.WHITE);
	
	
	reg.setBounds(420,280,200,50);
	reg.setFont(f1);
	reg.setBackground(Color.GRAY);
	reg.setForeground(Color.WHITE);
	
	
	faculty.setBounds(50,25,280,60);
	faculty.setFont(f1);
	faculty.setBackground(Color.GRAY);
	faculty.setForeground(Color.WHITE);
	
	
	lab.setBounds(50,135,280,60);
	lab.setFont(f1);
	lab.setBackground(Color.GRAY);
	lab.setForeground(Color.WHITE);
	
	
	treat.setBounds(50,245,280,60);
	treat.setFont(f1);
    treat.setBackground(Color.GRAY);
	treat.setForeground(Color.WHITE);

	
	wards.setBounds(50,355,280,60);
	wards.setFont(f1);
	wards.setBackground(Color.GRAY);
	wards.setForeground(Color.WHITE);
	
	
	map.setBounds(50,465,280,60);
	map.setFont(f1);
	map.setBackground(Color.GRAY);
	map.setForeground(Color.WHITE);
	
	
	top.add(head);
	right.add(login);
	right.add(reg);
	left.add(treat);
	left.add(lab);
	left.add(faculty);
	left.add(wards);
	left.add(map);
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
		t1.setLayout(null);
		t1.getContentPane().setBackground(Color.WHITE);
		t1.setVisible(true);//turns on the visibility of frame
		t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//not mandate to wrie JFrame here coz we are extending
	}
}