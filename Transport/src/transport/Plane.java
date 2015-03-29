package transport;

/**
 * Makes a Plane.
 * 
 * @author Amber
 *
 */
public class Plane {
	// Life of Plane
	private double odometer;
	private int trips;
	private int totalPassengers;
	private double totalRevenue;
	private int sizeOfPlane;

	// Per Flight
	private int passengers;
	private double perMileRate;
	private double milesPerGallon;
	private double tankSize;
	private double fuel;
	private double fuelUsed;
	/**
	 * Makes new plane with given parameters.
	 * 
	 * @param costPerMile
	 * @param MaxPassengers
	 */
	public Plane(double costPerMilePassengers, int maxPassengers, double tank) {
		// Life of Plane
		odometer = 0;
		trips = 0;
		totalPassengers = 0;
		// for plane
		perMileRate = costPerMilePassengers;
		sizeOfPlane = maxPassengers;
		tankSize = tank;
		
		
	}

	public double GetTotalMiles() {
		return odometer;
	}

	public void fly(double miles, double mpg) {
		odometer = odometer + miles;
		trips++;
		
		// todo crash if fuel <0

	}
}
