/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junior-PC
 */
public class ImportaExporta {
    private static final String diretorio = "c:/temp/2/test.txt";
    private static ImportaExporta instance;
    
    private ImportaExporta() {
        
    }
    
    public static ImportaExporta getInstance(){
        if (instance == null)
            instance = new ImportaExporta();
        return instance;
    }
    

    public void Grava(Controle controleAtu){
        try {
            File arqDestino = new File(diretorio);
            if (!arqDestino.exists()){
                arqDestino.mkdir();
            }
            
            
            FileOutputStream fos = new FileOutputStream(arqDestino);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(controleAtu);
            oos.flush();
            oos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportaExporta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportaExporta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Controle Le(){
        try{
            Controle controleAtu = null;    
            File arqOrigem = new File(diretorio);
            if (!arqOrigem.exists()){
                arqOrigem.mkdir();
            }
            if(arqOrigem.length() == 0 ){
                return null;
            }
            FileInputStream fis = new FileInputStream(arqOrigem);    
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            controleAtu = (Controle) ois.readObject();
            
            ois.close();
            
            return controleAtu;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportaExporta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportaExporta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ImportaExporta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
