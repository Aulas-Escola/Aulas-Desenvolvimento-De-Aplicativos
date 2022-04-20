package br.com.senai.model;

public class Funcionarios {

    private String nome;
    private double salario;
    private double mediaSalario;

    public Funcionarios(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double salarioMedio(Funcionarios funcionario1, Funcionarios funcionario2){
        mediaSalario = (funcionario1.salario + funcionario2.salario) / 2;
        return mediaSalario;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome +
        "\nSalário: " + salario);
    }

    public void imprimirSalarioMedio(){
        System.out.println("\nSalário médio: " + mediaSalario);
    }
}
