
package healthapp.Core;


import healthapp.Landing.LandingSceneController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author MichaelO
 */
public class Utility 
{
    // Example use:
    //  Utility.changeToScene (getClass(), event, "myXLM.fxml");
    public static void changeToScene(Class aClass, Event aEvent, String sceneFileStr)  throws Exception
    {
        Parent root = FXMLLoader.load (aClass.getResource(sceneFileStr));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) aEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();  
       
       
    }
    
     //  Utility.changeToPopUpScene (getClass(), event, "myXLM.fxml");
    public static void changeToPopUpScene(Class aClass, Event aEvent, String sceneFileStr) throws Exception
    {
        
            FXMLLoader loader = new FXMLLoader(aClass.getResource(sceneFileStr));
        
            Parent root = loader.load();

            // Create a new Stage for the popup
            Stage popupStage = new Stage();
            popupStage.initModality(Modality.APPLICATION_MODAL); // Block main window
           // popupStage.setTitle("Enter Age");
            popupStage.setScene(new Scene(root));
            popupStage.showAndWait(); // Wait for the popup to close
        
    }
    
    
    //Utility.changeCentreScene(borderPane,getClass(), event, "myXLM.fxml");
    public static void changeCenterScene(BorderPane borderPane, Class<?> aClass, String fxmlPath) throws Exception {
    try {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(aClass.getResource(fxmlPath));
        Node newContent = loader.load();
        
        // Set the loaded content to the center of the BorderPane
        borderPane.setCenter(newContent);

        System.out.println("Center scene successfully updated with: " + fxmlPath);
    } 
    
    catch (Exception e) {
        System.err.println("Error loading the center scene: " + fxmlPath);
        e.printStackTrace();
        throw e; // Re-throw exception for further handling if needed
    }
}
    
    
    public static void changeRightScene(BorderPane borderPane, Class<?> aClass, String fxmlPath) throws Exception {
    try {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(aClass.getResource(fxmlPath));
        Node newContent = loader.load();
        
        // Set the loaded content to the center of the BorderPane
        borderPane.setRight(newContent);

        System.out.println("Center scene successfully updated with: " + fxmlPath);
    } 
    
    catch (Exception e) {
        System.err.println("Error loading the center scene: " + fxmlPath);
        e.printStackTrace();
        throw e; // Re-throw exception for further handling if needed
    }
}

}

