package Online.Shop.Shop.Order;

import Online.Shop.Shop.Member.Member;

public class Order {

    private Long OrderId;

    private String price;


    public Order(Long orderId, String price) {
        OrderId = orderId;
        this.price = price;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
