package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUserDetails() throws Exception;

    public User getUser(Integer userId, String age, String gender) throws Exception;

    public void addUser(User user) throws Exception;

}
