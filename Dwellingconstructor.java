package kz.aitu.oop.assignmentaddtnl;

public class Dwellingconstructor implements ConstructionWorker{
		 private int windows; 
		 private int doors; 
		 private int rooms; 
		 private int roof; 
		  
		 private String garage; 
		 private String swimmingpool; 
		 private String hamam;
		 private String statues; 
		 private String garden; 
		  
		  
		 public Dwelling getResult() { 
		        return new Dwelling(windows, doors, rooms, roof, garage, swimmingpool, hamam, statues, garden); 
		    } 
		 
		 @Override 
		 public void buildRooms(int rooms) { 
		  // TODO Auto-generated method stub 
		  this.rooms=rooms; 
		 } 
		 
		 
		 @Override 
		 public void buildDoors(int doors) { 
		  // TODO Auto-generated method stub 
		  this.doors=doors; 
		 } 
		
}
