package Models;

public class Livro extends ItemBiblioteca implements Emprestavel {
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.disponivel = true;
    }

    @Override
    public void emprestar() {
        if (estaDisponivel()) {
            this.disponivel = false;
            System.out.println("O livro '" + getTitulo() + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + getTitulo() + "' não está disponível para empréstimo.");
        }
    }

    @Override
    public void devolver() {
        this.disponivel = true;
        System.out.println("O livro '" + getTitulo() + "' foi devolvido.");
    }

    @Override
    public boolean estaDisponivel() {
        return disponivel;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + getTitulo() + ", Autor: " + getAutor() + ", Ano: " + getAnoPublicacao() + ", Status: " + (disponivel ? "Disponível" : "Emprestado"));
    }
}
