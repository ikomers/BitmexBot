package roman.kalinin.bitmexbot.model;

public class Order {

    private String orderId;
    private Symbol symbol;
    private boolean isBuy;
    private double orderQty;
    private double price;
    private double stopPx;
    private OrderType orderType;
    private OrderStatus orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public boolean isBuy() {
        return isBuy;
    }

    public void setBuy(boolean buy) {
        isBuy = buy;
    }

    public double getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(double orderQty) {
        this.orderQty = orderQty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStopPx() {
        return stopPx;
    }

    public void setStopPx(double stopPx) {
        this.stopPx = stopPx;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
