package solution_B;

public class CarB implements Vehicle{

	@Override
	public int set_num_of_wheels() {

		int wheels = 4;
		return wheels;
	}

	@Override
	public int set_num_of_passengers() {

		int passengers = 10;
		return passengers;
	}

	@Override
	public boolean has_gas() {
		
		boolean gas = false;
		return gas;
	}
	
		

}
