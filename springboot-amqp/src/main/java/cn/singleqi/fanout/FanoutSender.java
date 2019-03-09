package cn.singleqi.fanout;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //routingKey fanout.message被忽略
//    @Scheduled(fixedDelay = 1000L)
    public void send(){
        rabbitTemplate.convertAndSend("fanoutExchange","fanout.message","fanout Sender");
    }
}
