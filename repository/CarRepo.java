package repository;
import java.lang.*;
import java.util.ArrayList;
import entity.*;
import javax.swing.*;
import java.awt.*;

import interfaces.*;

public class CarRepo
{
	DatabaseConnection dbc;
	String avb,veri;
	

	public CarRepo()
	{
		dbc = new DatabaseConnection();
	}
	
		public String getAvability(int n)
	{
	
		
		String query = "SELECT * FROM parking WHERE slot='"+n+"';";
		try
		{
		dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		while(dbc.result.next())
			{
				
				String slot = dbc.result.getString("slot");
				String avability = dbc.result.getString("avability");
				avb=avability;
				
				
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		
		
		return avb;
	}
	
	public void setAvability(int n,int m)
	{
		String query = "UPDATE parking SET slot='"+n+"', avability= '"+m+"' WHERE slot='"+n+"'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
			System.out.println(n+m);
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	
	public String verifyCar(String id1)
	{
	
		
		String query = "SELECT * FROM fixedusers WHERE id='"+id1+"';";
		try
		{
		dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		while(dbc.result.next())
			{
				String id = dbc.result.getString("id");
				String slotnumber = dbc.result.getString("slotnumber");
				
				veri=slotnumber;
				
				
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return veri;
	}
		
		public String verifyslot(String slot)
	{
	
		
		String querry = "SELECT * FROM fixedusers WHERE slot='"+slot+"';";
		try
		{
		dbc.openConnection();
		dbc.result = dbc.st.executeQuery(querry);
		while(dbc.result.next())
			{
				String id = dbc.result.getString("id");
				String slotnumber = dbc.result.getString("slotnumber");
				
				veri=id;
				
				
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		
		
		return veri;
	}
	
	public boolean insert(String id,String slot)
	{ 	
		boolean bb;
		String querrry = "INSERT INTO fixedusers VALUES ('"+id+"',"+slot+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(querrry);
			dbc.closeConnection();
			bb= true;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			bb= false;
		}
		return bb;
	}
	
	public void delete(String Id)
	{
		String queery = "DELETE from fixedusers WHERE Id='"+Id+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(queery);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	
	
	public String[][] getAllcars()
	{
		ArrayList<Fcar> ar = new ArrayList<Fcar>();
		String queryy = "SELECT * FROM fixedusers;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(queryy);
			
		
			while(dbc.result.next())
			{
				String Idd = dbc.result.getString("id");
				String slott = dbc.result.getString("slotnumber");
				
				Fcar F = new Fcar(Idd,slott);
				ar.add(F);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][2];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((Fcar)obj[i]).getId();
			data[i][1] = ((Fcar)obj[i]).getSlot();
		}
		return data;
	}
	
	
}	