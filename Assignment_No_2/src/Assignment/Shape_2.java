package Assignment;
import java.util.*;

import Practice.Circle;
import Practice.Shape;

public class Shape_2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Square s = new Square();
		s.input();
		s.area();
	}
}
interface Shape {
	void input();

	void area();
}

class Circle implements Shape 
{
	short radius;
	double pie = 3.14, area;

	public void input() 
	{
		radius = 4;
	}

	public void area() 
	{	
		System.out.println("A circle is a basic 2D shape which is measured in terms of its radius !");
		System.out.println("AREA OF CIRCLE = pie * radius * radius");
		area = pie * radius * radius;		
		System.out.println("AREA OF CIRCLE : " + area);
	}
}
class Square extends Circle
{
	short side;
	double area;
	
	public void input() 
	{
		super.input();
		side = 6;	
	}
	public void area()
	{
		System.out.println("A shape that has four straight sides of the same length and four angles of 90 degrees !");
		System.out.println("AREA OF SQUARE = side * side");
		super.area();
		area = side * side;
		System.out.println("AREA OF SQUARE : " + area);
	}
}
