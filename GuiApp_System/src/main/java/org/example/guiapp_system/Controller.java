package org.example.guiapp_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Integer.*;

public class Controller implements Initializable {

    @FXML
    private TextArea welcomeText;
    @FXML
    private TextField  number ;
    @FXML
    private TextField name;
    @FXML
    private TextField rate;
    @FXML
    private RadioButton rbutton1, rbutton2, rbutton3;
    @FXML
    private CheckBox checkbox1, checkbox2, checkbox3, checkbox4;
    @FXML
    private TextField valueTopping;
    @FXML
    private TextField total;
    @FXML
    private TextField quantity;


    int onion = 2;
    int cheese = 3;
    int tomato = 3;
    int corn = 1;
    int orderNumber = 1000;
    int value = 0;
    int quantityPizza = 1;



    public void getFood(ActionEvent event){

        if (rbutton1.isSelected()){
            rate.setText(String.valueOf(10));

        }
        if (rbutton2.isSelected()){

            rate.setText(String.valueOf(20));
        }
        if (rbutton3.isSelected()){
            rate.setText(String.valueOf(25));
        }
    }
    public void getFood2(ActionEvent event){

        if (checkbox1.isSelected()){
           valueTopping.setText(String.valueOf(onion));

           if (checkbox1.isSelected() && checkbox3.isSelected()){
               valueTopping.setText(String.valueOf(+onion+tomato));
           }
           if (checkbox1.isSelected() && checkbox4.isSelected()){
               valueTopping.setText(String.valueOf(onion+corn));
           }
           if (checkbox1.isSelected() && checkbox2.isSelected()){
               valueTopping.setText(String.valueOf(onion+cheese));
           }

            if (checkbox1.isSelected() && checkbox2.isSelected() && checkbox3.isSelected()){

                valueTopping.setText(String.valueOf(onion+cheese+tomato));
            }
           if (checkbox1.isSelected() && checkbox2.isSelected() && checkbox4.isSelected()){
               valueTopping.setText(String.valueOf(onion+cheese+corn));
           }
           if (checkbox1.isSelected() && checkbox3.isSelected() && checkbox4.isSelected()){
               valueTopping.setText(String.valueOf(onion+tomato+corn));

           }
            if (checkbox1.isSelected() && checkbox2.isSelected() && checkbox3.isSelected() && checkbox4.isSelected()){
                valueTopping.setText(String.valueOf(onion+cheese+tomato+corn));
            }
        }
        else if (checkbox2.isSelected()){
            valueTopping.setText(String.valueOf(cheese));
            if (checkbox2.isSelected() && checkbox3.isSelected()){
                valueTopping.setText(String.valueOf(cheese+tomato));
            }
            if (checkbox2.isSelected() && checkbox4.isSelected()){
                valueTopping.setText(String.valueOf(cheese+corn));
            }
            if (checkbox2.isSelected() && checkbox3.isSelected() && checkbox4.isSelected()){


                valueTopping.setText(String.valueOf(cheese+tomato+corn));

            }

        }

         else if (checkbox3.isSelected()){
            valueTopping.setText(String.valueOf(tomato));
            if (checkbox3.isSelected() && checkbox4.isSelected()){
                valueTopping.setText(String.valueOf(tomato+corn));
            }
        }
        else if (checkbox4.isSelected()){
            valueTopping.setText(String.valueOf(corn));
        }

        else {
            valueTopping.setText(String.valueOf(value));
        }



    }

    public void generateInvoice(){

    int quantityPizza2 = Integer.parseInt(String.valueOf(quantity.getText()));
    int topping = parseInt(valueTopping.getText());
    int rateValue = parseInt(rate.getText());
    int sum = (topping+rateValue)*quantityPizza2;
    total.setText("$"+sum);



    }

    @FXML
    public void onHelloButtonClick() {

        String nameFinal = name.getText();

        number.setText(String.valueOf(orderNumber+orderNumber));

        welcomeText.setText("Welcome "+nameFinal+" your total bill is "+number.getText());

        System.out.println(name);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        welcomeText.setText("Your oder will drop here");
        number.setText(String.valueOf(orderNumber));
        valueTopping.setText("$"+String.valueOf(value));
        quantity.setText(String.valueOf(quantityPizza));
        name.getText();

    }
}