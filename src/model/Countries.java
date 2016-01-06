package model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Countries")
@XmlAccessorType
public class Countries {
	private List<Country> countries;

	public List<Country> getCountries() {
		return countries;
	}

	@XmlElement( name = "Country" )
	public void setCountries( List<Country> countries )
	{
	this.countries = countries;
	}

	public String toString()
	{
		String result = "";
		for (Country e : countries)
		{
			result = result + e.toString();

		}
		return result;

		
	}
	
	

}
