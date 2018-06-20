public interface RestoStatInterface {
	public double getCurrentCash();
	public int getTablesOwnedCount();
	public int getActiveSessionCount();
	public int getTotalServingsCompleted();
	public double getTotalMaintainanceCost();
	public double computeAverageEarningsPerMinute();
	public double getTotalSalesByDishType(String dishType);
	public double getTotalKilogramsSoldByDishType(String dishType);
	public int getCustomersQueuedCount();
}
