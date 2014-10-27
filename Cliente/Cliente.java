/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cliente;

/**
 *
 * @author Junior-PC
 */
public abstract class Cliente {
    private String nome;
    
    public abstract float calculaValorIngresso(float valor);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
