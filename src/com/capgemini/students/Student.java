package com.capgemini.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student
{

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [toString()=" + super.toString() + "]";
	}

	public String display(ArrayList<String> list)
	{
		String name ="";
		Iterator<String> values = list.iterator();
		while(values.hasNext())
		{
			name = name + " " + values.next();
		}
		System.out.println(name);
		return name;
		
	}

	public String displayOne(ArrayList<String> list)
	{
		
		Collections.sort(list);
		return list.toString();
		
	}

}
