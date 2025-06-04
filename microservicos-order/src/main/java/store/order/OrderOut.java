package store.order;

import lombok.Builder;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Accessors(fluent = true)
public record OrderOut(
        String id,
        LocalDateTime date,
        List<ItemOut> items,
        Double total

)  implements Serializable {
}
