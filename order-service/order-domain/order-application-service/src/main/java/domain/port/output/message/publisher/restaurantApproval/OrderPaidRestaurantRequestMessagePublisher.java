package domain.port.output.message.publisher.restaurantApproval;

import domain.event.OrderPaidEvent;
import domain.event.publisher.DomainEventPublisher;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
