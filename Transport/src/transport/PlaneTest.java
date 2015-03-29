package transport;

public class PlaneTest {

	public static void main(String[] args) {
		Plane Alpha = new Plane(5.25, 125, 5);

		System.out.println(Alpha.GetTotalMiles());
		Alpha.fly(25.0,2);
		System.out.println(Alpha.GetTotalMiles());
	}
	
}
