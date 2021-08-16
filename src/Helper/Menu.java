package Helper;

import java.util.ArrayList;

public class Menu {
    private ArrayList<FoodItems> foodItems;
    public Menu()
    {
        this.foodItems=new ArrayList<>();
    }
    public ArrayList<FoodItems> getfooditems()
    {
        return foodItems;
    }
    public void addfooditems(FoodItems foodItems)
    {
        foodItems.add(foodItems);
    }

}
