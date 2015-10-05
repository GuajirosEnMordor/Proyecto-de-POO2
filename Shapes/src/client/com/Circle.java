package client.com;

public class Circle extends Shapes {
	
	public static final double PI=3.141592;
	private double radius;
	public void serRadius(double r){
		this.radius=r;
	}
	public double getRadius(){
		return this.radius;
	}
	public double area(){
		return PI*this.radius*this.radius;
	}
}
