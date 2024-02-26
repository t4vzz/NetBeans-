/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eteczl.otavio1;

/**
 *
 * @author Admin
 */
public class aplicacao {
    
    public static void main(String args[]){
            System.out.println(" Tênis da Nike! "); 
        
            Tenis t1 = new Tenis();
            Tenis t2 = new Tenis(); 
            Tenis t3 = new Tenis();
            
            t1.modelo = ("AirMax 90");
            t2.modelo = ("AirMax TN Plus");
            t3.modelo = ("AirMax TN 3 ");
            
            Tenis.marca = ("Nike");
            
            System.out.println(t1.modelo);
    
    }   
}
