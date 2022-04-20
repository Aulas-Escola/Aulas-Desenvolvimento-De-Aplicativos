package br.com.senai.model;

public class Retangulo {

    private double largura;
    private double altura;

    private double areaRetangulo;
    private double perimetroRetangulo;
    private double diagonalRetangulo;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public void calculos(Retangulo retangulo){
        areaRetangulo =  retangulo.altura * retangulo.largura;
        perimetroRetangulo = retangulo.altura * 2 + retangulo.largura * 2;
        diagonalRetangulo  = Math.sqrt(retangulo.largura * retangulo.largura + retangulo.altura * retangulo.altura);
    }

    public void imprimir(){
        System.out.println("Altura: "+ altura +
        "\nLargura: " + largura +
        "\nÁrea do retângulo: " + areaRetangulo +
        "\nPerímetro do retângulo: " + perimetroRetangulo +
        "\nDiagonal do retângulo: " + diagonalRetangulo);
    }

}
