package application;

import java.net.*;
import java.util.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class FXMLController implements Initializable {
    @FXML
    Button myButton;

    @FXML
    Label myLabel;

    private static int count;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myButton.setText("count");
        myLabel.setText("0");

    }

    @FXML

    public void handleButtonAction() {
        count++;
        System.out.println(count);
        myLabel.setText("" + count);

    }
}
