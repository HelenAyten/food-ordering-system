package domain;

import domain.dto.create.CreateOrderCommand;
import domain.dto.create.CreateOrderResponse;
import domain.event.OrderCreatedEvent;
import domain.mapper.OrderDataMapper;
import domain.port.output.message.publisher.payment.OrderCreatedPaymentRequestMessagePublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class OrderCreateCommandHandler {

    private final OrderCreateHelper orderCreateHelper;
    private final OrderDataMapper orderDataMapper;

    private final OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher;

    private final ApplicationDomainEventPublisher applicationDomainEventPublisher;

    public OrderCreateCommandHandler(OrderCreateHelper orderCreateHelper, OrderDataMapper orderDataMapper, OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher, ApplicationDomainEventPublisher applicationDomainEventPublisher) {
        this.orderCreateHelper = orderCreateHelper;
        this.orderDataMapper = orderDataMapper;
        this.orderCreatedPaymentRequestMessagePublisher = orderCreatedPaymentRequestMessagePublisher;
        this.applicationDomainEventPublisher = applicationDomainEventPublisher;
    }



    @Transactional
    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand) {
   OrderCreatedEvent orderCreatedEvent= orderCreateHelper.persistOrder(createOrderCommand);
   log.info("Order is created with id: {}", orderCreatedEvent.getOrder().getId().getValue());
   orderCreatedPaymentRequestMessagePublisher.publish(orderCreatedEvent);
   applicationDomainEventPublisher.publish(orderCreatedEvent);
        return orderDataMapper.orderToCreateOrderResponse(orderCreatedEvent.getOrder());

    }


}
