package solidPrinciple;

public class Order implements OrderPlacement
{
    public void placeOrder(String customerName, String address)
    {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
