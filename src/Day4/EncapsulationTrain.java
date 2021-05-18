package Day4;

public class EncapsulationTrain {
	int speed = 0;
	String color = "black";

	public static void main(String[] args) {
		EncapsulationTrain train = new EncapsulationTrain();
		train.color = "green";
		System.out.println("Car Current Speed: "+ train.speed);
		train.accelrateSpeed();
		train.accelrateSpeed();
//		car.breakCar();
		train.stopTrain();
	}
	
	void accelrateSpeed() {
		speed = speed + 1;
		System.out.println("Accelerated Speed: "+speed);
	}
	
	void breakCar() {
		speed--;
		System.out.println("Break Speed: "+speed);
	}

	void stopTrain() {
		speed = 0;
		System.out.println("Train Stopped & speed is "+speed);
	}
}


	


