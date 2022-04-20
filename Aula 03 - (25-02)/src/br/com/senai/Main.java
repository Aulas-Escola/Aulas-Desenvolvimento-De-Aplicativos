package br.com.senai;

import br.com.senai.model.Funcionarios;
import br.com.senai.model.PessoaMaisVelha;
import br.com.senai.model.Retangulo;

public class Main {

    public static void main(String[] args) {

        /* Quem é mais velho*/
        System.out.println("Dados da primeira pessoa: ");

        PessoaMaisVelha pessoa1 = new PessoaMaisVelha("Maria", 19);
        pessoa1.imprimir();

        System.out.println("\nDados da segunda pessoa: ");

        PessoaMaisVelha pessoa2 = new PessoaMaisVelha("João", 19);
        pessoa2.imprimir();

        pessoa1.maisVelho(pessoa1, pessoa2);


        /*Salário Médio*/
        System.out.println("\nDados do primeiro funcionário: ");

        Funcionarios funcionario1 = new Funcionarios("Carlos Silva", 6300 );
        funcionario1.imprimir();

        System.out.println("\nDados do segundo funcionário: ");

        Funcionarios funcionario2 = new Funcionarios("Ana Marques", 6700 );
        funcionario2.imprimir();

        funcionario1.salarioMedio(funcionario1, funcionario2);
        funcionario1.imprimirSalarioMedio();

        /* Cálculos retângulo  */

        System.out.println("\nEntre a largura e altura do retângulo: ");
        Retangulo calculosRetangulo = new Retangulo(3, 4);
        calculosRetangulo.calculos(calculosRetangulo);
        calculosRetangulo.imprimir();

    }

}
