package cn.itcast.controller;

import cn.itcast.client.UserClient;
import cn.itcast.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
@DefaultProperties(defaultFallback = "defaultFallback")
public class ConsumerController {
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

//    @GetMapping("/{id}")
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
//            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),
//            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "60")
//
//    })
//    @HystrixCommand
//    public String queryById(@PathVariable("id") Long id) {
//        if (id % 2 == 0){
//            new RuntimeException("");
//        }
//        String url = "http://user-service/user/" + id;
//        String user = restTemplate.getForObject(url, String.class);
//        return user;
//    }
    @GetMapping("/{id}")
    public String queryById(@PathVariable("id") Long id) {
        return userClient.queryById(id);
    }
    public String defaultFallback(){
        return "用户信息查询出现异常！";
    }
}
