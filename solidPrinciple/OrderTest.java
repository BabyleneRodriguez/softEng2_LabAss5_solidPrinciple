package solidPrinciple;

public class OrderTest
{
    public static void main(String[] args)
    {
        Order order = new Order();
        Total total = new Total();
        Email email = new Email();
        InvoiceFile invoiceFile = new InvoiceFile();

        total.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        // These methods might not be needed for all orders
        invoiceFile.generateInvoice("order_123.pdf");
        email.sendEmailNotification("johndoe@example.com");
    }
}


