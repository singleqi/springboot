package cn.singleqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
/**
 * 使用Redis实现消息队列(List->LPUSH->RPOP)、发布/订阅模式(自带发布订阅)
 * Redis简单命令使用：http://www.runoob.com/redis/redis-commands.html
 * Redis整合实例：https://www.jianshu.com/p/e81b7f4ffb07
 * Redis实现消息队列和消息中间件RabbitMQ的差别：https://blog.csdn.net/jordandandan/article/details/68946839
 */
public class RedisSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisSpringApplication.class, args);
    }
}
