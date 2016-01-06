package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Country")
public class Country {
	private String name, capital, continent;

	public String getName() {
		return name;
	}
	@XmlElement(name = "Country_Name")
	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}
	@XmlElement(name = "Country_Capital")
	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getContinent() {
		return continent;
	}
	
	@XmlElement(name = "Country_Continent")
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public String toString()
	{
		return name;
	}

}
