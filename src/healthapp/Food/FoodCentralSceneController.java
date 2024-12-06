/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthapp.Food;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tosha
 */
public class FoodCentralSceneController implements Initializable {

    @FXML
    private TextField searchBox;
    @FXML
    private TableView<?> foodIInputTable;
    @FXML
    private TableColumn<?, ?> foodNameColumn;
    @FXML
    private TableColumn<?, ?> calorySizeColumn;
    @FXML
    private Button saveButton;
    @FXML
    private TableView<?> foodServeTable;
    @FXML
    private TableColumn<?, ?> foodNameColumn2;
    @FXML
    private TableColumn<?, ?> CaloryColumn2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSearrch(ActionEvent event) {
    }
    
}
