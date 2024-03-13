module danmarkskort.danmarkskort {
    requires javafx.controls;
    requires javafx.fxml;


    opens danmarkskort.danmarkskort to javafx.fxml;
    exports danmarkskort.danmarkskort;
}