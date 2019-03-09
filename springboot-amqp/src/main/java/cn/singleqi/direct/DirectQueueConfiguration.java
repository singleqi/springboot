package cn.singleqi.direct;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectQueueConfiguration {

    @Bean
    public Queue directQueue() {
        return new Queue("direct");
    }
}
