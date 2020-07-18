package com.supportportal.service;

import com.supportportal.domain.User;
import com.supportportal.exception.domain.EmailExistException;
import com.supportportal.exception.domain.UserNotFoundException;
import com.supportportal.exception.domain.UsernameExistException;

import java.util.List;

public interface UserService {
    public User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException;
    List<User> getUsers();
    User findUserByUsername(String userName);
    User findUserByEmail(String email);


}
