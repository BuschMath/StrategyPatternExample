// Client code
public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Shoes", 55.99));
        cart.addItem(new Item("Shirt", 25.99));
        cart.addItem(new Item("Pants", 35.99));

        cart.setPaymentStrategy(new CreditCardStrategy("John Doe", "1234567890123456", "123", "06/25"));
        cart.pay();

        cart.setPaymentStrategy(new PayPalStrategy("johndoe@example.com", "password"));
        cart.pay();
    }
}