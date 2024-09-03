package Entidades;

import Repositorio.impl.RepositorioReceita;
import Repositorio.impl.RepositorioSaidas;
import enums.Categoria;

import java.time.LocalDate;

public class AreaDeTeste {
    public static void main(String[] args) {
        Saidas saidas1 = new Saidas(1,350.50, LocalDate.now(),"Curso", Categoria.EDUCACAO);
        RepositorioSaidas repositorioSaidas = new RepositorioSaidas();
        repositorioSaidas.salvar(saidas1);
        Saidas saidas2 = new Saidas(2, 15.50, LocalDate.now(),"Pão", Categoria.ALIMENTACAO);
        repositorioSaidas.salvar(saidas2);

        System.out.println(repositorioSaidas.listar());
        System.out.println("--------------------------");

        Receita receita1 = new Receita(1,1500.00, LocalDate.now(), "Salário", Categoria.SALARIO);
        RepositorioReceita repositorioReceita = new RepositorioReceita();
        repositorioReceita.salvar(receita1);
        System.out.println(repositorioReceita.listar());
        repositorioSaidas.deletar(1);

        System.out.println(repositorioSaidas.listar());

    }
}