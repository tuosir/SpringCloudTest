package cn.itcast.service;

import cn.itcast.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {

//    @Autowired
//    private UserMapper userMapper;
//
    public User queryById(Long id) {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Thread.sleep(new Random().nextInt(2000));


//        return userMapper.selectByPrimaryKey(id);
        return new User("lisi");
    }

}
