package Day4;

public class AbstractionPlane {

	int fuel = 20;
	int maxFuelCapacity = 25;

	public static void main(String[] args) {
		AbstractionPlane plane = new AbstractionPlane();
		plane.fuelPlane();
		plane.fuelPlane();
		plane.fuelPlane();
		plane.fuelPlane();
		plane.fuelPlane();
		plane.runPlane();
	}

	void fuelPlane() {
		if (maxFuelCapacity > fuel) {
			fuel += 1;
			System.out.println("Fuel: " + fuel);
		} else {
			System.out.println("Fuel Capacity is reached: " + fuel);
		}
	}

	void runPlane() {
		for (int i = fuel; i > 0; i--) {
			if (i > 1) {
				fuel--;
				System.out.println("Fuel: " + fuel);
			} else {
				System.out.println("Please Fuel Up Car: ");
				break;
			}
		}
	}


		

	}


