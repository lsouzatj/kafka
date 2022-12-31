package com.br.kafka.consumer;

import com.br.kafka.model.Person;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class KafkaConsumer {

    @Value("${topic.name.producer.person}")
    private String topicSendPerson;

    @KafkaListener(topics = "${topic.name.producer.person}", groupId = "${group.name.person}", containerFactory = "personListener")
    public void consumerPersonOfTopic(Person person) {
        log.info("Tópico: {}", topicSendPerson);
        log.info("KafkaConsumer Payload received successfuly. Notificação enviada ao cliente com os dados: {}", person);
    }
}
