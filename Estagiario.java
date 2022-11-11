package org.example;

public class Estagiario extends Funcionario {
    @Override
    public void aumentoSalario() {
        setSalario(getSalario()*1.02);
    }
}
