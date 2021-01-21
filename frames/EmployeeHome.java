package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;


public class EmployeeHome extends JFrame implements ActionListener
{
	JButton logoutBtn, manageEmpBtn, manageParkingBtn, changePasswordBtn,managefixedcarbtn;
	JPanel panel;
	User user;
	private Color backcolor;
	
	public EmployeeHome(User user)
	{
		super("Home");
		this.setSize(800,650);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backcolor = new Color(114,115, 111);

		
		this.user = user;
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(backcolor);
		
		logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(690,30,80,30);
		logoutBtn.addActionListener(this);
		logoutBtn.setBackground(Color.blue);
		panel.add(logoutBtn);
		
		changePasswordBtn = new JButton("Change Password");
		changePasswordBtn.setBounds(250, 500, 300, 30);
		changePasswordBtn.addActionListener(this);
		panel.add(changePasswordBtn);
		
		managefixedcarbtn = new JButton("Manage Fixed car");
		managefixedcarbtn.setBounds(250, 400, 300, 30);
		managefixedcarbtn.addActionListener(this);
		panel.add(managefixedcarbtn);
		
		manageEmpBtn = new JButton("Manage Employee");
		manageEmpBtn.setBounds(250, 200, 300, 30);
		manageEmpBtn.addActionListener(this);
		panel.add(manageEmpBtn);
		
		manageParkingBtn = new JButton("Manage Parking Lot");
		manageParkingBtn.setBounds(250, 300, 300, 30);
		manageParkingBtn.addActionListener(this);
		panel.add(manageParkingBtn);
		
		
		
		this.add(panel);
	
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(logoutBtn.getText()))
		{
			LoginFrame lf = new LoginFrame();
			lf.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(manageEmpBtn.getText()))
		{
			if(user.getStatus()==0)
			{
				EmployeeFrame ef = new EmployeeFrame(user);
				ef.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Access Denied");
			}
		}
		
		else if(command.equals(managefixedcarbtn.getText()))
		{
			if(user.getStatus()==0)
			{
				ManageFixedcar c= new ManageFixedcar(user);
			c.setVisible(true);
			this .setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Access Denied");
			}
		}
		else if(command.equals(manageParkingBtn.getText()))
		{
				Car cf = new Car(user);
				cf.setVisible(true);
				this.setVisible(false);
			
		}
		
		
		else if(command.equals(changePasswordBtn.getText()))
		{
			Changepassword ch=new Changepassword(user,this);
			ch.setVisible(true);
			this.setVisible(false);
		}
	
		else{}
	}
}































