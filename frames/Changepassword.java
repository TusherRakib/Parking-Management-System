package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;

public class Changepassword extends JFrame implements ActionListener
{
private JLabel newpassl,oldpassl,useridl;
private JTextField useridtf;
private JPasswordField oldpasstf,newpasstf;
private JButton logoutBtn,backBtn,changeBtn;
private JPanel panel;
private User user;
private Color backcolor;
private EmployeeHome eh;
private DatabaseConnection dbc;

public Changepassword(User user,EmployeeHome eh)
{
		super("Changepassword");
		this.setSize(400,325);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backcolor = new Color(114,115, 111);
		
		this.user = user;
		this.eh=eh;
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(backcolor);
		
		logoutBtn = new JButton("Log out");
		logoutBtn.setBounds(300,20,80,30);
		logoutBtn.addActionListener(this);
		logoutBtn.setBackground(Color.blue);
		panel.add(logoutBtn);
		
		oldpassl = new JLabel("oldpass :");
		oldpassl.setBounds(15,90,100,30);
		panel.add(oldpassl);
		
		useridl = new JLabel("Id :");
		useridl.setBounds(15,50,100,30);
		panel.add(useridl);
		
		newpassl = new JLabel("Newpass :");
		newpassl.setBounds(15,190,100,30);
		panel.add(newpassl);
		
		oldpasstf= new JPasswordField();
		oldpasstf.setBounds(120,90,130,30);
		panel.add(oldpasstf);
		
		useridtf= new JTextField();
		useridtf.setBounds(120,50,130,30);
		panel.add(useridtf);
		
		newpasstf = new JPasswordField();
		newpasstf.setBounds(120,190,130,30);
		panel.add(newpasstf);
		
		changeBtn = new JButton("Change");
		changeBtn.setBounds(251,190,60,30);
		changeBtn.addActionListener(this);
		changeBtn.setBackground(Color.gray);
		panel.add(changeBtn);
		
		backBtn = new JButton("Back");
		backBtn.setBounds(15, 250, 60, 20);
		backBtn.addActionListener(this);
		backBtn.setBackground(Color.RED);
		panel.add(backBtn);
		
		this.add(panel);
		
}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(changeBtn.getText()))
		{
			UserRepo ur = new UserRepo();
			User user = ur.getUser(useridtf.getText(), oldpasstf.getText());
			
			if(user!=null)
			{
			ur.setPassword(useridtf.getText(),newpasstf.getText());
			JOptionPane.showMessageDialog(this, "Changed");
			}
			
			else
			{JOptionPane.showMessageDialog(this, "Invaild Password");}
			}
			
			if(command.equals(backBtn.getText()))
		{
		EmployeeHome eh = new EmployeeHome(user);
			eh.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(logoutBtn.getText()))
		{
			LoginFrame lf = new LoginFrame();
			lf.setVisible(true);
			this.setVisible(false);
		}
		else{}
		
		
			}
}