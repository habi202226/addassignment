package kz.aitu.oop.assignmentaddtnl;

public class Main {
		 public static void main(String[] args) { 
		  Boss boss  = new Boss();
		  
		  Dwellingconstructor constructionworker = new Dwellingconstructor(); 
		        boss.constructHouseWithGarage(constructionworker); 
		 
		        Dwelling dwelling = constructionworker.getResult(); 
		        System.out.println(dwelling.toString()); 
		 } 
		}

