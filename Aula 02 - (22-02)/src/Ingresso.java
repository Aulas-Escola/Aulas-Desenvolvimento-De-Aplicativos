public class Ingresso {

    private int id;
    private int lote;
    private double valor;
    private String dataAbertura;


    public Ingresso(int id, int lote, double valor, String dataAbertura){
        this.id = id;
        this.lote = lote;
        this.valor = valor;
        this.dataAbertura = dataAbertura;
    }
    public void imprimir(){
        System.out.println("\n\nID: " + id +
                "\nLote: " + lote + "\nValor: " + valor +
                "\nData de Abertura: " + dataAbertura);
    }
}
