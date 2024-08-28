package Entidades;

import enums.Categoria;

import java.time.LocalDate;

public class AreaDeTeste {
    public static void main(String[] args) {
        Despesas despesas = new Despesas(15.50, LocalDate.now(),"Compra de Queijo", Categoria.ALIMENTACAO);

        System.out.println(despesas);
    }
}