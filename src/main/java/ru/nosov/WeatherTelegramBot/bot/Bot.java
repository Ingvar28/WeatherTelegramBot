package ru.nosov.WeatherTelegramBot.bot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.nosov.WeatherTelegramBot.config.BotConfig;

@Component
@Slf4j
public class Bot extends TelegramLongPollingBot {

    private final BotConfig config;
//    private final WeatherService weatherService;
//    private final UserService userService;

    @Autowired
    public Bot(BotConfig config) {
        this.config = config;
//        this.weatherService = weatherService;
//        this.userService = userService;
    }

    @Override
    public String getBotToken() {
        return config.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return config.getBotUserName();
    }
}
