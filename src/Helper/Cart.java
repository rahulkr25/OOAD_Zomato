package Helper;

import java.util.ArrayList;

public class Cart {
    
    private ArrayList<FoodItems>foodItems;
    public Cart()
    {
     this.foodItems=new ArrayList<>();
    }
    public void addfooditems(FoodItems foodItems){this.foodItems.add(foodItems);}
    //public void reomovefooditems(FoodItems foodItems){foodItems.remove(new FoodItems(foo0);}
    public ArrayList<FoodItems> getfooditems(){return foodItems;}
    public void checkout(){foodItems.clear();}
    
}
