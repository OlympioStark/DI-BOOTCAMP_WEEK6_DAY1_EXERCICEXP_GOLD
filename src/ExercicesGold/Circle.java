package ExercicesGold;

public class Circle {
	
	double raduis = 0;
	double area = 0;

	public Circle() {
		this.raduis = 1;
	}

	public Circle(double raduis) {
		this.raduis = raduis;
		this.area = Math.PI * (raduis * raduis);
	}
	
	public double getArea() {
		return this.area;
	}
	
	public void afficher() {
		System.out.println("le rayon est de : " + raduis + "\nL'aire du cercle est de : " + area);
	}

	public static void main(String[] args) {

		Circle circle1 = new Circle(2.0);
		circle1.afficher();
		Circle circle2 = new Circle(12);
		circle2.afficher();
		Circle circle3 = new Circle(24);
		circle3.afficher();
		
		circle2.getArea();

	}

}
