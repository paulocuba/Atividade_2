/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2;

/**
 *
 * @author paulo
 */
public class Cliente {
    private String nome;
    private String telefone;
    private double limitecredito;
    private String pais;
    private String sigla;
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setLimitecredito(double limitecredito){
        this.limitecredito=limitecredito;
    }
    
    public double getLimitecredito(){
        return limitecredito;
    }
    
    public void setPais(String pais){
        this.pais=pais;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setSigla(String sigla){
        this.sigla=sigla;
    }
    
    public String getSigla(){
        return sigla;
    }
}
