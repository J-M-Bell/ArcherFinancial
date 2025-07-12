package jm.bell.projects.archerfinancial.ViewModels;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import jm.bell.projects.archerfinancial.ArcherFinancialApp;

import java.io.IOException;
import java.util.Objects;

public class WelcomeViewModel implements ViewModel {
    @FXML
    private Label welcomeText;



    @FXML
    public void onCreateAccountButtonClick(ActionEvent event) throws IOException {
        ViewModel.showScene(event, "Views/ProfileFormView.fxml");
    }


}