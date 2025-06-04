package store.order;


import lombok.Builder;
import lombok.experimental.Accessors;

import java.io.Serializable; // Importação adicionada
import java.time.LocalDateTime;

@Builder
@Accessors(fluent = true)
public record ItemOut(
        String id,
        ProductRef product,
        int quantity,
        Double total


) implements Serializable { 
}
