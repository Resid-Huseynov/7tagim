package com.mia.gov.az.tagim.service;

import com.mia.gov.az.tagim.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getByUsername(String username);
}
