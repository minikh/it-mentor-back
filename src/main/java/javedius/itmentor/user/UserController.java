package javedius.itmentor.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    final public UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    List<UserDto> getUsers() {
        return userService.getUserList();
    }

    @PostMapping
    UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
