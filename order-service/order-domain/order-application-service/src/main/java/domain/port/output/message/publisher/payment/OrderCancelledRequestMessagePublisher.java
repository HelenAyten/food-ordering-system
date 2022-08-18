package domain.port.output.message.publisher.payment;

import domain.event.OrderCancelledEvent;
import domain.event.publisher.DomainEventPublisher;

public interface OrderCancelledRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
