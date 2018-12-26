package com.capgemini.collections.classes;

import java.util.Comparator;

public class SortbyCarMake implements Comparator<Car>
{

	
	public int compare(Car car1, Car car2) 
	{
		return car1.getMake().compareTo(car2.getMake());
	} 
		

}
