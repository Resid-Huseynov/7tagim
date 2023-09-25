package com.mia.gov.az.tagim.Service;

import com.mia.gov.az.tagim.Entity.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getByUsername(String username);
}
