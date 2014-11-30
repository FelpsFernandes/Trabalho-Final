/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dados.Sessao;
import java.util.ArrayList;

/**
 *
 * @author Felipe.f
 */
public class EmCartaz implements Observable {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private ArrayList sessoes = new ArrayList<Sessao>();

    public ArrayList getObservers() {
        return observers;
    }

    public void setObservers(ArrayList observers) {
        this.observers = observers;
    }

    public ArrayList getSessoes() {
        return sessoes;
    }

    public void addSessoes(Sessao sessao) {
        this.sessoes.add(sessao);
        this.notifyObservers();
    }
     
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob: observers) {
            ob.update(sessoes);
        }
    }

}
