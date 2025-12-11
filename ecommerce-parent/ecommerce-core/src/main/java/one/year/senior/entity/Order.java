package one.year.senior.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private int id;
    private String description;
    private List<Item> listItem;
}
