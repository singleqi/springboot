package cn.singleqi.direct;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class DirectListener {

    @RabbitListener(queues = "direct")
    public void process(@Payload String message) {
        System.out.println("direct listener process1," + message);
    }

    @RabbitListener(queues = "direct")
    public void process2(@Payload String message) {
        System.out.println("direct listener process2," + message);
    }
}
