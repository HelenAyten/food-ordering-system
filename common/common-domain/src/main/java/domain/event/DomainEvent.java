package domain.event;

public interface DomainEvent<T> {
    void publish(T domainEvent);
}
