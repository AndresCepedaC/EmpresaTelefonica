module empresatelefonica.empresatelefonicaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens empresatelefonica.empresatelefonicaapp to javafx.fxml;
    exports empresatelefonica.empresatelefonicaapp;
    exports empresatelefonica.empresatelefonicaapp.app;
    opens empresatelefonica.empresatelefonicaapp.app to javafx.fxml;
}