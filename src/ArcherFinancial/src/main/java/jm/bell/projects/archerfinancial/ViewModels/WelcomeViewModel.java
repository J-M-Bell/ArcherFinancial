package jm.bell.projects.archerfinancial.ViewModels;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WelcomeViewModel {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}