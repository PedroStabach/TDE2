package Models;

public class DVD extends  ItemBiblioteca implements Emprestavel{
    private boolean disponivel;
    private int duracaoMin;
    public DVD(String titulo, String autor, int anoPublicacao, int duracaoMin) {
        super(titulo, autor, anoPublicacao);
        this.disponivel = true;
        this.duracaoMin = duracaoMin;
    }


    public void exibirDetalhes () {
        System.out.println("Título: " + getTitulo() +
                ", Autor: " + getAutor() +
                ", Ano: " + getAnoPublicacao() +
                ", Duração: " + getDuracao() + " min" +
                ", Status: " + (disponivel ? "Disponível" : "Emprestado"));
    }

    @Override
    public void emprestar() {
        if(estaDisponivel()) {
            this.disponivel = false;
            System.out.println("O livro '" + getTitulo() + "' foi emprestado.");
        } else {
            System.out.println("nao foi possivel emprestar o livro: "  + getTitulo());
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

    public int getDuracao() {
        return duracaoMin;
    }
}
