package store.order;

import lombok.Builder;
import lombok.experimental.Accessors;
import java.io.Serializable; 

@Builder @Accessors(fluent = true)
public record ProductOut(
        String id,
        String name,
        Double price,
        String unit
) implements Serializable {
}
