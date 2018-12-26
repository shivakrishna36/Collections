package com.capgemini.collections.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collections.classes.CellPhone;

public class CellPhoneTest 
{
	private CellPhone cellPhone1,cellPhone2,cellPhone3;
	
	@Before
	public void setUp()
	{
		cellPhone1 = new CellPhone("Lenovo","dualCamera","Android","Samsung note pad",10000);
		cellPhone2 = new CellPhone("Lenovo","dualCamera","Android","The picture quality",9500);
		cellPhone3 = new CellPhone("Infocus","BingoM430","Android","Easy way of use",6500);
	}
	
	@Test
	public void testForCellPhone() 
	{
		LinkedHashSet<CellPhone> values = new LinkedHashSet<CellPhone>();
		values.add(cellPhone1);
		values.add(cellPhone2);
		values.add(cellPhone3);
		assertEquals("CellPhone [company=" + cellPhone1.getCompany() + ", model=" + cellPhone1.getModel()
				+ ", operatingSystem=" + cellPhone1.getOperatingSystem() + ", description="
				+ cellPhone1.getDescription() + ", price=" + cellPhone1.getPrice() + "]",cellPhone1.display(values.toArray()[0]));
		
	}
	
	
	
	
	@Test
	public void testForEqualObject()
	{
		assertEquals(cellPhone1,cellPhone2);
	}
	

}
