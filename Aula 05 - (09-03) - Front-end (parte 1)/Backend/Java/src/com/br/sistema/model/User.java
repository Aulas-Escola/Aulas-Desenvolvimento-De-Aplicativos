package com.br.sistema.model;

public class User {

    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;
    private Pagamento pagamento;

    public User(String nome, String cpf, String endereco, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public void pagar(String formaDePagamento, double valor){
        pagamento = new Pagamento(formaDePagamento, valor);
    }

    public void imprimir(){
        System.out.println("\nNome: " + nome + "\nCPF: " + cpf +
                "\nEndereço: " + endereco +
                "\nEmail: " + email +
                "\nTelefone: " + telefone);
                if(pagamento != null) {
                    System.out.println(pagamento);
                }
    }
}
