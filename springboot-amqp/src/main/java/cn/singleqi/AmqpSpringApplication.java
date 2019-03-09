package cn.singleqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * SpringBoot AMQP RabbitMQ的四种交换机类型
 * 使用消息中间件的优缺点、区别：https://blog.csdn.net/Iperishing/article/details/86674084
 * 解耦、异步、削峰
 * 解耦：如果消息的接收方是多个系统，那么调用接口是一个高耦合度的，在添加和删除接口时很麻烦
 * 异步：调用ABC接口需顺序执行A、B、C的业务逻辑，时间较长，如果发送到消息中间件，则可以立即返回
 * 削峰：在高请求量时防止服务器、数据库宕机
 */
@SpringBootApplication
@EnableScheduling
public class AmqpSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmqpSpringApplication.class, args);
    }
}
