package cn.itcast.client;

import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {
    @Override
    public String queryById(long id) {
        return "未查询到用户";
    }
}
