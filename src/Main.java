import Models.DVD;
import Models.GerenciadorColecao;
import Models.Livro;

public class Main {
    public static void main(String[] args) {
        GerenciadorColecao<Livro> gerenciadorLivros = new GerenciadorColecao<>();
        GerenciadorColecao<DVD> gerenciadorDVD = new GerenciadorColecao<>();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);

        gerenciadorLivros.adicionarItem(livro1);
        gerenciadorLivros.adicionarItem(livro2);

        // DVD
        DVD dvd1 = new DVD("STAR WARS", "NEYMAR JR", 1947,130);
        DVD dvd2 = new DVD("STAR WARS 2", "NEYMAR JR", 1973,130);
        gerenciadorDVD.adicionarItem(dvd1);
        gerenciadorDVD.adicionarItem(dvd2);

        System.out.println("\n--- Lista inicial de livros ---");
        gerenciadorLivros.listarTodos();

        System.out.println("\n--- Realizando empréstimo e devolução ---");
        livro1.emprestar();
        livro1.devolver();
        livro2.emprestar();

        System.out.println("\n--- Lista inicial de DVD ---");
        gerenciadorDVD.listarTodos();

        System.out.println("\n--- Realizando empréstimo e devolução ---");
        dvd1.emprestar();
        dvd1.devolver();
        dvd2.emprestar();

        System.out.println("\n--- Lista após empréstimos ---");
        gerenciadorLivros.listarTodos();
        gerenciadorDVD.listarTodos();
    }
}