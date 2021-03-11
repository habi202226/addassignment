package kz.aitu.oop.assignmentaddtnl;

public class Dwelling {
	 private final int windows; 
	 private final int doors; 
	 private final int rooms; 
	 private final int roof; 
	  
	 private final String garage; 
	 private final String swimmingpool; 
	 private final String hamam;
	 private final String statues; 
	 private final String garden; 
	  
	 public Dwelling (int windows, int doors, int rooms, int roof, String garage, String swimmingpool, String hamam, String statues, String garden) { 
	  this.windows=windows; 
	  this.doors=doors; 
	  this.rooms=rooms; 
	  this.roof=roof; 
	  this.garage=garage; 
	  this.swimmingpool=swimmingpool; 
	  this.hamam=hamam;
	  this.statues=statues; 
	  this.garden=garden; 
	 } 
	 
	 public int getWindows() { 
	  return windows; 
	 } 
	 
	 public int getDoors() { 
	  return doors; 
	 } 
	 
	 public int getRooms() { 
	  return rooms; 
	 } 
	 
	 public int getRoof() { 
	  return roof; 
	 } 
	 
	 public String getGarage() { 
	  return garage; 
	 } 
	 
	 public String getSwimmingpool() { 
	  return swimmingpool; 
	 } 
	 
	 public String getHamam() { 
	 return hamam; 
		 } 
	 
	 public String getStatues() { 
	  return statues; 
	 } 
	 
	 public String getGarden() { 
	  return garden; 
	 } 
	
	  
	 @Override 
	 public String toString() { 
	  return "House{"+ 
	     "windows="+windows+ 
	     ", doors="+doors+ 
	     ", rooms="+rooms+ 
	     ", roof="+roof+ 
	     ", Garage="+garage+ 
	     ", SwimmingPool="+swimmingpool+ 
	     ", Hamam="+hamam+ 
	     ", Statues="+statues+ 
	     ", Garden="+garden+ 
	     "}"; 
	 } 
	}


