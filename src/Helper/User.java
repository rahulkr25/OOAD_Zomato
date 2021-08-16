package Helper;

public class User {
    private static int idcounter=0;
    private int id;
    private String name;
    private Address address;
   public User(String name,Address address)
    {
        this.id=idcounter++;
        this.name=name;
        this.address=address;
    }
    public int getid(){return id;}
    public String getname(){return name;}
    public Address getAdress(){return address;}
    
    
    public void setname(String name){this.name=name;}
    public void setAdress(Address address){this.address=address;}


}
