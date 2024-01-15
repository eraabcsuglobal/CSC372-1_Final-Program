public class Vehicle {
	
	private String make;
	private String model;
	private double milesPerGallon;
	
	// create vehicle object
	public Vehicle(String make, String model, double milesPerGallon) {
		this.make = make;
		this.model = model;
		this.milesPerGallon = milesPerGallon;
	}
	
	public String getMake() {
		return make;
	}
	
	public double getMPG() {
		return milesPerGallon;
	}
	
	public String getModel() {
		return model;
	}

}