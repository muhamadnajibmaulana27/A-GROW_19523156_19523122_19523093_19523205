/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrow;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Pair;

/**
 *
 * @author User
 */
public class DocumentController implements Initializable {
    
    @FXML
    private TextField TFUname;
    
    @FXML
    private PasswordField Pass;
    
    @FXML
    private Button signup;
    private Button login;
    
    
    
    @FXML
    private void handleButtonLogin(ActionEvent event) throws IOException {
       
        String username = "shinchan12";
        String password = "shinc";
        if(username.equalsIgnoreCase(TFUname.getText())&&
                password.equalsIgnoreCase(Pass.getText())){
        
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("PENGHUBUNG.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.hide(); 
        app_stage.show();
            
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle ("EROR!!");
            alert.setHeaderText("MOHON MAAF USERNAME ATAU PASSWORD TIDAK VALID");
            alert.showAndWait();
        }
    }
        
    
    @FXML
    private void handleButtonSignUp(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("RegFormFXML.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.hide(); 
        app_stage.show();
    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
