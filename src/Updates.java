
public class Updates extends RestoStatClass{
	
	int seats;
	int tables;
	int diners;
	int servings;
	
	public Updates(){
		
	}
	
	public void setCurrentCash(String type, double sales){
		if(type.equals("sales")) currentCash = currentCash + sales;
		else if(type.equals("tables")) currentCash = currentCash - costOfTable;
		else if(type.equals("seats")) currentCash = currentCash - additionalSeats;
		else if(type.equals("maintenance")) currentCash = currentCash - Maintenance;	
	}
	
	public void setTablesOwnedCount(int tables){
		numberOfTables = getTablesOwnedCount() + tables;
	}
	
	public void setActiveSessionCount(int sessions) {
		activeSessions = activeSessions + sessions;
	}
	
	public void setActiveSessionCount2(int sessions2){
		activeSessions = activeSessions - sessions2;
	}
	
	public void setTotalServingsCompleted(int completedServings) {
		totalServings = totalServings + completedServings;
	}
	
	public void setTotalMaintenance() {
		totalMaintenanceCost = totalMaintenanceCost + Maintenance;
	}
	
	public void setCustomersQueuedCount(int customer) {
		SizeOfCustomers = SizeOfCustomers - customer;
	}
	
	

}
