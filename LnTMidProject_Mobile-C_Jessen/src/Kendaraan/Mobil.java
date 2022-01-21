package Kendaraan;

public class Mobil extends Kendaraan {
	
	public void nyala(String type, String name) {
		
		if (type.equals("Supercar")) {
			System.out.println("Boosting!");
		}else if (type.equals("SUV") || type.equals("Minivan")) {
			System.out.println("Turning on entertainment system...");	
		} 
		
	}
	
	
}
