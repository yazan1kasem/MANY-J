module at.ac.hcw.manyj {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens at.ac.hcw.manyj to javafx.fxml;
    exports at.ac.hcw.manyj;
}