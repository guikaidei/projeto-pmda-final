package store.order;

import lombok.Builder;
import lombok.experimental.Accessors;
import java.io.Serializable;

@Builder
@Accessors(fluent = true)
public record ProductRef(
        String idProduct
) implements Serializable {
}
