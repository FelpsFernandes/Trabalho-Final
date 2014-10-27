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
public class Estudante extends Cliente{

    @Override
    public float calculaValorIngresso(float valor) {
        return (valor/2);
    }
    
}
