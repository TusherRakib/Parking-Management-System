package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;


public class ManageFixedcar extends JFrame implements ActionListener
{
	private JLabel IdLabel, slotLabel;
	private JTextField IdTF, slotTF;
	private JButton logoutBtn ,insertBtn,deleteBtn, refreshBtn, getAllBtn, backBtn,updateBtn;
	private JPanel panel;
	private JTable empTable;
	private JScrollPane empTableSP;
	private Color backcolor;
	
	private User user;
	private CarRepo cr;

	
	
	public ManageFixedcar(User user)
	{
		super("Fixed Car");
		this.setSize(600,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backcolor = new Color(114,115, 111);
		
		this.user = user;
		
		cr = new CarRepo();
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(backcolor);
		
		logoutBtn = new JButton("Log out");
		logoutBtn.setBounds(490,30,80,30);
		logoutBtn.addActionListener(this);
		logoutBtn.setBackground(Color.blue);
		panel.add(logoutBtn);
		
		
		
		String data[][] = {{"", ""}};
		
		String head[] = {"Id", "slot"};
		
		empTable = new JTable(data,head);
		empTableSP = new JScrollPane(empTable);
		empTableSP.setBounds(300, 100, 200, 250);
		empTable.setEnabled(false);
		panel.add(empTableSP);
		
		IdLabel = new JLabel("ID :");
		IdLabel.setBounds(15,100,100,30);
		panel.add(IdLabel);
		
		IdTF = new JTextField();
		IdTF.setBounds(120,100,130,30);
		panel.add(IdTF);
		
		slotLabel = new JLabel("slot :");
		slotLabel.setBounds(15,150,100,30);
		panel.add(slotLabel);
		
		slotTF = new JTextField();
		slotTF.setBounds(120,150,130,30);
		panel.add(slotTF);
		
		getAllBtn = new JButton("Getall");
		getAllBtn.setBounds(15,190,100,30);
		getAllBtn.addActionListener(this);
		panel.add(getAllBtn);
		
		insertBtn = new JButton("Insert");
		insertBtn.setBounds(150,190,100,30);
		insertBtn.addActionListener(this);
		panel.add(insertBtn);
		
		
		
		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(150,250,100,30);
		deleteBtn.addActionListener(this);
		panel.add(deleteBtn);
		
		backBtn = new JButton("Back");
		backBtn.setBounds(15, 310, 235, 30);
		backBtn.addActionListener(this);
		backBtn.setBackground(Color.RED);
		panel.add(backBtn);
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		 if(command.equals(getAllBtn.getText()))
		{
			String data[][] = cr.getAllcars();
			String head[] = {"Id", "slot"};
			
			panel.remove(empTableSP);
			
			empTable = new JTable(data,head);
			empTable.setEnabled(false);
			empTableSP = new JScrollPane(empTable);
			empTableSP.setBounds(300, 100, 200, 250);
			panel.add(empTableSP);
			
			panel.revalidate();
			panel.repaint();
			
		}
		
		else if(command.equals(insertBtn.getText()))
		{
			
			
			boolean b= cr.insert(IdTF.getText(),slotTF.getText());
			
			if(b)
			{JOptionPane.showMessageDialog(this, "inserted");}
			else{JOptionPane.showMessageDialog(this, "slot is not avilable");}
			
		}
		else if(command.equals(deleteBtn.getText()))
		{
			
			if(cr.verifyCar(IdTF.getText())!=null)
			{
			cr.delete(IdTF.getText());
			JOptionPane.showMessageDialog(this, "warning! deleted");
			}
			else{JOptionPane.showMessageDialog(this, "warning! not found ");}
			
		}
		
		else if(command.equals(backBtn.getText()))
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