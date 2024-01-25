/*******************************************************************************
* Created by: Sam Morency
* Created on: October, 2016
* Created for: ICS4U
* This is a stub class for a program that will return properties of a chosen triangle
********************************************************************************/


import java.util.Scanner;

public class Stub {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is side a");
		//only accept double
		while(!scan.hasNextDouble()) {
		    System.out.println("Please input a number value");
			scan.next();
		}
		double a = scan.nextDouble();
		System.out.println("What is side b");
		//only accept double
		while(!scan.hasNextDouble()) {
			System.out.println("Please input a number value");
		    scan.next();
		}
		double b = scan.nextDouble();
		System.out.println("What is side c");
		//only accept double
		while(!scan.hasNextDouble()) {
			System.out.println("Please input a number value");
		    scan.next();
		}
		double c = scan.nextDouble();
		
		Triangle myTriangle = new Triangle(a,b,c);
		
		System.out.println("Valid: " + myTriangle.isTriangleValid());
		System.out.println("Type: " + myTriangle.getType());
		System.out.println("Area: " + myTriangle.getArea());
		System.out.println("Perimeter: " + myTriangle.getPerimeter());
		System.out.println("Height: " + myTriangle.getHeight());
		System.out.println("Largest Inner Circle Radius: " + myTriangle.getInnerCircleRadius());
		System.out.println("Area of Circumcircle: " + myTriangle.getCircumCircleArea());
	}

}
