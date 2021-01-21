package entity;

import java.lang.*;

public class Fcar
{
	private String Id;
	private String Slot;
	
	
	public Fcar(){}
	public Fcar(String Id, String Slot)
	{
		this.Id =Id;
		this.Slot = Slot;
		
	}
	
	public void setId(String Id){this.Id = Id;}
	public void setSlot(String Slot){this.Slot = Slot;}

	public String getId(){return Id;}
	public String getSlot(){return Slot;}
}