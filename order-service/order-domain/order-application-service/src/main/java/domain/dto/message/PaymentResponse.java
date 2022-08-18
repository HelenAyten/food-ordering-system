package domain.dto.message;


import domain.valueobject.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class PaymentResponse { //Payment servisinden order servisine dönen yanıtı tutar

    private String id;
    private String sagaId; //Servisler arasındaki mesajlaşmalarda kullanılıcak.
    private String orderId;
    private String paymentId;
    private String customerId;
    private BigDecimal price;
    private Instant createdAt;
    private PaymentStatus paymentStatus;
    private List<String> failureMessages;


}
