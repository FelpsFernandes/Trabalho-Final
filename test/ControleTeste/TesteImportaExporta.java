/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ControleTeste;

import Controle.Controle;
import Controle.ImportaExporta;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Junior-PC
 */
public class TesteImportaExporta {
    private final ImportaExporta imp;
    
    public TesteImportaExporta() {
        imp = ImportaExporta.getInstance();
    }
    
    @Test
    public void testeLeituraArquivoInexistente(){
        Controle teste = imp.Le();
        assertEquals(null,teste);
    }
    
    @Test
    public void testeGrava(){
        Controle teste2 = new Controle();
        assertEquals(true,imp.Grava(teste2));
    }
    
    @Test
    public void testeLeituraArquivo(){
        Controle teste = imp.Le();
        assertNotNull(teste);
    }
    

}
