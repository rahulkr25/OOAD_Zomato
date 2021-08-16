package Helper;

public class FoodItems {
    private static int idcounter=0;
    private int id;
    private String meal;
    private String description;
    private double cost;
    
    public FoodItems(String mealname,String description,double d)
    {
        this.id=idcounter++;
        this.meal=mealname;
        this.cost=d;
        this.description=description;
      
         
    }
    public void registerrestaurant(Restaurant restaurant)
    {
        restaurant.addfooditems(this);
         
    }
    public String getmeal(){return meal;}
    public void setmeal(String meal){this.meal=meal;}
     
    public String getdescription(){return description;}
    public void setdescription(String description){this.description=description;}
    
    public double getcost(){return cost;}
    public void setcost(float cost){this.cost=cost;}
    public void add(FoodItems foodItems) {
    }

}
