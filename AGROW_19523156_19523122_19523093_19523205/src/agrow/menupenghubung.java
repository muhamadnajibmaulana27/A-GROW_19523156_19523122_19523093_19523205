/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author User
 */
public class menupenghubung implements initiazable {
     @FXML
    private Label logout;
    private Button Investor, Petani;
    
    
    @FXML
    private void handleButtonPenjual(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(InvestorController.class.getResource("Investor.fxml"));

            Stage dialogStage = new Stage();
            dialogStage.setTitle("A-GROW");
            
        
            dialogStage.initModality(Modality.APPLICATION_MODAL);

            Scene scene = new Scene(loader.load());
            dialogStage.setScene(scene);
            dialogStage.showAndWait();
    }
    
    @FXML
    private void handleButtonPembeli(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("PAYMENT.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.hide(); 
        app_stage.show();
    }
    
    @FXML
    private void handleLogout(MouseEvent event) {
        System.exit(0);
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

    

