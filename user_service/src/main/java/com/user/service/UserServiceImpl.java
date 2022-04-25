package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    List<User> list= List.of(
            new User(7777L,"Mrugendra Rahevar","987654321"),
            new User(8888L,"Martin Parmar","999999999"),
            new User(9999L,"Nikunj Patel","8888888888")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user->user.getUserid().equals(id)).findAny().orElse(null);
    }
}
