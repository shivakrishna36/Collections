package com.capgemini.collections.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collections.classes.Car;
import com.capgemini.collections.classes.SortbyCarMake;

public class CarTest 
{

	private Car car1,car2,car3;
	
	@Before
	public void setUp() 
	{
		car1 = new Car("camry",2002,80000,"Toyota");
		car2 = new Car("nano",1998,100000,"Tata");
		car3 = new Car("nano",2002,500000,"Tata");
	}
	
	@Test
	public void testForCar1()
	{
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		assertEquals("Car [model=" + car1.getModel() + ", year=" + car1.getYear() + ", price=" + car1.getPrice()
				+ ", make=" + car1.getMake() + "]",car1.displayOne(list));
	}
	
	@Test
	public void testForCar2()
	{
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		assertEquals("Car [model=" + car2.getModel() + ", year=" + car2.getYear() + ", price=" + car2.getPrice()
				+ ", make=" + car2.getMake() + "]",car2.displayTwo(list));
	}
	
	@Test
	public void testForCar3()
	{
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		assertEquals("Car [model=" + car3.getModel() + ", year=" + car3.getYear() + ", price=" + car3.getPrice()
				+ ", make=" + car3.getMake() + "]",car3.displayThree(list));
	}
	
	@Test
	public void testForEqualObject()
	{
		assertEquals(car2,car3);
	}
	
	@Test
	public void testForNonEqualObject()
	{
		assertNotEquals(car1,car3);
	}
	
	@Test
	public void testByUsingComparator()
	{
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		String name = "[Car [model=nano, year=1998, price=100000, make=Tata], Car [model=nano, year=2002, price=500000, make=Tata], Car [model=camry, year=2002, price=80000, make=Toyota]]";
		Collections.sort(list, new SortbyCarMake());
		assertEquals(name,list.toString());
	}

}
