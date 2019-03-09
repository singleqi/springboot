package cn.singleqi.header;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HeaderListener {
    @RabbitListener(queues = "header.queue")    //监听器监听指定的Queue
    public void process1(byte[] msg) {
        System.out.println("header message:" + new String(msg));
    }
}
