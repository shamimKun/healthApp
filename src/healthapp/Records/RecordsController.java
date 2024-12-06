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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author tosha
 */
public class RecordsController implements Initializable {

    @FXML
    private TableView<?> bloodSugerTable;
    @FXML
    private TableColumn<?, ?> sugerDateColumn;
    @FXML
    private TableColumn<?, ?> sugerLaelColumn;
    @FXML
    private TableView<?> bloodPressureTable;
    @FXML
    private TableColumn<?, ?> pressureDateColumn;
    @FXML
    private TableColumn<?, ?> pressureLavelColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
