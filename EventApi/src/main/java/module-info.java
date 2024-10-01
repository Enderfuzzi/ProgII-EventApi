module com.prog.eventapi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.prog.eventapi to javafx.fxml;
    exports com.prog.eventapi;
}