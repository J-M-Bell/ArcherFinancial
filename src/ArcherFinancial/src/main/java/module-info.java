module jm.bell.projects.archerfinancial {
    requires javafx.controls;
    requires javafx.fxml;


    opens jm.bell.projects.archerfinancial to javafx.fxml;
    exports jm.bell.projects.archerfinancial;
    exports jm.bell.projects.archerfinancial.ViewModels;
    opens jm.bell.projects.archerfinancial.ViewModels to javafx.fxml;
}