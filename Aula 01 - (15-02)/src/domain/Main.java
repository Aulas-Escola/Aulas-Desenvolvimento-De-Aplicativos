package domain;

public class Main {

    public static void main(String[] args) {
        Aluno igor = new Aluno(); // Criação do objeto igor
        // Setando o atributo nome e matricula para o objeto igor
        igor.nome = "Igor Medeiros Ribeiro";
        igor.matricula = 150605;

        // Printando no console, usando a abreviação sout
        System.out.println("Nome do aluno: " + igor.nome + "\nNúmero de matrícula: " + igor.matricula);

        Professor tairine = new Professor();
        tairine.nome = "Tairine Favretto";
        tairine.aula = "Natureza";
        String aulaDaProfessora = tairine.aula; // Aqui botamos o valor do atributo tairine.aula, na variável aulaDaProfessora

        System.out.println("Professora: " + tairine.nome + "\nLeciona: " + aulaDaProfessora);
    }

}
