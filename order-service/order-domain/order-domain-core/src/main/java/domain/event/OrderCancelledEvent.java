package domain.event;

import domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent{

    public OrderCancelledEvent(Order order, ZonedDateTime creatAt) {
        super(order, creatAt);
    }
}
