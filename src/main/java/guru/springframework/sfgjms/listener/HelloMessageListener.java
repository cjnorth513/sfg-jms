package guru.springframework.sfgjms.listener;

import guru.springframework.sfgjms.config.JmsConfig;
import guru.springframework.sfgjms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){

//        System.out.println("I got a Message!!!");
//        System.out.println(helloWorldMessage);
    }

    @JmsListener(destination = JmsConfig.MY_SEND_REC_QUEUE)
    public void listenForHello(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){

        System.out.println("I got a Message!!!");
        System.out.println(helloWorldMessage);
    }

}
