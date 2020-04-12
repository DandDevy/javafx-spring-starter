package com.example.demo;

import com.example.demo.GUIApplication.StageReadyEvent;
import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {
    @Override
    public void onApplicationEvent(StageReadyEvent stageReadyEvent) {
        Stage stage = stageReadyEvent.getStage();
    }
}
