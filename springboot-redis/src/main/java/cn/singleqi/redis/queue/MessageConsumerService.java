package cn.singleqi.redis.queue;

import cn.singleqi.pojo.Message;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class MessageConsumerService implements InitializingBean {

    @Autowired
    RedisTemplate<String, Message> redisTemplate;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("consumer start");
        new Thread(() -> {
            while (true) {
                Message message = redisTemplate.opsForList().rightPop("queue", 1000L, TimeUnit.SECONDS);
                System.out.println("queue 接收到了" + message);
            }
        }).start();
    }
}
