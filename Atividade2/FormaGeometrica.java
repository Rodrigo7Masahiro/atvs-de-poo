package org.example;

public abstract class FormaGeometrica {

    protected String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public void exibirInformacoes() {
        System.out.println("Forma: " + nome);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("----------------------------");
    }
}


