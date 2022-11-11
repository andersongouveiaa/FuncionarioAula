package org.example;

public abstract class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: "+ getNome()+" Salario: "+getSalario();
    }

    public abstract void aumentoSalario();
}

