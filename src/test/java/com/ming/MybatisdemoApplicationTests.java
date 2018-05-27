package com.ming;

import com.ming.mapper.UserMapper;
import com.ming.model.T_user;
import com.ming.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisdemoApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;


    @Test
    public void contextLoads() {
        T_user user = userService.findByName("1");
        System.out.println(user.toString());
    }

    @Test
    public void contextLoadsS() {
        Integer user = userService.inser("5", "5", "5", "5");
        System.out.println(user);
    }

    @Test
    public void contextLoadss() {
//        System.out.println(userMapper.selectAll());
        Example example = new Example(T_user.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", "1");
        System.out.println(userMapper.selectByExample(example));
        T_user u =  userMapper.selectByExample(example).get(0);
        u.setPassword("5");
        System.out.println(userMapper.updateByPrimaryKey(u));
        System.out.println(userMapper.selectByExample(example));

    }


}
