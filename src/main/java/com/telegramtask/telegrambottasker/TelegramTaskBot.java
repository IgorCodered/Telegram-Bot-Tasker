package com.telegramtask.telegrambottasker;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramTaskBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {
        return "6949058415:AAG6v_veJf95Q-e3DCpcOcZTC9AU6OcmFPA";
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
