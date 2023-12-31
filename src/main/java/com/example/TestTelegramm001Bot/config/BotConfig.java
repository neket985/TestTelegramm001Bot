package com.example.TestTelegramm001Bot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properies")
@Data

public class BotConfig {

    @Value("${bot.name}")
    String BotName;

    @Value("${bot.token}")
    String token;

}
