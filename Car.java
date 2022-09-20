package week1.day1;

public class Car {
	
	public void driveCar() {
		System.out.println("Car has been started");

	}
	public void applyBrake() {
		System.out.println("Brakes applied and car stopped");
		}
	public void soundHorn() {
		System.out.println("Horn blown and its working");
			}
	
	public void isPuncture() {
		System.out.println("Car tyres are in good condition");		
	}
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
		 

	}

}
