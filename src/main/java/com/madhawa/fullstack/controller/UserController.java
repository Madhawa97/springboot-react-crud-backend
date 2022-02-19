// controller is for mapping all http methods, (get, post or any crud operation)

package com.madhawa.fullstack.controller;

import com.madhawa.fullstack.model.User;
import com.madhawa.fullstack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService; // inject student service here

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);            // save
        return "New user is added";
    }

}
