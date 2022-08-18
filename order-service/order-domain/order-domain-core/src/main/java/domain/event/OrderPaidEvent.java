package domain.event;

import domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderPaidEvent extends OrderEvent{

    public OrderPaidEvent(Order order, ZonedDateTime creatAt) {
        super(order, creatAt);
    }
}
