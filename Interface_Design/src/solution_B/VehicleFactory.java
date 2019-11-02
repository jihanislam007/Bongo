package solution_B;

public class VehicleFactory {
	
	public Vehicle getvehicle(String vehicleType) {		
		
		if(vehicleType.equals("car")) {
			return new CarB();
		}
		else if(vehicleType.equals("plane")) {
			return new PlaneB();
		}
		
		return null;
		}

}
