package agrow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class InvestorController implements initializable{
     @FXML
    private Label label, LAlamat, LNama, LLahan, LJumlah, LHarga, 
            LTanggal, LPembayaran, LInfo, kembali; 
    
    @FXML
    private TextField TFAlamat, TFNama, TFLahan, TFJumlah, TFHarga;
    
    @FXML
    private DatePicker DPTanggal;
    
    @FXML
    private Button buttonOut;
    
    @FXML
    private RadioButton RBVirtual,RBApss;
    
    @FXML
    private void handleButtonVirtual(ActionEvent event){
        String radiob = event.getSource().toString();
        int rb = radiob.length();
        
        label.setText(radiob.substring(rb-20, rb-1));
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        try{
        String t1 = TFLahan.getText();
        String t2 = TFJumlah.getText();
        String t3 = TFHarga.getText();
        String t4 = TFAlamat.getText();
        String t5 = TFNama.getText();
        DPTanggal.getValue();
        String t7 = label.getText();
        
        if(TFLahan.getText().equals("") || TFJumlah.getText().equals("")||
                TFHarga.getText().equals("") || TFAlamat.getText().equals("") || 
                TFNama.getText().equals("")|| label.getText().equals("")||
                DPTanggal.getValue().equals("")
                        ){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle ("Maaf!");
            alert.setHeaderText("Tidak boleh ada satu datapun yang kosong");
            alert.showAndWait();
        }
        else{
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle ("A-GROW");
        alert.setHeaderText("TERIMAKASIH TELAH MELAKUKAN PEMBELIAN DI TOKO KAMI");
        alert.showAndWait();
    }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Isi sesuai tipe data");
                }
        
    }
    
    @FXML
     private void handleKembali(MouseEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("PENGHUBUNG.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.hide(); 
        app_stage.show(); 
     }
        
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

        }

