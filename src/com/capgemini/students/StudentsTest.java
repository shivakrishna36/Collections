package com.capgemini.students;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class StudentsTest
{
	private Student student = new Student();
	
	@Test
	public void testForNames()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shiva");
		list.add("Krishna");
		list.add("Ramu");
		list.add("Sai");
		list.add("Ganesh");
		student.display(list);
		
		assertEquals(" Shiva Krishna Ramu Sai Ganesh",student.display(list));
	}
	

	@Test
	public void testForNaturalOrder()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shiva");
		list.add("Krishna");
		list.add("Ramu");
		list.add("Sai");
		list.add("Ganesh");
		student.displayOne(list);
		
		assertEquals("[Ganesh, Krishna, Ramu, Sai, Shiva]", student.displayOne(list));
	}
	
	@Test
	public void testForFruitName()
	{
		StudentFruits fruits = new StudentFruits();
		Map<String,String> names = new TreeMap<String, String>();
		names.put("Shiva", "Watermelon");
		names.put("Krishna", "Mango");
		names.put("Ramu", "Grapes");
		names.put("Jaffer", "Guava");
		assertEquals("Mango",fruits.showFruits(names,"Krishna"));
	}
	
	@Test
	public void testForAllFruitNames()
	{
		StudentFruits fruits = new StudentFruits();
		Map<String,String> names = new TreeMap<String, String>();
		names.put("Shiva", "Watermelon");
		names.put("Krishna", "Mango");
		names.put("Ramu", "Grapes");
		names.put("Jaffer", "Guava");
		assertEquals("{Jaffer=Guava, Krishna=Mango, Ramu=Grapes, Shiva=Watermelon}",fruits.ShowAllFruits(names));
	}
}
