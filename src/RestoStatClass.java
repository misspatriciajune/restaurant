
public class RestoStatClass implements RestoStatInterface {
	
	//INITIALIZED VARIABLES
	
		//Deserialized values
		double currentCash;
		int numberOfTables;
		double RateOfMeat;
		double RateOfFish;
		double RateOfVegetable;
		double WeightOfMeat;
		double WeightOfFish;
		double WeightOfVegetables;
		double Maintenance;
		double additionalSeats;
		double costOfTable;
		int SizeOfCustomers;
		int IncomingCustomers;
		
		//Actual Values
		int activeSessions;
		int totalServings;
		double totalMaintenanceCost;
		int totalMins;
		double averageEarningsPerMin;
		double totalSales;
		double totalSalesMeat;
		double totalSalesFish;
		double totalSalesVeggies;
		double totalKilograms;
		double totalKilogramMeat;
		double totalKilogramFish;
		double totalKilogramVeggies;
		double totalKilogramSoldMeat;
		double totalKilogramSoldFish;
		double totalKilogramSoldVeggies;
	
	public RestoStatClass(){
		
		currentCash = 1000000.0;
		
		numberOfTables = 3;
		
		RateOfMeat = 149.99;
		RateOfFish = 119.99;
		RateOfVegetable = 84.99;
		
		WeightOfMeat = 0.1133;
		WeightOfFish = 0.0656;
		WeightOfVegetables = 0.2212;
		
		Maintenance = 0.1567;
		
		additionalSeats = 4499.99;
		costOfTable = 14499.99;
		
		SizeOfCustomers = 7;
		IncomingCustomers = 11;
		
	}

	//getCurrentCash
	public double getCurrentCash() {
		// TODO Auto-generated method stub
		
		return currentCash;
	}

	//getTablesOwnedCount
	public int getTablesOwnedCount() {
		// TODO Auto-generated method stub
		
		return numberOfTables;
	}

	//getActiveSessionCount
	public int getActiveSessionCount() {
		// TODO Auto-generated method stub
		
		return activeSessions;
	}

	//getTotalServingsCompleted
	public int getTotalServingsCompleted() {
		// TODO Auto-generated method stub
		
		return totalServings;
	}

	//getTotalMaintainanceCost
	public double getTotalMaintainanceCost() {
		// TODO Auto-generated method stub
		
		return totalMaintenanceCost;
	}

	//computeAverageEarningsPerMinute
	public double computeAverageEarningsPerMinute() {
		// TODO Auto-generated method stub
		
		averageEarningsPerMin = totalSales/totalMins;
		
		return averageEarningsPerMin;
	}

	//getTotalSalesByDishType
	public double getTotalSalesByDishType(String dishType) {
		// TODO Auto-generated method stub
		if(dishType.equals("meat")) return totalSalesMeat = totalSalesMeat + RateOfMeat;
		else if(dishType.equals("fish")) return totalSalesFish = totalSalesFish + RateOfFish;
		else if(dishType.equals("veggies")) return totalSalesVeggies = totalSalesVeggies + RateOfVegetable;
		else return 0;
	}

	//getTotalKilogramsSoldByDishType
	public double getTotalKilogramsSoldByDishType(String dishType) {
		// TODO Auto-generated method stub
		if(dishType.equals("meat")) return totalKilogramSoldMeat = totalKilogramSoldMeat + WeightOfMeat;
		else if(dishType.equals("fish")) return totalKilogramSoldFish = totalKilogramSoldFish + WeightOfFish;
		else if(dishType.equals("veggies")) return totalKilogramSoldVeggies = totalKilogramSoldVeggies + WeightOfVegetables;
		else return 0;
	}

	//getCustomerQueuedCount
	public int getCustomersQueuedCount() {
		// TODO Auto-generated method stub
		
		return SizeOfCustomers;
	}	
	

}
