package com.example.controller;

import java.util.List;

import com.example.entities.User;
import com.example.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userserv;

    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return userserv.getAllUser();
    }

    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable int id) {

        return userserv.getUser(id);
    }
//
//    @GetMapping()
//    @PostMapping()
    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody User user) {

        userserv.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUser(@RequestBody User user, @PathVariable int id) {
        userserv.updateUser(id, user);
//        System.out.println("Put operation");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userserv.deleteUser(id);

    }
}
