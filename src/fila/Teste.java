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
public class Teste {

    public static void main(String[] args) {
        Fila fila = new Fila();

        Aluno aluno = new Aluno();
        fila.insere(aluno);

        Aluno alunoRemovido = fila.remove();

        if (fila.vazia()) {
            System.out.println("A fila está vazia");
        }
    }
}
