package ba.unsa.etf.tsijercic1.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {

    private int number;

    public Label counterLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        number = 0;
    }

    public void nextNumber(ActionEvent actionEvent) {
        number++;
        counterLabel.setText(String.valueOf(number));
    }
}
