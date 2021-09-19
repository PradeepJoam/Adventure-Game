package Puzzle_Game;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class puzzleGame_pic extends JFrame implements ActionListener
{    JFrame f= new JFrame();
     
	 
	//initializing ImageIcons
	ImageIcon iconorg = new ImageIcon("new.png");
	ImageIcon icon1 = new ImageIcon("pic1.png");
	ImageIcon icon2 = new ImageIcon("pic13.png");
	ImageIcon icon3 = new ImageIcon("pic15.png");
	ImageIcon icon4 = new ImageIcon("pic12.png");
	ImageIcon icon5 = new ImageIcon("pic9.png");
	ImageIcon icon6 = new ImageIcon("pic6.png");
	ImageIcon icon7 = new ImageIcon("pic4.png");
	ImageIcon icon8 = new ImageIcon("pic5.png");
	ImageIcon icon9 = new ImageIcon("pic3.png");
	ImageIcon icon10 = new ImageIcon("pic2.png");
	ImageIcon icon11 = new ImageIcon("pic14.png");
	ImageIcon icon12 = new ImageIcon("pic10.png");
	ImageIcon icon13 = new ImageIcon("pic8.png");
	ImageIcon icon14 = new ImageIcon("pic11.png");
	ImageIcon icon15 = new ImageIcon("pic7.png");
	//initializing Buttons and adding pics 
	JButton b1=new JButton();
	JButton b2=new JButton(icon13);
	JButton b3=new JButton(icon15);
	JButton b4=new JButton(icon12);
	JButton b5=new JButton(icon9);
	JButton b6=new JButton(icon6);
	JButton b7=new JButton(icon4);
	JButton b8=new JButton(icon5);
	JButton b9=new JButton(icon3);
	JButton b10=new JButton(icon2);
	JButton b11=new JButton(icon14);
	JButton b12=new JButton(icon10);
	JButton b13=new JButton(icon8);
	JButton b14=new JButton(icon11);
	JButton b15=new JButton(icon7);
	JButton b16=new JButton(icon1);
	//initializing a Label for Original pic 
	JLabel l1=new JLabel(iconorg);
	JLabel l2 = new JLabel("ORIGINAl IMAGE");
	//set the bounds of buttons and labels
	   puzzleGame_pic()
		  {
			f.setLayout(null);
			f.setBounds(150,20,1000,700);
			l2.setBounds(650,110,100,30);
			l1.setBounds(650,150,300,300);
			b1.setBounds(50,50,125,125);	
			b2.setBounds(175,50,125,125);
			b3.setBounds(300,50,125,125);
			b4.setBounds(425,50,125,125);
			b5.setBounds(50,175,125,125);
			b6.setBounds(175,175,125,125);
			b7.setBounds(300,175,125,125);
			b8.setBounds(425,175,125,125);
			b9.setBounds(50,300,125,125);
			b10.setBounds(175,300,125,125);
			b11.setBounds(300,300,125,125);
			b12.setBounds(425,300,125,125);
			b13.setBounds(50,425,125,125);
			b14.setBounds(175,425,125,125);
			b15.setBounds(300,425,125,125);
			b16.setBounds(425,425,125,125);
			//add buttons labels in frame
			f.add(l1);
			f.add(l2);
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(b5);
			f.add(b6);
			f.add(b7);
			f.add(b8);
			f.add(b9);
			f.add(b10);
			f.add(b11);
			f.add(b12);
			f.add(b13);
			f.add(b14);
			f.add(b15);
			f.add(b16);
			//registering the buttons
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			b10.addActionListener(this);
			b11.addActionListener(this);
			b12.addActionListener(this);
			b13.addActionListener(this);
			b14.addActionListener(this);
			b15.addActionListener(this);
			b16.addActionListener(this);
			f.setVisible(true);
	   }
   //define the Action of buttons
   public void actionPerformed(ActionEvent e )
   {
     if(b1==e.getSource())
	  {
	 
	    if(b2.getIcon()==null)
	     {
	       b2.setIcon(b1.getIcon());
	       b1.setIcon(null);
	 
	     }
	   else if(b5.getIcon()==null)
	    {
	       b5.setIcon(b1.getIcon());
	       b1.setIcon(null);
	    }
	 
	 	 
	 }
	 if(b2==e.getSource())
	   {
	    if(b1.getIcon()==null)
	    {
	     b1.setIcon(b2.getIcon());
	     b2.setIcon(null);
	 
	    }
	   else if(b3.getIcon()==null)
	    {
	      b3.setIcon(b2.getIcon());
	      b2.setIcon(null);
	 
	 
	    }
	 else if(b6.getIcon()==null)
	   {
	     b6.setIcon(b2.getIcon());
	     b2.setIcon(null);
	   }
	 }
		if(b3==e.getSource())
	 {
	 if(b2.getIcon()==null)
	 {
	   b2.setIcon(b3.getIcon());
	   b3.setIcon(null);
	 
	 }
	 else if(b4.getIcon()==null)
	 {
	 b4.setIcon(b3.getIcon());
	 b3.setIcon(null);
	 
	 
	 }
	 else if(b7.getIcon()==null)
	 {
	 b7.setIcon(b3.getIcon());
	 b3.setIcon(null);
	 }
	 
	 }
	if(b4==e.getSource())
	 {
	 if(b3.getIcon()==null)
	 {
	   b3.setIcon(b4.getIcon());
	   b4.setIcon(null);
	 
	 }
	 else if(b8.getIcon()==null)
	 {
	 b8.setIcon(b4.getIcon());
	 b4.setIcon(null);
	}
	 }	
    
     if(b5==e.getSource())
	 {
	 if(b1.getIcon()==null)
	 {
	   b1.setIcon(b5.getIcon());
	   b5.setIcon(null);
	 
	 }
	 else if(b9.getIcon()==null)
	 {
	 b9.setIcon(b5.getIcon());
	 b5.setIcon(null);
	 
	 
	 }
	 else if(b6.getIcon()==null)
	 {
	 b6.setIcon(b5.getIcon());
	 b5.setIcon(null);
	 }
	 }
      if(b6==e.getSource())
	 {
	 if(b5.getIcon()==null)
	 {
	   b5.setIcon(b6.getIcon());
	   b6.setIcon(null);
	 
	 }
	 else if(b2.getIcon()==null)
	 {
	 b2.setIcon(b6.getIcon());
	 b6.setIcon(null);
	 
	 
	 }
	 else if(b7.getIcon()==null)
	 {
	 b7.setIcon(b6.getIcon());
	 b6.setIcon(null);
	 }
	 else if(b10.getIcon()==null)
	 {
	 b10.setIcon(b6.getIcon());
	 b6.setIcon(null);
	 }
	 }
	  if(b7==e.getSource())
	 {
	 if(b6.getIcon()==null)
	 {
	   b6.setIcon(b7.getIcon());
	   b7.setIcon(null);
	 
	 }
	 else if(b3.getIcon()==null)
	 {
	 b3.setIcon(b7.getIcon());
	 b7.setIcon(null);
	 
	 
	 }
	 else if(b8.getIcon()==null)
	 {
	 b8.setIcon(b7.getIcon());
	 b7.setIcon(null);
	 }
	 else if(b11.getIcon()==null)
	 {
	 b11.setIcon(b7.getIcon());
	 b7.setIcon(null);
	 }
	 }
	 if(b8==e.getSource())
	 {
	 if(b7.getIcon()==null)
	 {
	   b7.setIcon(b8.getIcon());
	   b8.setIcon(null);
	 
	 }
	 else if(b4.getIcon()==null)
	 {
	 b4.setIcon(b8.getIcon());
	 b8.setIcon(null);
	 
	 
	 }
	 else if(b12.getIcon()==null)
	 {
	 b12.setIcon(b8.getIcon());
	 b8.setIcon(null);
	 }
	 }
	if(b9==e.getSource())
	 {
	 if(b5.getIcon()==null)
	 {
	   b5.setIcon(b9.getIcon());
	   b9.setIcon(null);
	 
	 }
	 else if(b10.getIcon()==null)
	 {
	 b10.setIcon(b9.getIcon());
	 b9.setIcon(null);
	 
	 
	 }
	 else if(b13.getIcon()==null)
	 {
	 b13.setIcon(b9.getIcon());
	 b9.setIcon(null);
	 }
	 }
      if(b10==e.getSource())
	 {
	 if(b9.getIcon()==null)
	 {
	   b9.setIcon(b10.getIcon());
	   b10.setIcon(null);
	 
	 }
	 else if(b11.getIcon()==null)
	 {
	 b11.setIcon(b10.getIcon());
	 b10.setIcon(null);
	 
	 
	 }
	 else if(b6.getIcon()==null)
	 {
	 b6.setIcon(b10.getIcon());
	 b10.setIcon(null);
	 }
	 else if(b14.getIcon()==null)
	 {
	 b14.setIcon(b10.getIcon());
	 b10.setIcon(null);
	 }
	 }
	  if(b11==e.getSource())
	 {
	 if(b10.getIcon()==null)
	 {
	   b10.setIcon(b11.getIcon());
	   b11.setIcon(null);
	 
	 }
	 else if(b12.getIcon()==null)
	 {
	 b12.setIcon(b11.getIcon());
	 b11.setIcon(null);
	 
	 
	 }
	 else if(b15.getIcon()==null)
	 {
	 b15.setIcon(b11.getIcon());
	 b11.setIcon(null);
	 }
	 else if(b7.getIcon()==null)
	 {
	 b7.setIcon(b11.getIcon());
	 b11.setIcon(null);
	 }
	 }
	 if(b12==e.getSource())
	 {
	 if(b11.getIcon()==null)
	 {
	   b11.setIcon(b12.getIcon());
	   b12.setIcon(null);
	 
	 }
	 else if(b8.getIcon()==null)
	 {
	 b8.setIcon(b12.getIcon());
	 b12.setIcon(null);
	 
	 
	 }
	 else if(b16.getIcon()==null)
	 {
	 b16.setIcon(b12.getIcon());
	 b12.setIcon(null);
	 }
	 }
	 if(b13==e.getSource())
	 {
	 if(b9.getIcon()==null)
	 {
	   b9.setIcon(b13.getIcon());
	   b13.setIcon(null);
	 
	 }
	 else if(b14.getIcon()==null)
	 {
	 b14.setIcon(b13.getIcon());
	 b13.setIcon(null);
	}
	 }
	 if(b14==e.getSource())
	 {
	 if(b13.getIcon()==null)
	 {
	   b13.setIcon(b14.getIcon());
	   b14.setIcon(null);
	 
	 }
	 else if(b15.getIcon()==null)
	 {
	 b15.setIcon(b14.getIcon());
	 b14.setIcon(null);
	 
	 
	 }
	 else if(b10.getIcon()==null)
	 {
	 b10.setIcon(b14.getIcon());
	 b14.setIcon(null);
	 }
	 }
		if(b15==e.getSource())
	 {
	 if(b14.getIcon()==null)
	 {
	   b14.setIcon(b15.getIcon());
	   b15.setIcon(null);
	 
	 }
	 else if(b16.getIcon()==null)
	 {
	 b16.setIcon(b15.getIcon());
	 b15.setIcon(null);
	 
	 
	 }
	 else if(b11.getIcon()==null)
	 {
	 b11.setIcon(b15.getIcon());
	 b15.setIcon(null);
	 }
	 }
	if(b16==e.getSource())
	 {
	 if(b15.getIcon()==null)
	 {
	   b15.setIcon(b16.getIcon());
	   b16.setIcon(null);
	 
	 }
	 else if(b12.getIcon()==null)
	 {
	 b12.setIcon(b16.getIcon());
	 b16.setIcon(null);
	}
	 
	 }	
    
	
	//winning condition
	
	if(b1.getIcon()==(icon1)&&b2.getIcon()==(icon2)&&b3.getIcon()==(icon3)&&b4.getIcon()==(icon4)
	 &&b5.getIcon()==(icon5)&&b6.getIcon()==(icon6)&&b7.getIcon()==(icon7)&&b8.getIcon()==(icon8)
	 &&b9.getIcon()==(icon9)&&b10.getIcon()==(icon10)&&b11.getIcon()==(icon11)&&b12.getIcon()==(icon12)
	 &&b13.getIcon()==(icon13)&&b14.getIcon()==(icon14)&&b15.getIcon()==(icon15)&&b16.getIcon()==(null))
	 JOptionPane.showMessageDialog(null,"You Won The Game"); 
   
   
   
   
   
   
   
    }
   public static void main(String args[])
   {
     puzzleGame_pic pg= new puzzleGame_pic();
   
   
   
   }






}