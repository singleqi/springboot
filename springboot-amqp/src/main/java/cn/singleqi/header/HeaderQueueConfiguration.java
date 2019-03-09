package cn.singleqi.header;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class HeaderQueueConfiguration {

    @Bean
    public HeadersExchange headersExchange(){
        return new HeadersExchange("headerExchange");
    }

    @Bean
    public Queue headerQueue() {
        return new Queue("header.queue", true);
    }

    @Bean
    public Binding headerBinding(HeadersExchange headersExchange) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("h1", "v1");
        map.put("h2", "v2");
        return BindingBuilder.bind(headerQueue()).to(headersExchange).whereAll(map).match();
    }
}
