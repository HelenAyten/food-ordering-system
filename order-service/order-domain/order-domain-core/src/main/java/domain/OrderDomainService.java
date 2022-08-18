package domain;

import domain.entity.Order;
import domain.entity.Restaurant;
import domain.event.OrderCancelledEvent;
import domain.event.OrderCreatedEvent;
import domain.event.OrderEvent;
import domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    //Bu method bir siparişi doğrulamak ve başlatmak için varlıklardan gerekli iş yöntemlerini çağırır.
    OrderCreatedEvent validateAndInitialiteOrder (Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    //cancelOrderPayment sipariş ve hata mesajlarını parametre olarak alır ve geri döner
    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String > failureMessages);

}
