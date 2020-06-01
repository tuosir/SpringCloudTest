package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class gateway2Aplication {
    public static void main(String[] args) {
        SpringApplication.run(gateway2Aplication.class);
    }
}
