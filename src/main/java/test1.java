import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

public class test1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-kafkaConfig.xml");
        KafkaTemplate kafkaTemplate = (KafkaTemplate) applicationContext.getBean("kafkaTemplate");
        kafkaTemplate.send("topic1","valalalal");
    }
}
