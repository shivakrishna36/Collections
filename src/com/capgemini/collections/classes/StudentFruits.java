package com.capgemini.collections.classes;

import java.util.Map;

public class StudentFruits 
{

	public String showFruits(Map<String, String> names,String name) 
	{
		String result = (String) names.get(name);
		return result;
	}
	
	public String ShowAllFruits(Map<String, String> names)
	{
		
		System.out.println(names);
		return names.toString();
	}

}
