package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/api/users")
    public List users()
    {
        return this.userService.findAll();
    }

    @PostMapping(value = "/api/addUser")
    public Long addUser(@RequestBody User user)
    {
        return userService.add(user);
    }

    @PutMapping(value = "/api/modifyUser")
    public int modifyUser(@RequestBody User user)
    {
        return userService.modity(user);
    }

    @DeleteMapping(value = "/api/deleteUser/{id}")
    public int deleteUser(@PathVariable Long id)
    {
        return userService.deleteById(id);
    }
}
