package domain.event;

import domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCreatedEvent extends OrderEvent{

    public OrderCreatedEvent(Order order, ZonedDateTime creatAt) {
        super(order, creatAt);
    }
}
