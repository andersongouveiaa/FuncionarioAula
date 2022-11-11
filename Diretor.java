package org.example;

public class Diretor extends Funcionario {
    @Override
    public void aumentoSalario() {
        setSalario(getSalario()*1.1);
    }
}