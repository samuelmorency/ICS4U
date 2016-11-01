/*******************************************************************************
* Created by: Sam Morency
* Created on: October, 2016
* Created for: ICS4U
* This is a program that will return properties of a chosen triangle
********************************************************************************/

public class Triangle {
	
	private double _sideA;
	private double _sideB;
	private double _sideC;
	private double _semiPerimeter;
	
	//Constructor
	public Triangle(double contSideA, double contSideB, double contSideC){
		this._sideA = contSideA;
		this._sideB = contSideB;
		this._sideC = contSideC;
		this._semiPerimeter = (this._sideA + this._sideB + this._sideC)/2;
	}
	
	//Protected Methods
	protected String getType(){
		//display type only if triangle is valid
		if (this.isTriangleValid() == true){
			if (this._sideA == this._sideB && this._sideB == this._sideC){
				return "Equilateral";
			}
			else if (this._sideA == this._sideB || this._sideB == this._sideC || this._sideC == this._sideA){
				return "Isocseles";
			}
			else {
				return "Scalene";
			}
		}
		else{
			return "This is not a triangle";
		}
	}
	
	protected boolean isTriangleValid(){
		//if each side length is a positive value
		if (this._sideA > 0 && this._sideB > 0 && this._sideC > 0){
			//if two side lengths are greater than third
			if (this._sideA + this._sideB > this._sideC && this._sideB + this._sideC > this._sideA && this._sideC + this._sideA > this._sideB){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	
	public double getArea(){
		double area = Math.sqrt(this._semiPerimeter*(this._semiPerimeter-this._sideA)*(this._semiPerimeter-this._sideB)*(this._semiPerimeter-this._sideC));
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = this._sideA + this._sideB + this._sideC;
		return perimeter;
	}
	//Level 4+ Methods
	public double getHeight(){
		double height = 2 * (this.getArea() / this._sideB);
		return height;
	}
	
	public double getInnerCircleRadius(){
		double innerRadius = this.getArea() / this._semiPerimeter;
		return innerRadius;
	}
	
	public double getCircumCircleArea(){
		double circumArea = this._sideA*this._sideB*this._sideC/(4*this.getArea());
		return circumArea;
	}
}
