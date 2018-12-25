package com.capgemini.collections.school;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;

import org.junit.Before;
import org.junit.Test;

public class SchoolTest 
{
	private School school1,school2,school3;
	
	@Before
	public void setUp()
	{
		school1 = new School("Sat gyan school","Hyderabd","Rangareddy",10);
		school2 = new School("Lotus high School","Singarayakonda","Prakasam",8);
		school3 = new School("Sat gyan school","Hyderabd","Rangareddy",15);
	}
	
	@Test
	public void testForSchool1()
	{
		LinkedHashSet<School> value = new LinkedHashSet<School>();
		value.add(school1);
		value.add(school2);
		value.add(school3);
		assertEquals("School [name=" + school1.getName() + ", city=" + school1.getCity() + ", district="
				+ school1.getDistrict() + ", ranking=" + school1.getRanking() + "]",school1.display(value.toArray()[0]));
	}
	
	@Test
	public void testForSchool2()
	{
		LinkedHashSet<School> value = new LinkedHashSet<School>();
		value.add(school1);
		value.add(school2);
		value.add(school3);
		assertEquals("School [name=" + school2.getName() + ", city=" + school2.getCity() + ", district="
				+ school2.getDistrict() + ", ranking=" + school2.getRanking() + "]",school2.display(value.toArray()[1]));
	}
	
	
	@Test
	public void testForEquals()
	{
		assertEquals(school1,school3);
	}

}
