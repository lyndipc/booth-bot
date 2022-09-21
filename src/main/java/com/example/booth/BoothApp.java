package com.example.booth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.slack.api.bolt.App;

@Configuration
public class BoothApp {
    @Bean
    public App initBooth() {
        App app = new App();
        app.command("/hello", (req, ctx) -> {
            return ctx.ack("Heyyy");
        });

        return app;
    }
}
