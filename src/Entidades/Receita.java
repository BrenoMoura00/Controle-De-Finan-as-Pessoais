package Entidades;

import enums.Categoria;

import java.time.LocalDate;

public class Receita extends TransacaoFinanceira {

    public Receita(int id, double valor, LocalDate data, String descricao, Categoria categoria) {
        super(id, valor, data, descricao, categoria);
    }
}
