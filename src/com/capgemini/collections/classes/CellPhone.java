package com.capgemini.collections.classes;


public class CellPhone 
{
	private String company;
	private String model;
	private String operatingSystem;
	private String description;
	private int price;
	
	public CellPhone(String company,String model,String operatingSystem,String description,int price)
	{
		this.company = company;
		this.description = description;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	
	
	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model
				+ ", operatingSystem=" + operatingSystem + ", description="
				+ description + ", price=" + price + "]";
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		return true;
	}

	public String display(Object values)
	{
		return values.toString();
	}
	
}
