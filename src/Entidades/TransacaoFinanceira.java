package Entidades;

import enums.Categoria;

import java.time.LocalDate;

public abstract class TransacaoFinanceira {
    private double valor;
    private LocalDate data;
    private String descricao;
    private Categoria categoria;

    public TransacaoFinanceira(double valor, LocalDate data, String descricao, Categoria categoria) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
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

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "TransacaoFinanceira{" +
                "valor: " + valor +
                ", data: " + data +
                ", descricao: " + descricao  +
                ", categorias: " + categoria +
                '}';
    }
}
