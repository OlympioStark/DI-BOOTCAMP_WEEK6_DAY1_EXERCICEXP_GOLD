package ExercicesGold;

/**
 * @author Gilles-Chris MAKE
 *
 */
public class Car {
	
	String marque;
	String model;
	int year;
	String color;
	double price;

	// constructor no parameters
	public Car() {
		this.marque = "Peugeot";
		this.model = "406";
		this.year = 2020;
		this.color = "Gris";
		this.price = 0.0;
	}
	
	// Constructor with three parameters
	public Car(String marque, String model, int year) {
		super();
		this.marque = marque;
		this.model = model;
		this.year = year;
	}
	
	// Constructor with all parameters
	public Car(String marque, String model, int year, String color, double price) {
		super();
		this.marque = marque;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}
	
	public void displaycarInfo () {
		System.out.println("Marque : " + marque +
							"\nModèle : " + model +
							"\nAnnée : " + year +
							"\nCouleur : " + color +
							"\nPrix : " + price + "\n");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car = new Car();
		car.displaycarInfo();
		Car car1 = new Car("Roll Roys", "Phantom", 2019);
		car1.displaycarInfo();
		Car car2 = new Car("Lamborguini", "El Diablo", 2018, "Noir", 12000000);
		car2.displaycarInfo();
		

	}

	

}
