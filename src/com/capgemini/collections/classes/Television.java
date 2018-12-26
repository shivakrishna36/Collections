package com.capgemini.collections.classes;


public class Television 
{
	private String company;
	private String type;
	private boolean enabled3D;
	private int price;

	public Television(String company,String type,boolean enabled3D,int price)
	{
		this.company = company;
		this.type = type;
		this.enabled3D =enabled3D;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type
				+ ", enabled3D=" + enabled3D + ", price=" + price + "]";
	}



	public String getCompany() 
	{
		return company;
	}



	public String getType() {
		return type;
	}



	public boolean isEnabled3D() {
		return enabled3D;
	}



	public int getPrice() {
		return price;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}



	public static String display(Object set)
	{
		return set.toString();
	}
	
	
}
