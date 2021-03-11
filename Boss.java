package kz.aitu.oop.assignmentaddtnl;

	public class Boss {
		 
		 public void constructHouseWithGarage(ConstructionWorker constructionworker) {
			 constructionworker.buildRooms(2);
			 constructionworker.buildDoors(2);
			 constructionworker.buildWindows(4);
			 constructionworker.buildRoof(2);
			 constructionworker.buildGarage("true");
			 constructionworker.buildSwimmingPool(null);
			 constructionworker.buildHamam(null);
			 constructionworker.buildGarden(null);
			 constructionworker.buildStatues(null);
		 }
		 public void constructHouseWithSwimmingPool(ConstructionWorker constructionworker) {
			 constructionworker.buildRooms(1);
			 constructionworker.buildDoors(2);
			 constructionworker.buildWindows(3);
			 constructionworker.buildRoof(2);
			 constructionworker.buildGarage(null);
			 constructionworker.buildSwimmingPool("true");
			 constructionworker.buildHamam(null);
			 constructionworker.buildGarden(null);
			 constructionworker.buildStatues(null);
		 }
		 public void constructHouseWithHamam(ConstructionWorker constructionworker) {
			 constructionworker.buildRooms(1);
			 constructionworker.buildDoors(2);
			 constructionworker.buildWindows(3);
			 constructionworker.buildRoof(2);
			 constructionworker.buildGarage(null);
			 constructionworker.buildSwimmingPool(null);
			 constructionworker.buildHamam("true");
			 constructionworker.buildGarden(null);
			 constructionworker.buildStatues(null);
		 }
		 public void constructHouseWithSwimStatues(ConstructionWorker constructionworker) {
			 constructionworker.buildRooms(1);
			 constructionworker.buildDoors(2);
			 constructionworker.buildWindows(3);
			 constructionworker.buildRoof(2);
			 constructionworker.buildGarage(null);
			 constructionworker.buildSwimmingPool(null);
			 constructionworker.buildHamam(null);
			 constructionworker.buildGarden(null);
			 constructionworker.buildStatues("true");
		 }
		 public void constructHouseWithSwimGarden(ConstructionWorker constructionworker) {
			 constructionworker.buildRooms(4);
			 constructionworker.buildDoors(2);
			 constructionworker.buildWindows(3);
			 constructionworker.buildRoof(2);
			 constructionworker.buildGarage(null);
			 constructionworker.buildSwimmingPool(null);
			 constructionworker.buildHamam(null);
			 constructionworker.buildGarden("true");
			 constructionworker.buildStatues(null);
		 }
		}


