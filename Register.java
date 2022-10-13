import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test extends JFrame implements ActionListener
{
	JPanel top,left,right,regt;
	JLabel head,catg;
	JButton login,reg,faculty,lab,treat,wards,map,ok,back,done;
	JComboBox dept;
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
	
	reg.addActionListener(this);
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
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("REGISTER"))
		{
		right.setVisible(false);
		regt=new JPanel();
		regt.setBounds(500,150,950,550);
	    regt.setBackground(Color.LIGHT_GRAY);
	    regt.setLayout(null);
	    add(regt);
		String opt[]={"Doctor","Patient","Faculty"};
		dept=new JComboBox(opt);
		dept.setBounds(200,10,200,40);
		regt.add(dept);
		catg=new JLabel("Category");
		catg.setBounds(10,10,180,40);
		regt.add(catg);
		ok=new JButton("OK");
		ok.setBounds(410,10,100,40);
		regt.add(ok);
		back=new JButton("Back");
		done=new JButton("DONE");
		back.setBounds(10,500,100,40);
		done.setBounds(840,500,100,40);
		regt.add(done);
		regt.add(back);
		}
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
