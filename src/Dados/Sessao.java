/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dados;

import java.util.Date;

/**
 *
 * @author Felipe.f
 */
public class Sessao {
    private Filme filme;
    private Date data;
    private Sala sala;

    public Sessao(Filme filme, Date data, Sala sala){
        this.setFilme(filme);
        this.setData(data);
        this.setSala(sala);
    }
    
    public Filme getFilme() {
        return filme;
    }

    private void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Date getData() {
        return data;
    }

    private void setData(Date data) {
        this.data = data;
    }

    public Sala getSala() {
        return sala;
    }

    private void setSala(Sala sala) {
        this.sala = sala;
    }    
}
