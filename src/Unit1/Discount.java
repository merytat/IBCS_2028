package Unit1;

public class Discount {
    static void main() {
        int numOfItems = 10;
        double priceOfItem = 12.3;
        double discount = 0.02;
        System.out.println(Math.round(3.5678));
        double totalPrice = (1 - discount) * numOfItems * priceOfItem;

        System.out.println("No. of Items: " + numOfItems);
        System.out.println("Price per item: " + priceOfItem);
        System.out.println("Discount: " + discount);
        System.out.println("Total price: " + totalPrice);

    }
}
