package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Diretor();
        Funcionario funcionario2 = new Estagiario();
        Funcionario funcionario3 = new Desenvolvedor();

        funcionario1.setNome("Anderson");
        funcionario1.setSalario(5000);

        funcionario2.setNome("Ze");
        funcionario2.setSalario(1500);

        funcionario3.setNome("Joao");
        funcionario3.setSalario(14000);

        ArrayList<Funcionario> Listafuncionarios = new ArrayList<>();
        Listafuncionarios.add(funcionario1);Listafuncionarios.add(funcionario2);Listafuncionarios.add(funcionario3);

        for(Funcionario x : Listafuncionarios){
            System.out.println(x);
            x.aumentoSalario();
            System.out.println(x);
        }

    }
}