/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopProject;

/**
 *
 * @author Seth
 */
class Siono {
    private int qty;
    private String bn,auth,tit,stat;
    public Siono(String ISBN, String TITLE, String AUTHOR, String STATUS, int QUANTITY) {
        this.bn = ISBN;
        this.auth = AUTHOR;
        this.tit = TITLE;
        this.stat = STATUS;
        this.qty = QUANTITY;
    }
    
    public String getISBN(){
        return bn;
    }
    public String getTITLE(){
        return tit;
    }
    public String getAUTHOR(){
        return auth;
    }
    public String getSTATUS(){
        return stat;
    }
    public int getQUANTITY(){
        return qty;
    }
}
