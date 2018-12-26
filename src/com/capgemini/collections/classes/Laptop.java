package com.capgemini.collections.classes;


public class Laptop 
{
	private String company;
	private int model;
	private String operatingSystem;
	private String processor;

	public Laptop(String company,int model,String operatingSystem,String processor)
	{
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
				
	}
	
	public String getCompany() {
		return company;
	}

	public int getModel() {
		return model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + model;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model != other.model)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Laptop [company=" + company + ", model=" + model
				+ ", operatingSystem=" + operatingSystem + ", processor="
				+ processor + "]";
	}

	public String displayOne(Object list)
	{
		return list.toString();
	}
	
	
	
}
