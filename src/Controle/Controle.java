/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import Dados.Filme;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Junior-PC
 */
public class Controle implements Serializable {
    ArrayList<Filme> filmes = new ArrayList<Filme>();
    
    public void addFilme(Filme F){
        filmes.add(F);
    }
    
}
