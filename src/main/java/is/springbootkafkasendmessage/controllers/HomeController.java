package is.springbootkafkasendmessage.controllers;

import is.springbootkafkasendmessage.consumer.Consumer;
import is.springbootkafkasendmessage.model.Message;
import is.springbootkafkasendmessage.producer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private ProducerService producerService;

    @Autowired
    private Consumer consumer;

    @GetMapping("/setmsg")
    public String setmsg(@RequestParam String message, @RequestParam Integer age) {
        producerService.produce(new Message(message, age));
        return "OK";
    }

    @GetMapping("/getmsg")
    public List<Message> getmsg() {
        return consumer.getMsg();
    }

}
