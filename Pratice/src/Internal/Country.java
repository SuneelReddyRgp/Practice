package Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Country{
	
	String CountryName;
    int position;
    
    Country(int pos,String name){
    	this.position = pos;
    	this.CountryName = name;
    }
    
    String getCountryName() {
    	return this.CountryName;
    }
    
    
    
    public static void main(String args[]) {
    	Country indiaCountry=new Country(1,"India");
        Country chinaCountry=new Country(4, "China");
        Country nepalCountry=new Country(3, "Nepal");
        Country bhutanCountry=new Country(2, "Bhutan");

        ArrayList<Country> listOfCountries = new ArrayList<Country>();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(chinaCountry);
        listOfCountries.add(nepalCountry);
        listOfCountries.add(bhutanCountry); 
        
        
        
        Collections.sort(listOfCountries,new Comparator<Country>() {

            @Override
            public int compare(Country o1, Country o2) {
            	System.out.println(o1.getCountryName()+""+o2.getCountryName());

                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        });
        
        for(Country c: listOfCountries) {
        	System.out.println(c.CountryName);
        }
    }
	 

//Sort by countryName

        
}
