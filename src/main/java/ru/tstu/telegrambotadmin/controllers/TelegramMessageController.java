package ru.tstu.telegrambotadmin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.tstu.telegrambotadmin.repositories.TelegramMessageRepository;

/**
 * Created by user on 29.11.17.
 */
@Controller
public class TelegramMessageController {

    @Autowired
    private TelegramMessageRepository messageRepository;

    @RequestMapping("/messages")
    public String getMessages(Model model) {
        model.addAttribute("messages", messageRepository.findAll());
        return "messages";
    }

}
