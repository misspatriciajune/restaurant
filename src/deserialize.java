import java.io.*;

public class deserialize {
	public static void main(String [] args) throws IOException, ClassNotFoundException{

		Parameter capital;
		Parameter numberOfTables;
		Parameter RateOfMeat;
		Parameter RateOfFish;
		Parameter RateOfVegetable;
		Parameter WeightOfMeat;
		Parameter WeightOfFish;
		Parameter WeightOfVegetables;
		Parameter Maintenance;
		Parameter additionalSeats;
		Parameter singleSeat;
		Parameter SizeOfCustomers;
		Parameter IncomingCustomers;
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("wx2lparameter.ser"));
		
		capital = (Parameter) ois.readObject();
		numberOfTables = (Parameter) ois.readObject();
		RateOfMeat = (Parameter) ois.readObject();
		RateOfFish = (Parameter) ois.readObject();
		RateOfVegetable = (Parameter) ois.readObject();
		WeightOfMeat = (Parameter) ois.readObject();
		WeightOfFish = (Parameter) ois.readObject();
		WeightOfVegetables = (Parameter) ois.readObject();
		Maintenance = (Parameter) ois.readObject();
		additionalSeats = (Parameter) ois.readObject();
		singleSeat = (Parameter) ois.readObject();
		SizeOfCustomers = (Parameter) ois.readObject();
		IncomingCustomers = (Parameter) ois.readObject();
		
		ois.close();
		
		System.out.println(capital.getLabel()+" "+capital.getStringValue()+" "+capital.getIntValue()+" "+capital.getDoubleValue());
	
		System.out.println(numberOfTables.getLabel()+" "+numberOfTables.getStringValue()+" "+numberOfTables.getIntValue()+" "+numberOfTables.getDoubleValue());
	
		System.out.println(RateOfMeat.getLabel()+" "+RateOfMeat.getStringValue()+" "+RateOfMeat.getIntValue()+" "+RateOfMeat.getDoubleValue());
		
		System.out.println(RateOfFish.getLabel()+" "+RateOfFish.getStringValue()+" "+RateOfFish.getIntValue()+" "+RateOfFish.getDoubleValue());
		
		System.out.println(RateOfVegetable.getLabel()+" "+RateOfVegetable.getStringValue()+" "+RateOfVegetable.getIntValue()+" "+RateOfVegetable.getDoubleValue());
		
		System.out.println(WeightOfMeat.getLabel()+" "+WeightOfMeat.getStringValue()+" "+WeightOfMeat.getIntValue()+" "+WeightOfMeat.getDoubleValue());
		
		System.out.println(WeightOfFish.getLabel()+" "+WeightOfFish.getStringValue()+" "+WeightOfFish.getIntValue()+" "+WeightOfFish.getDoubleValue());
		
		System.out.println(WeightOfVegetables.getLabel()+" "+WeightOfVegetables.getStringValue()+" "+WeightOfVegetables.getIntValue()+" "+WeightOfVegetables.getDoubleValue());
		
		System.out.println(Maintenance.getLabel()+" "+Maintenance.getStringValue()+" "+Maintenance.getIntValue()+" "+Maintenance.getDoubleValue());
		
		System.out.println(additionalSeats.getLabel()+" "+additionalSeats.getStringValue()+" "+additionalSeats.getIntValue()+" "+additionalSeats.getDoubleValue());
		
		System.out.println(singleSeat.getLabel()+" "+singleSeat.getStringValue()+" "+singleSeat.getIntValue()+" "+singleSeat.getDoubleValue());
	
		System.out.println(SizeOfCustomers.getLabel()+" "+SizeOfCustomers.getStringValue()+" "+SizeOfCustomers.getIntValue()+" "+SizeOfCustomers.getDoubleValue());
	
		System.out.println(IncomingCustomers.getLabel()+" "+IncomingCustomers.getStringValue()+" "+IncomingCustomers.getIntValue()+" "+IncomingCustomers.getDoubleValue());
		
	}
}
