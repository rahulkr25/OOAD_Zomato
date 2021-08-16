package Helper;

public class Address {
    private String location;
    private String city;
    private String country;
    public Address(String location,String city,String country)
    {
      this.city=city;
      this.country=country;
      this.location=location;
    }
   public String getlocation(){return location;}
   public String getcountry(){return country;}
   public String getcity(){return city;} 
}
