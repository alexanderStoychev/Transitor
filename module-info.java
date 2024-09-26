
module com.sothawo.mapjfxdemo {
    requires com.sothawo.mapjfx;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.slf4j;

    opens com.transitor.group28 to javafx.fxml, javafx.graphics;
}
