package io.ymq.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.ymq.redis.service.RedisServiceImpl;

/**
 * 描述: 启动服务
 *
 * @author yanpenglei
 * @create 2017-10-16 13:19
 **/
@SpringBootApplication
@ComponentScan(value = {"io.ymq.redis"})
public class Application implements ApplicationRunner{
	@Autowired
	private   RedisServiceImpl redis;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	public void run(ApplicationArguments args) throws Exception {
        redis.test();
    }
}
