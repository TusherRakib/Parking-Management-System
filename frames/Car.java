package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import repository.*;
import entity.*;

public class Car extends JFrame implements  ActionListener
{
	JButton doo,btnC1, logoutBtn,backBtn,btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8, btnC9, btnC10, btnC11, btnC12, btnC13, btnC14, btnC15, btnC16, btnC17, btnC18, btnC19, btnC20, btnC21, btnC22, btnC23, btnC24, btnC25, btnC26, btnC27, btnC28, btnC29, btnC30;
	JPanel panel;
	JTextField idtf;
	JLabel idl;
	DatabaseConnection dbc;
	int val,value;
	private Color backcolor;
	private User user;
	private CarRepo c1;

	public Car(User user)
	{
	    
		super("Car_Parking_Lot");
		this.setSize(510,730);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backcolor = new Color(114,115, 111);
		panel=new JPanel();
		panel.setLayout(null);			
		panel.setBackground(backcolor);
		
		c1=new CarRepo();
		
		idtf=new JTextField();
		idtf.setBounds(40,5,90,20);
		panel.add(idtf);
		
		idl=new JLabel("Id");
		idl.setBounds(10,5,30,20);
		panel.add(idl);
		
		doo=new JButton("park");
		doo.setBounds(135,5,30,20);
		doo.addActionListener(this);
		panel.add(doo);
		
		btnC10=new JButton("Car:10");
		btnC10.setBounds(10,40,100,40);
		btnC10.addActionListener(this);
		if(c1.getAvability(10).equals("1"))
		{btnC10.setBackground(Color.green);}
		else{btnC10.setBackground(Color.RED);}
		panel.add(btnC10);
		
		btnC9=new JButton("Car:09");
		btnC9.setBounds(10,100,100,40);
		btnC9.addActionListener(this);
		if(c1.getAvability(9).equals("1"))
		{btnC9.setBackground(Color.green);}
		else{btnC9.setBackground(Color.RED);}
		panel.add(btnC9);
		
		
		btnC8=new JButton("Car:08");
		btnC8.setBounds(10,160,100,40);
		btnC8.addActionListener(this);
		if(c1.getAvability(8).equals("1"))
		{btnC8.setBackground(Color.green);}
		else{btnC8.setBackground(Color.RED);}
		panel.add(btnC8);
	
		
		btnC7=new JButton("Car:07");
		btnC7.setBounds(10,220,100,40);
		btnC7.addActionListener(this);
		if(c1.getAvability(7).equals("1"))
		{btnC7.setBackground(Color.green);}
		else{btnC7.setBackground(Color.RED);}
		panel.add(btnC7);
		
		
		btnC6=new JButton("Car:06");
		btnC6.setBounds(10,280,100,40);
		btnC6.addActionListener(this);
		if(c1.getAvability(6).equals("1"))
		{btnC6.setBackground(Color.green);}
		else{btnC6.setBackground(Color.RED);}
		panel.add(btnC6);
		
		
		btnC5=new JButton("Car:05");
		btnC5.setBounds(10,340,100,40);
		btnC5.addActionListener(this);
		if(c1.getAvability(5).equals("1"))
		{btnC5.setBackground(Color.green);}
		else{btnC5.setBackground(Color.RED);}
		panel.add(btnC5);
		
		
		btnC4=new JButton("Car:04");
		btnC4.setBounds(10,400,100,40);
		btnC4.addActionListener(this);
		if(c1.getAvability(4).equals("1"))
		{btnC4.setBackground(Color.green);}
		else{btnC4.setBackground(Color.RED);}
		panel.add(btnC4);
		
		
		btnC3=new JButton("Car:03");
		btnC3.setBounds(10,460,100,40);
		btnC3.addActionListener(this);
		if(c1.getAvability(3).equals("1"))
		{btnC3.setBackground(Color.green);}
		else{btnC3.setBackground(Color.RED);}
		panel.add(btnC3);
		
		
		btnC2=new JButton("Car:02");
		btnC2.setBounds(10,520,100,40);
		btnC2.addActionListener(this);
		if(c1.getAvability(2).equals("1"))
		{btnC2.setBackground(Color.green);}
		else{btnC2.setBackground(Color.RED);}
		panel.add(btnC2);
		
		
		
		btnC1=new JButton("Car:01");
		btnC1.setBounds(10,580,100,40);
		btnC1.addActionListener(this);
		if(c1.getAvability(1).equals("1"))
		{btnC1.setBackground(Color.green);}
		else{btnC1.setBackground(Color.RED);}
		panel.add(btnC1);
		
			
		btnC20=new JButton("Car:20");
		btnC20.setBounds(200,40,100,40);
		btnC20.addActionListener(this);
		if(c1.getAvability(20).equals("1"))
		{btnC20.setBackground(Color.green);}
		else{btnC20.setBackground(Color.RED);}
		panel.add(btnC20);
		
		
		
		btnC19=new JButton("Car:19");
		btnC19.setBounds(200,100,100,40);
		btnC19.addActionListener(this);
		if(c1.getAvability(19).equals("1"))
		{btnC19.setBackground(Color.green);}
		else{btnC19.setBackground(Color.RED);}
		panel.add(btnC19);
	
		
		btnC18=new JButton("Car:18");
		btnC18.setBounds(200,160,100,40);
		btnC18.addActionListener(this);
		if(c1.getAvability(18).equals("1"))
		{btnC18.setBackground(Color.green);}
		else{btnC18.setBackground(Color.RED);}
		panel.add(btnC18);
		
		
		btnC17=new JButton("Car:17");
		btnC17.setBounds(200,220,100,40);
		btnC17.addActionListener(this);
		if(c1.getAvability(17).equals("1"))
		{btnC17.setBackground(Color.green);}
		else{btnC17.setBackground(Color.RED);}
		panel.add(btnC17);
		
		
		btnC16=new JButton("Car:16");
		btnC16.setBounds(200,280,100,40);
		btnC16.addActionListener(this);
		if(c1.getAvability(16).equals("1"))
		{btnC16.setBackground(Color.green);}
		else{btnC16.setBackground(Color.RED);}
		panel.add(btnC16);
		
		
		btnC15=new JButton("Car:15");
		btnC15.setBounds(200,340,100,40);
		btnC15.addActionListener(this);
		if(c1.getAvability(15).equals("1"))
		{btnC15.setBackground(Color.green);}
		else{btnC15.setBackground(Color.RED);}
		panel.add(btnC15);
		
		
		btnC14=new JButton("Car:14");
		btnC14.setBounds(200,400,100,40);
		btnC14.addActionListener(this);
		if(c1.getAvability(14).equals("1"))
		{btnC14.setBackground(Color.green);}
		else{btnC14.setBackground(Color.RED);}
		panel.add(btnC14);
		
				
		btnC13=new JButton("Car:13");
		btnC13.setBounds(200,460,100,40);
		btnC13.addActionListener(this);		
		if(c1.getAvability(13).equals("1"))
		{btnC13.setBackground(Color.green);}
		else{btnC13.setBackground(Color.RED);}		
		panel.add(btnC13);
	
		
		btnC12=new JButton("Car:12");
		btnC12.setBounds(200,520,100,40);
		btnC12.addActionListener(this);
		if(c1.getAvability(12).equals("1"))
		{btnC12.setBackground(Color.green);}
		else{btnC12.setBackground(Color.RED);}
		panel.add(btnC12);
		
		
		btnC11=new JButton("Car:11");
		btnC11.setBounds(200,580,100,40);
		btnC11.addActionListener(this);
		if(c1.getAvability(11).equals("1"))
		{btnC11.setBackground(Color.green);}
		else{btnC11.setBackground(Color.RED);}
		panel.add(btnC11);
	
		btnC30=new JButton("Car:30");
		btnC30.setBounds(390,40,100,40);
		btnC30.addActionListener(this);
		if(c1.getAvability(30).equals("1"))
		{btnC30.setBackground(Color.green);}
		else{btnC30.setBackground(Color.RED);}
		panel.add(btnC30);
		
		
		btnC29=new JButton("Car:29");
		btnC29.setBounds(390,100,100,40);
		btnC29.addActionListener(this);
		if(c1.getAvability(29).equals("1"))
		{btnC29.setBackground(Color.green);}
		else{btnC29.setBackground(Color.RED);}
		panel.add(btnC29);
		
		
		btnC28=new JButton("Car:28");
		btnC28.setBounds(390,160,100,40);
		btnC28.addActionListener(this);
		if(c1.getAvability(28).equals("1"))
		{btnC28.setBackground(Color.green);}
		else{btnC28.setBackground(Color.RED);}
		panel.add(btnC28);
		
	
		btnC27=new JButton("Car:27");
		btnC27.setBounds(390,220,100,40);
		btnC27.addActionListener(this);
		if(c1.getAvability(27).equals("1"))
		{btnC27.setBackground(Color.green);}
		else{btnC27.setBackground(Color.RED);}
		panel.add(btnC27);
		
	
		btnC26=new JButton("Car:26");
		btnC26.setBounds(390,280,100,40);
		btnC26.addActionListener(this);
		if(c1.getAvability(26).equals("1"))
		{btnC26.setBackground(Color.green);}
		else{btnC26.setBackground(Color.RED);}
		panel.add(btnC26);
	
		
		btnC25=new JButton("Car:25");
		btnC25.setBounds(390,340,100,40);
		btnC25.addActionListener(this);
		if(c1.getAvability(25).equals("1"))
		{btnC25.setBackground(Color.green);}
		else{btnC25.setBackground(Color.RED);}
		panel.add(btnC25);
		
	
		btnC24=new JButton("Car:24");
		btnC24.setBounds(390,400,100,40);
		btnC24.addActionListener(this);
		if(c1.getAvability(24).equals("1"))
		{btnC24.setBackground(Color.green);}
		else{btnC24.setBackground(Color.RED);}
		panel.add(btnC24);
		
	
		btnC23=new JButton("Car:23");
		btnC23.setBounds(390,460,100,40);
		btnC23.addActionListener(this);
		if(c1.getAvability(23).equals("1"))
		{btnC23.setBackground(Color.green);}
		else{btnC23.setBackground(Color.RED);}
		panel.add(btnC23);
		
		
		btnC22=new JButton("Car:22");
		btnC22.setBounds(390,520,100,40);
		btnC22.addActionListener(this);
		if(c1.getAvability(22).equals("1"))
		{btnC22.setBackground(Color.green);}
		else{btnC22.setBackground(Color.RED);}
		panel.add(btnC22);
		
	
		btnC21=new JButton("Car:21");
		btnC21.setBounds(390,580,100,40);
		btnC21.addActionListener(this);
		if(c1.getAvability(21).equals("1"))
		{btnC21.setBackground(Color.green);}
		else{btnC21.setBackground(Color.RED);}
		panel.add(btnC21);
		
		backBtn = new JButton("Back");
		backBtn.setBounds(128, 650, 234, 30);
		backBtn.addActionListener(this);
		backBtn.setBackground(Color.RED);
		panel.add(backBtn);
		
		logoutBtn = new JButton("Log out");
		logoutBtn.setBounds(390,10,80,20);
		logoutBtn.addActionListener(this);
		logoutBtn.setBackground(Color.blue);
		panel.add(logoutBtn);
		this.add(panel);
	}		
	public void actionPerformed(ActionEvent ac)
	{
		c1=new CarRepo();
		String command = ac.getActionCommand();
		if(command.equals(btnC11.getText()))
		{
			if(c1.getAvability(11).equals("1"))
			{
				c1.setAvability(11,0);
				btnC11.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(11,1);
				btnC11.setBackground(Color.green);
			}
		}
         
        
		else if(command.equals(btnC1.getText()))
		{
			if(c1.getAvability(1).equals("1"))
			{
				c1.setAvability(1,0);
				btnC1.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(1,1);
				btnC1.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC2.getText()))
		{
			if(c1.getAvability(2).equals("1"))
			{
				c1.setAvability(2,0);
				btnC2.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(2,1);
				btnC2.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC3.getText()))
		{
			if(c1.getAvability(3).equals("1"))
			{
				c1.setAvability(3,0);
				btnC3.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(3,1);
				btnC3.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC4.getText()))
		{
			if(c1.getAvability(4).equals("1"))
			{
				c1.setAvability(4,0);
				btnC4.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(4,1);
				btnC4.setBackground(Color.green);
			}
		}
		else if(command.equals(btnC5.getText()))
		{
			if(c1.getAvability(5).equals("1"))
			{
				c1.setAvability(5,0);
				btnC5.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(5,1);
				btnC5.setBackground(Color.green);
			}
		}
		else if(command.equals(btnC6.getText()))
		{
			if(c1.getAvability(6).equals("1"))
			{
				c1.setAvability(6,0);
				btnC6.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(6,1);
				btnC6.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC7.getText()))
		{
			if(c1.getAvability(7).equals("1"))
			{
				c1.setAvability(7,0);
				btnC7.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(7,1);
				btnC7.setBackground(Color.green);
			}
		}
		else if(command.equals(btnC8.getText()))
		{
			if(c1.getAvability(8).equals("1"))
			{
				c1.setAvability(8,0);
				btnC8.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(8,1);
				btnC8.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC9.getText()))
		{
			if(c1.getAvability(9).equals("1"))
			{
				c1.setAvability(9,0);
				btnC9.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(9,1);
				btnC9.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC10.getText()))
		{
			if(c1.getAvability(10).equals("1"))
			{
				c1.setAvability(10,0);
				btnC10.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(10,1);
				btnC10.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC12.getText()))
		{
			if(c1.getAvability(12).equals("1"))
			{
				c1.setAvability(12,0);
				btnC12.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(12,1);
				btnC12.setBackground(Color.green);
			}
		}
		else if(command.equals(btnC13.getText()))
		{
			if(c1.getAvability(13).equals("1"))
			{
				c1.setAvability(13,0);
				btnC13.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(13,1);
				btnC13.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC14.getText()))
		{
			if(c1.getAvability(14).equals("1"))
			{
				c1.setAvability(14,0);
				btnC14.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(14,1);
				btnC14.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC15.getText()))
		{
			if(c1.getAvability(15).equals("1"))
			{
				c1.setAvability(15,0);
				btnC15.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(15,1);
				btnC15.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC16.getText()))
		{
			if(c1.getAvability(16).equals("1"))
			{
				c1.setAvability(16,0);
				btnC16.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(16,1);
				btnC16.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC17.getText()))
		{
			if(c1.getAvability(17).equals("1"))
			{
				c1.setAvability(17,0);
				btnC17.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(17,1);
				btnC17.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC18.getText()))
		{
			if(c1.getAvability(18).equals("1"))
			{
				c1.setAvability(18,0);
				btnC18.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(18,1);
				btnC18.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC19.getText()))
		{
			if(c1.getAvability(19).equals("1"))
			{
				c1.setAvability(19,0);
				btnC19.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(19,1);
				btnC19.setBackground(Color.green);
			}
		}
		else if(command.equals(btnC20.getText()))
		{
			if(c1.getAvability(20).equals("1"))
			{
				c1.setAvability(20,0);
				btnC20.setBackground(Color.red);
			}
			else
			{
				c1.setAvability(20,1);
				btnC20.setBackground(Color.green);
			}
		}
		
		else if(command.equals(btnC21.getText()) || command.equals(btnC22.getText()) || command.equals(btnC23.getText()) || command.equals(btnC24.getText()) || command.equals(btnC25.getText()) || command.equals(btnC26.getText()) || command.equals(btnC27.getText()) || command.equals(btnC28.getText()) || command.equals(btnC29.getText()) || command.equals(btnC30.getText()))
		{
		JOptionPane.showMessageDialog(this, "warning! cant allocate Authorized only ");
		}
		
		else if(command.equals(doo.getText()))
		{
			String slot=c1.verifyCar(idtf.getText());
			if(slot!=null)
			{
				if(slot.equals("21"))
				{
					if(c1.getAvability(21).equals("1"))
					{
						c1.setAvability(21,0);
						btnC21.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(21,1);
						btnC21.setBackground(Color.green);
					}
				}
				
				if(slot.equals("22"))
				{
					if(c1.getAvability(22).equals("1"))
					{
						c1.setAvability(22,0);
						btnC22.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(22,1);
						btnC22.setBackground(Color.green);
					}
				}
				
				if(slot.equals("23"))
				{
					if(c1.getAvability(23).equals("1"))
					{
						c1.setAvability(23,0);
						btnC23.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(23,1);
						btnC23.setBackground(Color.green);
					}
				}
				
				if(slot.equals("24"))
				{
					if(c1.getAvability(24).equals("1"))
					{
						c1.setAvability(24,0);
						btnC24.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(24,1);
						btnC24.setBackground(Color.green);
					}
				}
				
				if(slot.equals("25"))
				{
					if(c1.getAvability(25).equals("1"))
					{
						c1.setAvability(25,0);
						btnC25.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(25,1);
						btnC25.setBackground(Color.green);
					}
				}
				
				if(slot.equals("26"))
				{
					if(c1.getAvability(26).equals("1"))
					{
						c1.setAvability(26,0);
						btnC26.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(26,1);
						btnC26.setBackground(Color.green);
					}
				}
				
				if(slot.equals("27"))
				{
					if(c1.getAvability(27).equals("1"))
					{
						c1.setAvability(27,0);
						btnC27.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(27,1);
						btnC27.setBackground(Color.green);
					}
				}
				
				if(slot.equals("28"))
				{
					if(c1.getAvability(28).equals("1"))
					{
						c1.setAvability(28,0);
						btnC28.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(28,1);
						btnC28.setBackground(Color.green);
					}
				}
				
				if(slot.equals("29"))
				{
					if(c1.getAvability(29).equals("1"))
					{
						c1.setAvability(29,0);
						btnC29.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(29,1);
						btnC29.setBackground(Color.green);
					}
				}
				
				if(slot.equals("30"))
				{
					if(c1.getAvability(30).equals("1"))
					{
						c1.setAvability(30,0);
						btnC30.setBackground(Color.red);
					}
					else
					{
						c1.setAvability(30,1);
						btnC30.setBackground(Color.green);
					}
				}
			}
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