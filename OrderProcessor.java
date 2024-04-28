// Interface for order operations related to order processing
public interface OrderProcessor {
    void placeOrder(String customerName, String address);
}