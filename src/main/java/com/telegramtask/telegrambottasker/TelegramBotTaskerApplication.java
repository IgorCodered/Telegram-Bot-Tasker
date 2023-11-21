package com.telegramtask.telegrambottasker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;

@SpringBootApplication
@EnableTelegramBots
@EnableAsync
public class TelegramBotTaskerApplication {

    public static void main(String[] args) {

        SpringApplication.run(TelegramBotTaskerApplication.class);
    }
}
