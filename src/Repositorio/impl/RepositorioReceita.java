package Repositorio.impl;

import Entidades.Receita;
import Repositorio.IRepositorio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioReceita implements IRepositorio<Receita> {
    private List<Receita> listaReceitas = new ArrayList<>();
    @Override
    public void salvar(Receita entidade) {
        listaReceitas.add(entidade);
    }

    @Override
    public void alterar(Receita entidade) {
        Receita existente = buscarPorId(entidade.getId());
        if (existente != null) {
            listaReceitas.remove(existente);
            listaReceitas.add(entidade);
        }
    }

    @Override
    public void deletar(int id) {
        listaReceitas.removeIf(entidade -> entidade.getId() == id);
    }

    @Override
    public List<Receita> listar() {
        return new ArrayList<>(listaReceitas);
    }

    @Override
    public Receita buscarPorId(int id) {
        for (Receita receita : listaReceitas) {
            if (receita.getId() == id) {
                return receita;
            }
        }
      throw new RuntimeException("Receita não encontrada");
    }
}
