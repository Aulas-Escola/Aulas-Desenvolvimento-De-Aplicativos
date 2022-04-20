package br.com.senai.model;

public class PessoaMaisVelha {

    private String nome;
    private int idade;

    public PessoaMaisVelha(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void maisVelho(PessoaMaisVelha pessoa1, PessoaMaisVelha pessoa2){
        if (pessoa1.idade > pessoa2.idade){
            System.out.println(pessoa1.nome + " é a mais velho(a)!!");
        }
        else if (pessoa1.idade == pessoa2.idade){
            System.out.println("As duas pessoas tem " + pessoa1.idade + " anos!!");
        }
        else{
            System.out.println(pessoa2.nome + " é a mais velho(a)!!");
        }
    }

    public void imprimir(){
        System.out.println("Nome: " + nome +
        "\nIdade: " + idade);
    }


}
