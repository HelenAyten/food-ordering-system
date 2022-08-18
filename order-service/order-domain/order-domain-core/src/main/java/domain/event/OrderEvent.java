package domain.event;

import domain.entity.Order;

import java.time.ZonedDateTime;

public abstract class OrderEvent implements DomainEvent<Order>{
    private final Order order;
    private final ZonedDateTime creatAt;

    public OrderEvent(Order order, ZonedDateTime creatAt) {
        this.order = order;
        this.creatAt = creatAt;
    }

    public Order getOrder() {
        return order;
    }

    public ZonedDateTime getCreatAt() {
        return creatAt;
    }
}
