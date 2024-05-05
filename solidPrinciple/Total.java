package solidPrinciple;

public class Total implements Calculator
{
    public void calculateTotal(double price, int quantity)
    {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }

}
