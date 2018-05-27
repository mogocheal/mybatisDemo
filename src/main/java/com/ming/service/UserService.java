package com.ming.service;

import com.ming.model.T_user;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoai on 2018/5/23.
 */
@Service
public interface UserService {
    T_user findByName(String name);

    T_user findByName2(String name);

    Integer inser(String userId, String name, String pass, String phone);
}
