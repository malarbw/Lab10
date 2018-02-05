
public class UsedCars extends Cars {
	private double mileage;
	
	
	public UsedCars(String make, String model, int year, double price, double mileage) {
		super(make,model,year,price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10s Price: $ %-10s (Used) Miles: %-10s", super.getMake(), 
				super.getModel(), super.getYear(), super.getPrice(), mileage);	}

}
