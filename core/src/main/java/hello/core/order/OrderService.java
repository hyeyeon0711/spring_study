package hello.core.order;

public interface OrderService {
     //return 값이 Order
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
