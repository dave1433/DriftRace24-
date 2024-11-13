module dk.davidcho.driftrace {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.davidcho.driftrace to javafx.fxml;
    exports dk.davidcho.driftrace;
}