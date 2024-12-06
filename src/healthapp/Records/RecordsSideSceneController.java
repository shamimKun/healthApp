/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthapp.Records;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author tosha
 */
public class RecordsSideSceneController implements Initializable {

    @FXML
    private VBox resetButtonPressure;
    @FXML
    private TextField sugerLavelInput;
    @FXML
    private DatePicker sugerDate;
    @FXML
    private Button todayButtonSuger;
    @FXML
    private Button resetButtonSuger;
    @FXML
    private Button saveButtonSuger;
    @FXML
    private TextField pressureInput;
    @FXML
    private DatePicker pressureDateInput;
    @FXML
    private HBox todayButtonPressure;
    @FXML
    private Button saveButtonePressure;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
