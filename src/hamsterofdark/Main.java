package hamsterofdark;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Countries;
import model.Country;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unmarshalExample();

	}

	private static void unmarshalExample() {
		File file = new File("countries.xml");
		Countries countries = new Countries();
		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(Countries.class, Country.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			countries = (Countries) jaxbUnmarshaller.unmarshal(file);		
		}
		catch(JAXBException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(countries);
		
		
	}

}
