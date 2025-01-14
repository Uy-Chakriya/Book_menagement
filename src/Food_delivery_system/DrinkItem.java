package Food_delivery_system;

public class DrinkItem extends MenuItem {
    private String size;

    public DrinkItem(String name, float price, String description, String size) {
        super(name, price, description);
        this.size = size;
    }

    @Override
    public String getDetails() {
        return String.format("Drink Item: %s, Price: %.2f, Description: %s, Size: %s",
                name, price, description, size);
    }
}
