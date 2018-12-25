package com.capgemini.collections.car;

import java.util.ArrayList;

public class Car
{
	private String model;
	private int year;
	private int price;
	private String make;

	public Car(String model,int year,int price,String make)
	{
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) 
		{
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) 
		{
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return "Car [model=" + model + ", year=" + year + ", price=" + price
				+ ", make=" + make + "]";
	}

	public String getModel() 
	{
		return model;
	}

	public int getYear()
	{
		return year;
	}

	public int getPrice() 
	{
		return price;
	}

	public String getMake() 
	{
		return make;
	}
	
	public String displayOne(ArrayList<Car> list)
	{
		return list.get(0).toString();
	}
	
	public String displayTwo(ArrayList<Car> list)
	{
		return list.get(1).toString();
	}
	
	public String displayThree(ArrayList<Car> list)
	{
		return list.get(2).toString();
	}	
}
