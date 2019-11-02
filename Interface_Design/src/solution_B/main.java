package solution_B;

public class main {

	public static void main(String[] args) {

		//System.out.println("hello B");
		VehicleFactory factory = new VehicleFactory();
		
		System.out.println("car : ");
		
		Vehicle vehicleCar = factory.getvehicle("car");		
		
		
		System.out.println(vehicleCar.set_num_of_wheels());
		System.out.println(vehicleCar.set_num_of_passengers());
		System.out.println(vehicleCar.has_gas());

		System.out.println("\nPlane : ");
		
		Vehicle vehiclePlane = factory.getvehicle("plane");
		
		System.out.println(vehiclePlane.set_num_of_wheels());
		System.out.println(vehiclePlane.set_num_of_passengers());
		System.out.println(vehiclePlane.has_gas());
		
	}

}
