package org.example.guiapp_system;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    public TextArea welcomeText;
    public TextField  number ;

    int rate = 1000;


    @FXML
    protected void onHelloButtonClick() {


        welcomeText.setText("Welcome to JavaFX Application!");
        number.setText(String.valueOf(rate+rate));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        welcomeText.setText("Your oder will drop here");
        number.setText(String.valueOf(rate));
    }
}