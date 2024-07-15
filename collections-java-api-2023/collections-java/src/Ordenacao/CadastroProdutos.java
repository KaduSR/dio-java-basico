package Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class CadastroProdutos {

    //atributo

    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quant){
        produtoSet.add(new Produto(cod, nome, preco, quant));


    }

    public void exibirProdutos() {
        System.out.println(produtoSet);
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new HashSet<>();
        for (Produto p : produtoSet) {
            if (p.getNome().startsWith()) {
                produtosPorNome.add(p);

    }
}

}
