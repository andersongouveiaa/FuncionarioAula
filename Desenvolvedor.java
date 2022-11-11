package org.example;

public class Desenvolvedor extends Funcionario {
    @Override
    public void aumentoSalario() {
        setSalario(getSalario()*1.05);
    }
}
