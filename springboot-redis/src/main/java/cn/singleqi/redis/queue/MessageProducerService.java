package cn.singleqi.redis.queue;

import cn.singleqi.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

@Component
public class MessageProducerService {

    @Autowired
    RedisTemplate<String, Message> redisTemplate;

    @Scheduled(fixedDelay = 5000L)
    public Long sendMessage() {
        Message message = new Message(String.valueOf(new Random().nextLong()), new Date().toString());
        System.out.println("向queue发送了" + message);
        return redisTemplate.opsForList().leftPush("queue", message);
    }

}