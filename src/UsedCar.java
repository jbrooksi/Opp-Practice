
public class UsedCar extends Car {
	int miles;

	public UsedCar(String make, String model, int year, double price, int Miles ){
	
	super(make, model, year, price);
	this.miles= miles;
	
}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int additionalMiles) {
		this.miles = additionalMiles;
	}

	public String toString(){
		return (getMake() + getModel() + getYear() + getPrice() + getMiles() + "Miles");
	}
}
