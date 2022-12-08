module com.internshala.connect.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.internshala.connectfour to javafx.fxml;
    exports com.internshala.connectfour;
}