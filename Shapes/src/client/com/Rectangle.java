package client.com;

public class Rectangle extends Shapes {
	private double w, h;
	public Rectangle(){
		this.w=0.0;
		this.h=0.0;
	}
	
	public Rectangle (double w, double h){
		this.w=w;
		this.h=h;
	}
	public double area(){
		return this.w*this.h;
	}
	
}
