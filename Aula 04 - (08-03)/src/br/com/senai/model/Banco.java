package br.com.senai.model;

public class Banco {

    private int numero;
    private String nome;
    private double saldo = 0.0;

    public Banco(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }
    public Banco(int numero, String nome, double depositoInicial){
        this.numero = numero;
        this.nome = nome;
        this.saldo = depositoInicial;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Seu nome foi alterado com sucesso para: " + nome);
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String depositar(double num){
        saldo += num;
        return "Você depositou " + num + " R$, seu novo saldo é: " + saldo + " R$";
    }

    public String sacar(double num){
        saldo -= (num + 5);
        return "Você sacou " + num + " R$, e foi aplicada uma taxa de 5 R$, seu saldo atual é: " + saldo + " R$";
    }

    public void boasVindas(){
        System.out.println("\nParabéns " + nome + " Você acabou de criar sua conta!" +"\nNumero: " + numero +
                ", nome: " + nome +
                ", saldo: " + saldo);
    }

}
