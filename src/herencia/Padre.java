/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Jhon Bellaizac
 */
public class Padre extends Abuelo{
 String varPadre = "Padre";
 
 public void metodoPadre(){
     metodoAbuelo();
     System.out.println("varPadre");
 }
}
