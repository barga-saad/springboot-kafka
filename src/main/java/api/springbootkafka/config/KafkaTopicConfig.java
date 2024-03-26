package api.springbootkafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic apiTopic(){
        return TopicBuilder.name("api")
                .build();
    }

    @Bean
    public NewTopic apiJsonTopic(){
        return TopicBuilder.name("api_json")
                .build();
    }
}
