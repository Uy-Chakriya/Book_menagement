package Food_delivery_system;

import java.util.List;

public class FoodItem extends MenuItem {
    private List<String> ingredients;

    public FoodItem(String name, float price, String description, List<String> ingredients) {
        super(name, price, description);
        this.ingredients = ingredients;
    }

    @Override
    public String getDetails() {
        return String.format("Food Item: %s, Price: %.2f, Description: %s, Ingredients: %s",
                name, price, description, String.join(", ", ingredients));
    }
}