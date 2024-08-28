package Entidades;

import enums.Categoria;

import java.time.LocalDate;

public class Despesas extends TransacaoFinanceira {

    public Despesas(double valor, LocalDate data, String descricao, Categoria categoria) {
        super(valor, data, descricao, categoria);
    }
}