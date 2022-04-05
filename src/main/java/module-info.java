module com.java.calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires org.jetbrains.annotations;

    opens com.java.calculadora to javafx.fxml;
    exports com.java.calculadora;
}