module com.example.ejemplojavafxvideo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejemplojavafxvideo to javafx.fxml;
    exports com.example.ejemplojavafxvideo;
}