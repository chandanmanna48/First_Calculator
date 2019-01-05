package Calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator {
	//content created
	Label l1=new Label("First Number ");
	TextField t1=new TextField(10);
	Label l2=new Label("Second Number ");
	TextField t2=new TextField(10);
	Label l3=new Label("Result ");
	TextField t3=new TextField(10);
	Button add=new Button("Add");
	Button sub=new Button("Sub");
	Button mul=new Button("Mul");
	Button div=new Button("Div");
	public  Calculator()
	{
		//Create a panel
		Panel p1=new Panel();
		//Set layout
		GridLayout gridLayout=new GridLayout(5,2);
		p1.setLayout(gridLayout);
		p1.setBackground(Color.pink);
		add.setBackground(Color.blue);
		sub.setBackground(Color.green);
		mul.setBackground(Color.cyan);
		div.setBackground(Color.ORANGE);
		//Add content to panel
		p1.add(l1);
	    p1.add(t1);
	    p1.add(l2);
	    p1.add(t2);
	    p1.add(l3);
	    p1.add(t3);
	    p1.add(add);
	    p1.add(sub);
	    p1.add(mul);
	    p1.add(div);
	    //Create a frame and add panel to it
	    JFrame frame=new JFrame("Calculator");
	    frame.setContentPane(p1);
	    frame.setVisible(true);
	    frame.setSize(500, 200);
	    add.addActionListener(new Addition());
	    sub.addActionListener(new Substration());
	    mul.addActionListener(new Multiplication());
	    div.addActionListener(new Division());
	}
	class Addition implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int sum=a+b;
			String res=String.valueOf(sum);
			t3.setText(res);
		}
	}
	class Substration implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a-b;
			String sub=String.valueOf(c);
			t3.setText(sub);
		}
	}
	class Multiplication implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a*b;
			String mul=String.valueOf(c);
			t3.setText(mul);
		}
	}
	class Division implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a/b;
			String sub=String.valueOf(c);
			t3.setText(sub);
		}
	}
	public static void main(String args[])
	{
		Calculator ob=new Calculator();
	}

}
