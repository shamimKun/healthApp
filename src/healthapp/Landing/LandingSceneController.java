/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthapp.Landing;

import healthapp.Core.Utility;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author tosha
 */
public class LandingSceneController implements Initializable {

    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private AnchorPane UpperPane;
    @FXML
    private ImageView helthlogo;
    @FXML
    private Label helloLabel;
    @FXML
    private Label taglineLabel;
    @FXML
    private Label dateILabel;
    @FXML
    private ImageView dateIcon;
    @FXML
    private AnchorPane leftSidePane;
    @FXML
    private VBox leftMenuBox;
    @FXML
    private Button homeButton;
    @FXML
    private Button activitesButton;
    @FXML
    private Button foodButton;
    @FXML
    private Button recordsButton;
    @FXML
    private Button profileButton;
    @FXML
    private Button contactsButton;
    @FXML
    private Button indexButton;
    @FXML
    private Button miscButton;
    @FXML
    private AnchorPane centralPane;
    @FXML
    private HBox centralHbox;
    @FXML
    private Pane caloriesTakenPane;
    @FXML
    private Label takenMessageLabel;
    @FXML
    private Label caloriesTakenOutputLabel;
    @FXML
    private Pane caloriesBurnPane;
    @FXML
    private Label burnLabel;
    @FXML
    private Label caloriesBurnOutputLabel;
    @FXML
    private Pane caloriesRemainPane;
    @FXML
    private Label remainLabel;
    @FXML
    private Label caloriesRemainOutputLabel;
    @FXML
    private AnchorPane rightSidePane;
    @FXML
    private VBox rightSideHbox;
    @FXML
    private Pane agePane;
    @FXML
    private Label AgeLAbel;
    @FXML
    private Label ageOutputLabel;
    @FXML
    private Pane weightPane;
    @FXML
    private Label weightLabel;
    @FXML
    private Label weightOutputLabel;
    @FXML
    private Pane heightPane;
    @FXML
    private Label heightLabel;
    @FXML
    private Label heightOutputLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleHome(ActionEvent event) throws Exception
    {
         Utility.changeToScene (getClass(), event, "/healthapp/Landing/landingScene.fxml");
    }

    @FXML
    private void handleActivities(ActionEvent event) throws Exception
    {
        Utility.changeCenterScene(mainBorderPane, getClass(), "/healthapp/Activities/activitiesCentralScene.fxml");
        Utility.changeRightScene(mainBorderPane, getClass(), "/healthapp/Activities/activitiesSideScene.fxml");
 
    }

    @FXML
    private void handleFood(ActionEvent event) throws Exception 
    {
        Utility.changeCenterScene(mainBorderPane, getClass(), "/healthapp/Food/foodCentralScene.fxml");
        Utility.changeRightScene(mainBorderPane, getClass(), "/healthapp/Food/foodSideScene.fxml");
    }

    @FXML
    private void handleRecords(ActionEvent event) throws Exception
    {
        Utility.changeCenterScene(mainBorderPane, getClass(), "/healthapp/Records/records.fxml");
        Utility.changeRightScene(mainBorderPane, getClass(), "/healthapp/Records/recordsSideScene.fxml");
    }

    @FXML
    private void handleProfile(ActionEvent event) throws Exception{
        Utility.changeCenterScene(mainBorderPane, getClass(), "/healthapp/Profile/profileCentralScene.fxml");
        Utility.changeRightScene(mainBorderPane, getClass(), "/healthapp/Profile/profileSideScene.fxml");
    }

    @FXML
    private void handleContacts(ActionEvent event) throws Exception
    {
        Utility.changeCenterScene(mainBorderPane, getClass(), "/healthapp/Contacts/contactsCentralScene.fxml");
        Utility.changeRightScene(mainBorderPane, getClass(), "/healthapp/Profile/profileSideScene.fxml");
    }

    @FXML
    private void handleIndex(ActionEvent event) {
    }

    @FXML
    private void handleMisc(MouseEvent event) {
    }
    
}
