package com.epam.jmp.durablereceiver.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Receiver {
    @JmsListener(destination = "durableQueue", containerFactory = "jmsListenerContainerFactory", subscription = "testSubscription")
    public void receiveMessage(String message) {
        log.info(String.format("Message received: %s", message));
    }
}
