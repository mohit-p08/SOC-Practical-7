package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userid}")
    public User getUser(@PathVariable("userid")Long userid){
        //return  this.userService.getUser(userid);
        User user=this.userService.getUser(userid);

        //List contacts=this.restTemplate.getForObject("http://localhost:9002/contact/user/"+ user.getUserid(), List.class);
        List contacts=this.restTemplate.getForObject("http://contact-service/contact/user/"+ user.getUserid(), List.class);
        user.setContacts(contacts);
        return user;



    }
}
