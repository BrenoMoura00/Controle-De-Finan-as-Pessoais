package Entidades;

import java.time.LocalDate;

public class Receita {
    private double valor;
    private LocalDate data;
    private String descricao;
    private Categoria categorias;

    public Receita(double valor, LocalDate data, String descricao, Categoria categorias) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categorias = categorias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Receita: [" +
                "valor: " + valor +
                ", data: " + data +
                ", descricao: '" + descricao + '\'' +
                ", categorias:" + categorias +
                ']';
    }
}
