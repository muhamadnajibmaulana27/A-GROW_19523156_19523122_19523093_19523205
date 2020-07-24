/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrow;

/**
 *
 * @author User
 */
public class petani {

    static Investor[] OpenXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String Lahan;
    String Luas;
    String Jumlah;
    
    public petani(String x, String y, String z){
        this.Lahan = x ;
        this.Luas = y ;
        this.Jumlah = z ;
    }

    public String getLahan() {
        return Lahan;
    }

    public String getLuas() {
        return Luas;
    }
    
    public String getJumlah() {
        return Jumlah;
    }

    
}

    

