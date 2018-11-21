package com.trunghd.manage.service;

import com.trunghd.manage.entities.User;

public interface UserService {
    User findUserByEmail(String email);

    void saveUser(User user);
}
