package com.ming.serviceImpl;

import com.ming.mapper.UserMapper;
import com.ming.model.T_user;
import com.ming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by xiaoai on 2018/5/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public T_user findByName(String name) {
        //mybatis generator
        return userMapper.findByName(name);
    }

    @Override
    public T_user findByName2(String name) {
        //tk.mybatis
        Example example = new Example(T_user.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName", name);
        return userMapper.selectByExample(example).get(0);
    }

    @Override
    public Integer inser(String userId, String name, String pass, String phone) {
        return userMapper.insertUser(userId, name, pass, phone);
    }
}
