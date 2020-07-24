/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author User
 */

    
public class KatalogController implements Initializable {
    
    ObservableList najib = observableArrayList(
            /*
            new Lahan(luas 100m x 120m ", "5"),
            new Lahan("luas 200m x 150m", "4"),
            new Lahan("luas 300m x 250m, "6"),
            new Lahan("luas 250m x 300m ", "8"),
            new Lahan("luas 400m x 250m ", "3")
            */
            );
    
    Investor[] savenajib;
    fileXML xml = new fileXML();
    
    XYChart.Series<String, Integer> series = new XYChart.Series();
    
    @FXML
    private BarChart<String, Integer> bc;
    @FXML
    private Label kembali;
    private Investor[] Investor;
    private Object[] Petani;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
            Petani = petani.OpenXML();
            for(int i=0; i< Petani.length; i++){
            najib.add(new petani (
            Petani[i].getLahan(),
            Petani[i].getLuas(),
            Petani[i].getJumlah()
            ));
        
        TableView<KatalogController> tableV;
                tableV = new TableView();
        
        tableV.setItems(najib);
        TableView.TableViewSelectionModel selmod = tableV.getSelectionModel();
        selmod.setSelectionMode(SelectionMode.SINGLE);
        /*
        series.getData().add(new XYChart.Data("Lahan luas 100m x 120m", 5));
        series.getData().add(new XYChart.Data("Lahan luas 200m x 150m", 4 ));
        series.getData().add(new XYChart.Data("Lahan luas 300m x 250m", 6 ));
        series.getData().add(new XYChart.Data("Lahan luas 250m x 300m  ", 8));
        series.getData().add(new XYChart.Data("Lahan luas 400m x 250m ", 3));
        */
        bc.getData().clear();
        
        String t1, t2;
        
       // for (int i=0; i<=-1; i++){
            selmod.select(i);
            t1 = tableV.getItems().get(i).getLahan();
            t2 = tableV.getItems().get(i).getLuas();
            int sum = Integer.parseInt(t2);
            series.getData().add(new XYChart.Data<>(t1, sum));
        }
        bc.getData().add(series);
        bc.setTitle("Grafik investasi Lahan");
        
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

    private String getLahan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getLuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    




