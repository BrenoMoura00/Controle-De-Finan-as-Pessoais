package Entidades;

import enums.Categoria;

import java.time.LocalDate;

public class Receita extends TransacaoFinanceira {

    public Receita(double valor, LocalDate data, String descricao, Categoria categoria) {
        super(valor, data, descricao, categoria);
    }

}
