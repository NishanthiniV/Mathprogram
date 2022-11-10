package name;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int x,y,z;
		System.out.println("enter the first integer");
		x=sc.nextInt();
		System.out.println("enter the second integer");
		y=sc.nextInt();
		System.out.println("enter the third integer");
		z=sc.nextInt();
		System.out.println("addition of x+y ="+(x+y));
		System.out.println("subtraction of x+y ="+(x-y));
		System.out.println("multiplication of x*y ="+(x*y));
		System.out.println("divison of x/y="+(x/y));
		System.out.println("module of x%y =" +(x%y));
		System.out.println("operator precedence x*y/z= "+(x*y/z));
		System.out.println("integer math x/y"+(x/y));
		System.out.println("foalting point math x/y"+(x/y));
		System.out.println("using math abs"+Math.abs(x));
		System.out.println(" math min"+Math.min(x,y));
		System.out.println(" math maz"+Math.max(x, y));
		

		float n;
		System.out.println("enter the float number");
		n=sc.nextFloat();
		System.out.println(" math ceil"+Math.ceil(n));	
		System.out.println(" math floor"+Math.floor(n));
		System.out.println("math round"+Math.round(n));
		System.out.println(" math random"+Math.random());

		
		double s;
		System.out.println("enter the double value" );
		s=sc.nextDouble();
		double t;
		t=sc.nextDouble();
		
		System.out.println("math exp"+Math.exp(s));
		System.out.println("math log "+Math.log(s));
		System.out.println("math log10"+Math.log10(s));
		System.out.println("math pow"+Math.pow(s,t));
		System.out.println("math sqrt"+Math.sqrt(s));
		
		System.out.println("math pi value"+Math.PI);
		System.out.println("math sin value"+Math.sin(s));
		System.out.println("math cos value"+Math.cos(s));
		System.out.println("math tan value"+Math.tan(s));
		System.out.println("math asin value"+Math.asin(t));
		System.out.println("math acos value"+Math.acos(t));
		System.out.println("math atan value"+Math.atan(t));
		System.out.println("math atan2 value"+Math.atan2(s,t));
		System.out.println("math sinh value"+Math.sinh(s));
		System.out.println("math cosh value"+Math.cosh(s));
		System.out.println("math tanh value"+Math.tanh(s));
		System.out.println("math todegrees value"+Math.toDegrees(s));
		System.out.println("math toradians value"+Math.toRadians(s));






	}

}
