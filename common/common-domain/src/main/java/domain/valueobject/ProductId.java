package domain.valueobject;

import domain.entity.BaseEntity;

import java.util.UUID;

public class ProductId extends BaseId<UUID> {

    public ProductId(UUID value) {
        super(value);
    }
}
