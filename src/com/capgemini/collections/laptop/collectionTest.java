package com.capgemini.collections.laptop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.LinkedHashSet;

import org.junit.Before;
import org.junit.Test;

public class collectionTest 
{
	private Laptop laptop,laptop1,laptop2;
	
	@Before
	public void setUp()
	{
		laptop = new Laptop("Dell",4444,"Windows 8","i3");
		laptop1 = new Laptop("Acer",4562,"Windows 8.1","i3");
		laptop2 = new Laptop("Dell",4444,"Windows 8","i3");
		
	}
	
	@Test
	public void testForLaptopOne() 
	{
		LinkedHashSet<Laptop> list = new LinkedHashSet<Laptop>();
		list.add(laptop);
		list.add(laptop1);
		list.add(laptop2);
		assertEquals("Laptop [company=" + laptop.getCompany() + ", model=" + laptop.getModel()
				+ ", operatingSystem=" + laptop.getOperatingSystem() + ", processor="
				+ laptop.getProcessor() + "]",laptop.displayOne(laptop));
	}
	
	@Test
	public void testForLaptopTwo() 
	{
		LinkedHashSet<Laptop> list = new LinkedHashSet<Laptop>();
		list.add(laptop);
		list.add(laptop1);
		list.add(laptop2);
		assertEquals("Laptop [company=" + laptop1.getCompany() + ", model=" + laptop1.getModel()
				+ ", operatingSystem=" + laptop1.getOperatingSystem() + ", processor="
				+ laptop1.getProcessor() + "]",laptop1.displayOne(list.toArray()[1]));
	}
	
	@Test
	public void testForEqualObjectValues()
	{
		assertEquals(laptop2,laptop);
	}
	
	@Test
	public void testForNonEqualValues()
	{
		assertNotEquals(laptop,laptop1);
	}
	
	

}
