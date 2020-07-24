/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrow;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author User
 */
public class fileXML {
    
    KatalogController petani = new KatalogController(new petani());
    
    public petani[] OpenXML(){
     
        FileInputStream scraper = null;
        try{
            
            scraper = new FileInputStream("ss.xml");
            
            int isi;
            char charnya;
            String stringnya;
        
            stringnya = "" ;
            while((isi = scraper.read()) != -1){
                charnya = (char) isi;
                stringnya = stringnya + charnya;
            }
                return ((Investor[])investor.fromXML(stringnya));
        }
        catch (Exception e){
                System.err.println("test: " + e.getMessage());
                return null;
            }
        finally{
                if (scraper != null){
                try{
                scraper.close();
                }
                catch(IOException e){
                }
            }
        }
    }

    public void saveXML(petani[] A){
        
        String xml = Petani.toXML(A);
        
        FileOutputStream ss = null;
        
        try{
            ss = new FileOutputStream("ss.xml");
            
            byte[] bytes = xml.getBytes("UTF-8");
            
            ss.write(bytes);
        }
        catch(Exception e){
            System.err.println("Perhatian: " + e.getMessage());
        }
        finally{
            if(ss != null){
                try{
                    ss.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

    
