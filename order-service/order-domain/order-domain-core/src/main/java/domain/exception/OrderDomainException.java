package domain.exception;

public class OrderDomainException extends DomainException{
    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(Throwable cause) {
        super(cause);
    }
}
