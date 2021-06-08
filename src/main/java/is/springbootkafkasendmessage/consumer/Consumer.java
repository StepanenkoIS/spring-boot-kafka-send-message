package is.springbootkafkasendmessage.consumer;


import is.springbootkafkasendmessage.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class Consumer {

    private List<Message> messageList = new ArrayList<>();

    @KafkaListener(topics = "messages")
    public void consume(Message message) {
        System.out.println("Consuming the message: " + message);
        messageList.add(message);
    }


    public List<Message> getMsg() {
        return messageList;
    }
}
