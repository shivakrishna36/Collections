package com.capgemini.collections.television;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest 
{
	Television television1,television2,television3;
	
	@Before
	public void setUp()
	{
		television1 = new Television("Onida","LED",false,10000);
		television2 = new Television("Samsui","LED",false,7700);
		television3 = new Television("Samsui","LED",true,7700);
	}
	
	@Test
	public void testForTelevision1()
	{
		LinkedHashSet<Television> list = new LinkedHashSet<Television>();
		list.add(television1);
		list.add(television2);
		list.add(television3);
		assertEquals("Television [company=" + television1.getCompany() + ", type=" + television1.getType()
				+ ", enabled3D=" + television1.isEnabled3D() + ", price=" + television1.getPrice() + "]",Television.display(television1));
	}
	
	@Test
	public void testForTelevision2()
	{
		LinkedHashSet<Television> list = new LinkedHashSet<Television>();
		list.add(television1);
		list.add(television2);
		list.add(television3);
		assertEquals("Television [company=" + television2.getCompany() + ", type=" + television2.getType()
				+ ", enabled3D=" + television2.isEnabled3D() + ", price=" + television2.getPrice() + "]",Television.display(television2));
	}
	
	
	@Test
	public void testForEqualObject()
	{
		System.out.println(Television.display(television3));
		assertEquals(television3,television2);
	}
}
