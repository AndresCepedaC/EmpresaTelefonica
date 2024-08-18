module empresatelefonica.empresatelefonicaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens empresatelefonica.empresatelefonicaapp to javafx.fxml;
    exports empresatelefonica.empresatelefonicaapp;
}