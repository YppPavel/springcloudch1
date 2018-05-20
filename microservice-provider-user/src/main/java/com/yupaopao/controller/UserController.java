package com.yupaopao.controller;

import com.yupaopao.domain.User;
import com.yupaopao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liubao on 2018/5/20.
 *
 * @author liubao
 * @date 2018/5/20
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.userRepository.findOne(id);
    }
}
