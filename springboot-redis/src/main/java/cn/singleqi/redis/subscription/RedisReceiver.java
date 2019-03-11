package cn.singleqi.redis.subscription;

import org.springframework.stereotype.Service;

@Service
public class RedisReceiver {

    public void receiveMessage(String message) {
        System.out.println("subscription 消息来了："+message);
        //这里是收到通道的消息之后执行的方法
    }
}