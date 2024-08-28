package Entidades;

public class Categoria {
    private String nome;
    private String descricao;
    private String tipo;

    public Categoria(String nome, String descricao, String tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Categoria[" +
                "nome: '" + nome + '\'' +
                ", descricao: '" + descricao + '\'' +
                ", tipo: '" + tipo + '\'' +
                ']';
    }
}
