package borderlayoutdemo;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flowLayoutDemo  extends JFrame implements ActionListener
{
	public static JButton button1, button2, button3, button4, button5, button6;
	public static JFrame frame;
	public static JPanel panel1, panel2;
	public flowLayoutDemo()
	{
		panel1= new JPanel();
		panel2= new JPanel();
		frame = new JFrame(" FlowLayout Demo ");
		frame.setSize(new Dimension(500,90));//(width, height)
		button1= new JButton("1");
		button2= new JButton("2");
		button3= new JButton("3");
		button4= new JButton("4");
		button5= new JButton("5");
		button6= new JButton("6");
		frame.setLayout(new FlowLayout());
		panel1.add(button1);//first 3 buttons added to the first panel and last 3 added to the second panel
		panel1.add(button2);
		panel1.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		frame.add(panel1);
		frame.add(panel2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocation(600,200);//(x,y) coordinates
		button1.addActionListener(this);

		button1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		button2.addActionListener(this);

		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		button3.addActionListener(this);

		button3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		button4.addActionListener(this);

		button4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		button5.addActionListener(this);

		button5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		button6.addActionListener(this);

		button6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==button1 ||e.getSource()==button2 || e.getSource()==button3
				||e.getSource()==button4||e.getSource()==button5||e.getSource()==button6)
		{
			System.exit(0);
		}
	}
}

