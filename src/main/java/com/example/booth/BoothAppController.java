package com.example.booth;

import com.slack.api.bolt.App;
import com.slack.api.bolt.servlet.SlackAppServlet;
import javax.servlet.annotation.WebServlet;

@WebServlet("/slack/events")
public class BoothAppController extends SlackAppServlet {

    public BoothAppController(App app) {
        super(app);
    }
}
