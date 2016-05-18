package fun;

public class Train {

	private int cars;
	private int locamotive;
	private double rate;
	private int passangers;
	private int passangersPerCar;
	
	
	public Train(int Passangers, double miles, double pricePerMile) {
		cars = 0;
		locamotive = 1;
		rate = pricePerMile * miles;
	}
	public double rate(){
		return rate;
	}
	public int trainCars(int passengersPerCar){
		cars = passangers * passangersPerCar;
		return cars;
	}
	public int locamotives(int carsPerLocamotive){
		locamotive = cars * carsPerLocamotive;
		return locamotive;
	}
}
