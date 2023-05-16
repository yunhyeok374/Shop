package Online.Shop.Shop.Order;

public interface orderService {

    // 회원이 주문 했을 경우

    public Order addOrder(Integer OrderId);



    //주문을 취소했을 경우

    public Order cancelOrder(Integer OrderId);
}
