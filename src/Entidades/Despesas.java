package Entidades;

import java.time.LocalDate;

public class Despesas {
    private double valor;
    private LocalDate data;
    private String descricao;
    private Categoria categoria;

    public Despesas(double valor, LocalDate data, String descricao, Categoria categoria) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor da despesa não pode ser negativo");
        }
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
        return "Despesas: [" +
                "valor: " + valor +
                ", data: " + data +
                ", descricao: '" + descricao + '\'' +
                ", categoria: " + categoria +
                ']';
    }
}
