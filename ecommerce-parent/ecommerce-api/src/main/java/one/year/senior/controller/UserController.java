package one.year.senior.controller;

import one.year.senior.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/user/v1")
public class UserController {

    @GetMapping
    public List<User> getAllUser() {
        return List.of(
                new User("Thinh", 24),
                new User("Hieu", 26));
    }
}
