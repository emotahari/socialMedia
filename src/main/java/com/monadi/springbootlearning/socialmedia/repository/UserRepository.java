package com.monadi.springbootlearning.socialmedia.repository;

import com.monadi.springbootlearning.socialmedia.entity.User;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserRepository {
    public Integer userCount = 0;
    public List<User> users = new ArrayList<>();

}
