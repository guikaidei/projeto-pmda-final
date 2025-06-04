package store.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.annotation.Order;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "order", url = "http://order:8080")
public interface OrderController {
    @PostMapping("/order")
    public ResponseEntity<OrderOut> create(
            @RequestBody OrderIn orderIn,
            @RequestHeader(value = "id-account", required = true) String idAccount
    );


    @GetMapping("/order")
    public ResponseEntity<List<OrderOut>> findAll(
            @RequestHeader(value = "id-account", required = true) String idAccount
    );

    @GetMapping("/order/{id}")
    public ResponseEntity<OrderOut> findById(
            @PathVariable String id,
            @RequestHeader(value = "id-account", required = true) String idAccount
    );
}
