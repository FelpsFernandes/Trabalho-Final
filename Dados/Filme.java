/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dados;

import java.io.Serializable;

/**
 *
 * @author Junior-PC
 */
public class Filme implements Serializable  {
    private String nome;
    private Integer classificacao;
    private Double duracao;
    private String genero;

    public Filme(String nome, Integer classificacao, Double duracao, String genero) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.duracao = duracao;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
