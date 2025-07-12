package jm.bell.projects.archerfinancial.ViewModels;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jm.bell.projects.archerfinancial.ArcherFinancialApp;

import java.io.IOException;
import java.util.Objects;

public interface ViewModel {
    static void showScene(ActionEvent event, String sceneUrl) throws IOException {
        Stage stage;
        Scene scene;
        Parent root;
        root = FXMLLoader.load(Objects.requireNonNull(ArcherFinancialApp.class.getResource(sceneUrl)));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
