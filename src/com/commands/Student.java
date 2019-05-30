package com.commands;




import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

//@Component
public class Student {

   private String firstName;

   @NotNull(message = "is Required")
   @Size(min = 1,message = "At list 1 symbol")
   private String lastName;
   private String country;
   private LinkedHashMap<String,String> countries;
   private String favouriteLanguage;
   private String[] operatingSystems;

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public Student() {
        countries = new LinkedHashMap<>();
        countries.put("AZ","AZERBAIJAN");
        countries.put("RU","RUSSIA");
        countries.put("US","USA");

    }

    public String getCountry() {
        return country;
    }

    public LinkedHashMap<String, String> getCountries() {
        return countries;
    }

    public void setCountries(LinkedHashMap<String, String> countries) {
        this.countries = countries;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }
}
