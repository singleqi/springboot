package cn.singleqi.topic;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicListener {
    @RabbitListener(queues="topic.message.queue")    //监听器监听指定的Queue
    public void process1(String str) {
        System.out.println("topic message:"+str);
    }
    @RabbitListener(queues="topic.messages.queue")    //监听器监听指定的Queue
    public void process2(String str) {
        System.out.println("topic messages:"+str);
    }
}
