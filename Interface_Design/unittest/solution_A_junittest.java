import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import solution_A.Car;
import solution_A.Plane;

class solution_A_junittest {

	@Test
	void carWheelTest() {

		Car car = new Car();

		int result = car.set_num_of_wheels();
		Assert.assertEquals(4, result);
		
	}

	@Test
	void carPassengerTest() {
		
		Car car = new Car();

		int result = car.set_num_of_passengers();

		Assert.assertEquals(5, result);
	}
	
	@Test
	void carGasTest() {
		
		Car car = new Car();

		boolean result = car.has_gas();

		Assert.assertEquals(true, result);
		
	}
	
	@Test
	void planeWheelTest() {
		
		Plane plane = new Plane();
		
		int result = plane.set_num_of_wheels();
		
		Assert.assertEquals(6, result);
		
	}
	
	@Test
	void planePassengerTest() {
		
		Plane plane = new Plane();
		
		int result = plane.set_num_of_passengers();
		
		Assert.assertEquals(500, result);
		
	}
	
	@Test
	void planeGasTest() {
		
		Plane plane = new Plane();
		
		boolean result = plane.has_gas();
		
		Assert.assertEquals(false, result);
		
	}

}
