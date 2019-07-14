package io.ymq.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl {
	@Autowired
    private RedisTemplate<String, String> redisTemplate;
	public void test() {
		redisTemplate.opsForHash().put("apple", "xr", "5000");
	        Long s=System.currentTimeMillis();
	        for(int i=0;i<1000000;i++) {
	        	//redisCacheTemplate.opsForHash().put("apple", "xs max",""+i);
	        	redisTemplate.opsForValue().set("key"+i, "value"+i);
	        }
	        Long e=System.currentTimeMillis();
	        System.out.println(1000000/(e-s)*1000);
	}

}
