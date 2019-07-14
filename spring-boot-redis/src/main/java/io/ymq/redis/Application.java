package io.ymq.redis;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.core.RedisTemplate;

import io.ymq.redis.utils.CacheUtils;

/**
 * 描述: 启动服务
 *
 * @author yanpenglei
 * @create 2017-10-16 13:19
 **/
@SpringBootApplication
@ComponentScan(value = {"io.ymq.redis"})
public class Application {
	@Autowired
    private RedisTemplate<String, String> redisTemplate;
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
        for(int i=0;i<1000000;i++) {
        	redisTemplate.for
        }

    }
}
