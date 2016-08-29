
public class Car {

	String make;
	String Model;
	int year;
	double price;
	
	public Car(String make, String model, int year, double price){
	this.make = make;
	this.Model = model;
	this.price = price;
	this.year = year;
	
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

public String toString(){
	return (getMake() + getModel() + getYear() + getPrice());
}
}
