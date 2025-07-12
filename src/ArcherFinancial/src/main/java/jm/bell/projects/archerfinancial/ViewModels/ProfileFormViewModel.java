package jm.bell.projects.archerfinancial.ViewModels;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ProfileFormViewModel implements ViewModel {

    public void onCancelButtonClick(ActionEvent event) throws IOException {
        ViewModel.showScene(event, "Views/WelcomeView.fxml");
    }
}
