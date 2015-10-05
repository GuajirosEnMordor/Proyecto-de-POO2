package client.com;

public class Main {
	
	public static void main(String[] args){
		Shapes[] Shapes=new Shapes[4];
		Shapes[0]= new Circle();
		Shapes[1]= new Circle();
		Shapes[2]= new Rectangle(10,20);
		Shapes[3]= new Rectangle(12.3,24.8);
		System.out.println(Shapes[2].area());
	}

}
