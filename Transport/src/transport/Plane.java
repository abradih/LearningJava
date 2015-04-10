package transport;

/**
 * Makes a Plane.
 * 
 * @author Amber
 *
 */
public class Plane {
	// Life of Plane
	private int odometer;
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
	private double ticket;

	/**
	 * Makes new plane with given parameters.
	 * 
	 * @param costPerMile
	 * @param MaxPassengers
	 */
	public Plane(int maxPassengers, double tank, double ticketPrice ) {
		// Life of Plane
		odometer = 0;
		trips = 0;
		totalPassengers = 0;
		// for plane
		sizeOfPlane = maxPassengers;
		tankSize = tank;
		ticket = ticketPrice;

	}

	public int GetTotalMiles() {
		return odometer;
	}

	public void fly(int miles, double mpg) {
		odometer = odometer + miles;
		trips++;

		// todo crash if fuel <0

	}

	public double getTotalTickets() {
		double result = (ticket * totalPassengers);
		return result;
	}
}
