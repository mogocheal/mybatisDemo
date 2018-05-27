package com.ming.mapper;

import com.ming.MyMapper;
import com.ming.model.T_user;
import org.apache.ibatis.annotations.*;


/**
 * @author xiaoai
 */
@Mapper
public interface UserMapper extends MyMapper<T_user> {
    /**
     * dsadsa
     *
     * @param name
     * @return
     */
//    @Select("SELECT * FROM t_user WHERE user_name=#{name}")
   /* @Results({
            @Result(property = "userName", column = "user_name")
    })*/
    T_user findByName(@Param("name") String name);

    /**
     * @param userId
     * @param name
     * @param pass
     * @param phone
     * @return
     */
//    @Insert("insert into t_user (user_id,user_name,password,phone) values(#{userId},#{name},#{pass},#{phone})")
    Integer insertUser(@Param("userId") String userId, @Param("name") String name, @Param("pass") String pass, @Param("phone") String phone);
}
