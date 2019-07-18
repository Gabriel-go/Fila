/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Fila {
    private List<Aluno> alunos = new LinkedList<Aluno>();
    
    public void insere(Aluno aluno) {
        // implementação
        this.alunos.add(aluno);
    }

    public Aluno remove() {
        // implementação
        return this.alunos.remove(0);
    }

    public boolean vazia() {
        // implementação
        return this.alunos.size() == 0;
    }
}
