package cn.itcast.service;

import cn.itcast.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

}
