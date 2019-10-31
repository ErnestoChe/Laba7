package sample.zadanie4;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ControllerTask4 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton RadioEasy;

    @FXML
    private ToggleGroup group1;

    @FXML
    private RadioButton RadioMedium;

    @FXML
    private RadioButton RadioHard;

    @FXML
    private Button ButtonStartStop;

    @FXML
    private Label LabelTaunt;

    @FXML
    private Button ButtonToCatch;

    @FXML
    void initialize() {
        ButtonStartStop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LabelTaunt.setText("Лови");
                boolean isSelected = RadioEasy.isSelected();
                Random r = new Random();
                int y = r.nextInt(250);
                int x = r.nextInt(300) - 300;
                ButtonToCatch.setTranslateY(y);
                ButtonToCatch.setTranslateX(x);
            }
        }
        );
        ButtonToCatch.setOnAction(e -> LabelTaunt.setText("Пиймав на гендзюцу"));
    }
}


// x -300 0
// y  0 250


//TODO timer