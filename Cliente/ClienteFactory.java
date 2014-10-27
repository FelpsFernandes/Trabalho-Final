/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junior-PC
 */
public class ClienteFactory {
    private HashMap<String,Cliente> cliente;

    public ClienteFactory() {
        this.setCliente();
    }

    private void setCliente() {
        cliente = new HashMap<>();
        cliente.put("Estudante", new Estudante());
        cliente.put("Adulto", new Adulto());
        cliente.put("Idoso", new Idoso());
    }
    
    public Cliente createCliente(String Key){ 
        try {
            return cliente.get(Key).getClass().newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
