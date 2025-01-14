package Food_delivery_system;
import java.util.ArrayList;
import java.util.List;

public class Resturant {
    private List<MenuItem> menu;
    private List<Order> orders;

    public Resturant() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addToMenu(MenuItem item) {
        menu.add(item);
    }
    public void viewMenu() {
        for (MenuItem item : menu) {
            System.out.println(item.getDetails());
        }
    }
    public void processOrder(Order order) {
        if (orders.contains(order)) {
            order.updateStatus("Out for Delivery");
        } else {
            orders.add(order);
            order.updateStatus("Preparing");
        }
    }
}
