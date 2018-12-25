package com.capgemini.collections.car;

import java.util.Comparator;

public class Sortbyname implements Comparator<Car>
{

	
	public int compare(Car car1, Car car2) 
	{
		return car1.getMake().compareTo(car2.getMake());
	} 
		

}
