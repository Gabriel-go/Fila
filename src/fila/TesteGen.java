/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author Gabriel
 */
public class TesteGen {
  public static void main(String[] args) {


    FilaGen<String> filaDeString = new FilaGen<String>();
    filaDeString.insere("Adelaide");
    filaDeString.insere("Carolina");

    String carolina = filaDeString.remove();
    String adelaide = filaDeString.remove();

    System.out.println(carolina);
    System.out.println(adelaide);
  }    
}
