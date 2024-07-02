package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }

            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquiarIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAno.add(l);
                }
            }

        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("O Senhor dos Anéis", "J.R", 2005);
        catalogoLivro.adicionarLivro("O Senhor dos Anéis", "J.R", 2008);
        catalogoLivro.adicionarLivro("O Livro do Rei", "Carlos", 2024);
        catalogoLivro.adicionarLivro("O Senhor dos Anéis As duas torres", "J.R", 2006);
        catalogoLivro.adicionarLivro("O Senhor dos Anéis O Retorno do Rei", "J.R", 2007);

        System.out.println(catalogoLivro.pesquisarPorAutor("J.R"));
        System.out.println(catalogoLivro.pesquiarIntervaloAnos(2005, 2006));
        System.out.println(catalogoLivro.pesquisarPorTitulo("O Senhor dos Anéis"));
    }

}
