package solution_A;

public class Plane implements vehicle{

	 public int set_num_of_wheels() {
		
		int wheels = 6;
		System.out.println("Number of plane wheels : "+wheels);
		return wheels;
		
	}
	
	public int set_num_of_passengers() {			

		int passenger = 500;
		System.out.println("Number of plane passengers : " + passenger);
		return passenger;
			
		}
	
	public boolean has_gas() {

		Boolean gas = false;
		System.out.println(gas);
		return gas;
		
	}
	
}
