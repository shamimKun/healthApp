/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthapp.Activities;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author tosha
 */
public class ActivitiesCentralSceneController implements Initializable {

    @FXML
    private TextField walkingInputText;
    @FXML
    private TextField runningInputText;
    @FXML
    private TextField swimmimgInputText;
    @FXML
    private TextField excerciseInputText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveInWalkingHashMap(ActionEvent event) {
    }

    @FXML
    private void saveInRunningHashMap(ActionEvent event) {
    }

    @FXML
    private void saveInSwiimingHashMap(ActionEvent event) {
    }

    @FXML
    private void saveInExeciseHashMap(ActionEvent event) {
    }
    
}
