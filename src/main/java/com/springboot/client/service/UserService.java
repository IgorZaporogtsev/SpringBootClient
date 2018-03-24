package com.springboot.client.service;


import com.springboot.client.model.User;

import java.net.URISyntaxException;
import java.util.List;

public interface UserService {
    List<User> getAllUser();
   // User getUserById(int id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);


}
