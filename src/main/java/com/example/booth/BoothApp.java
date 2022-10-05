package com.example.booth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.slack.api.bolt.App;

@Configuration
public class BoothApp {
    @Bean
    public App initBooth() {

        App app = new App();

        // Receive command from user

        // Identify specific user by grabbing id

        // Send ephemeral response message

        // Send result to required user (admin)

        app.command("/hello", (req, ctx) -> {
            return ctx.ack(" :wave: pong!");
        });

        return app;
    }
}
