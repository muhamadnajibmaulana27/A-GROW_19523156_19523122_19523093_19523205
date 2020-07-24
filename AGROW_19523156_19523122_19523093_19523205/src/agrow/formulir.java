/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrow;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author User
 */
public class formulir {
   
    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;
    
    @FXML
    private TextField unameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;
    
    @FXML
    private Label kembali;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
        Window owner = submitButton.getScene().getWindow();
        if(nameField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle ("Maaf!");
            alert.setHeaderText("Mohon masukkan nama anda!");
            alert.showAndWait();
            return;
        }
        if(emailField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle ("Maaf!");
            alert.setHeaderText("Mohon masukkan email anda!");
            alert.showAndWait();
            return;
        }
        if(unameField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle ("Maaf!");
            alert.setHeaderText("Mohon masukkan username anda!");
            alert.showAndWait();
            return;
        }
        if(passwordField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle ("Maaf!");
            alert.setHeaderText("Mohon masukkan password!");
            alert.showAndWait();
            return;
        }
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle ("Berhasil");
            alert.setHeaderText("Registrasi Berhasil");
            alert.setContentText("Selamat Datang " + nameField.getText());
            alert.showAndWait();
            
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("AKUN.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.hide(); 
        app_stage.show(); 
    }
    
    @FXML
     private void handleKembali(MouseEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("AKUN.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.hide(); 
        app_stage.show();
     }
}

    

