package solution_B;

public class PlaneB implements Vehicle{

	@Override
	public int set_num_of_wheels() {
		
		int wheels = 10;
		return wheels;
	}

	@Override
	public int set_num_of_passengers() {
		
		int passengers = 400;
		return passengers;
	}

	@Override
	public boolean has_gas() {
		
		boolean gas = true;
		return gas;
	}

}
