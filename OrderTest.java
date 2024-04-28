public class OrderTest {
    public static void main(String[] args) {
        OrderProcessorImpl orderProcessor = new OrderProcessorImpl();
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorImpl();
        NotificationSender notificationSender = new NotificationSenderImpl();
        TotalCalculator totalCalculator = new TotalCalculatorImpl();

        // Perform order processing
        orderProcessor.placeOrder("John Doe", "123 Main St");

        // Perform billing and invoicing
        invoiceGenerator.generateInvoice("order_123.pdf");

        // Perform notification sending
        notificationSender.sendEmailNotification("johndoe@example.com");

        // Calculate total
        totalCalculator.calculateTotal(10.0, 2);
    }
}