package com.springboot.client.service;

import com.springboot.client.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    RestTemplate restTemplate;

    String url = "http://localhost:8080/admin";

    @Override
    public List<User> getAllUser(){
        String url = "http://localhost:8080/admin";
        List<User> user = restTemplate.getForObject(url, List.class);
        return user;
    }

    /*@Override
    public User getUserById(int id) {
        String url = "http://localhost:8080/admin";
        List<User> user = restTemplate.getForObject(url, List.class);
        return user;
    }*/

    @Override
    public void addUser(User user) {
        String url = "http://localhost:8080/admin";
        restTemplate.postForObject(url, user, User.class);
    }

    @Override
    public void updateUser(User user) {
        String url = "http://localhost:8080/admin/update";
        restTemplate.put(url, user.getId());
    }

    @Override
    public void deleteUser(int id) {
        String url = "http://localhost:8080/admin";
        restTemplate.delete(url+"/{id}", id);
    }
}
