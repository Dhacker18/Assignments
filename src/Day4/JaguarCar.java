package Day4;

public class JaguarCar extends ParentCar {
	boolean autoGearBox = true;

	public static void main(String[] args) {
		JaguarCar jaguarCar = new JaguarCar();
		jaguarCar.color = "red";
		jaguarCar.accelrateSpeed();
		jaguarCar.brakeCar();
		//same class method getting called
		jaguarCar.setEngine();
		System.out.println("Car Engine: " + jaguarCar.engine);
		//parent class method getting called
		jaguarCar.setEngine("V2");
		System.out.println("Car Engine: " + jaguarCar.engine);

	}
	void accelrateSpeed() {
		speed = speed + 2;
		System.out.println("Accelerated Speed: "+speed);
	}
	
	void setEngine() {
		engine = "Version_";
		System.out.println("Engine: "+engine);
	}
}


