import java.util.Scanner;

public class Show {

    private int id;
    private String data;
    private String local;
    private String cantor;
    private double preco;

    public Show(){
        Scanner scNum = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite o Id do seu show: ");
        int idShow = scNum.nextInt();
        this.id = idShow;

        System.out.print("Digite a data do seu show: ");
        String dataShow = scStr.nextLine();
        this.data = dataShow;

        System.out.print("Digite o local do seu show: ");
        String localDoShow = scStr.nextLine();
        this.local = localDoShow;

        System.out.print("Digite o cantor principal do seu show: ");
        String cantorPrincipal= scStr.nextLine();
        this.cantor = cantorPrincipal;

        System.out.print("Digite o preço do ingresso: ");
        double precoShow = scNum.nextDouble();
        this.preco = precoShow;

    }

    public void imprimir(){
        System.out.println("\n\nID do show: "+ id +
                "\nCantor da noite: " + cantor +
                "\nLocal: " + local +
                "\nData: " + data +
                "\nPreço: " + preco);
    }

}
