package org.example.controller;

import org.example.pojo.Client;
import org.example.testdata.DefaultData;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/positions")
    public Object processMessage(Client client) {
        return DefaultData.clientsPositions().get(client.getLogin());
    }
}
