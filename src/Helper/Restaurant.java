package Helper;

import java.util.ArrayList;

public class Restaurant {
    private static int idcounter=0;
    private int id;
    private String name;
    private String location;
    private ArrayList<FoodItems> allfooditems;
    public Restaurant(String name,String location,Menu menu)
    {
        this.id=idcounter++;
        this.name=name;
        this.location=location;
        this.allfooditems=new ArrayList<>();
    }
   
    public ArrayList<FoodItems> getallfooditems(){return allfooditems;}
    public void addfooditems(FoodItems foodItems){allfooditems.add(foodItems);}

}
