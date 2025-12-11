package one.year.senior.controller;

import one.year.senior.entity.Item;
import one.year.senior.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/order/v1")
public class OrderController {

    @GetMapping
    public Order getOrderById(@RequestParam Integer id) {
        return new Order(1, "Order 1", List.of(new Item("Iphone 17")));
    }
}
