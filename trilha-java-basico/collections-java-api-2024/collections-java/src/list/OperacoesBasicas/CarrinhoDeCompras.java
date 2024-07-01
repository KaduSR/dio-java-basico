package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensRemoverList = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensRemoverList.add(i);
                }
            }
            itemList.removeAll(itensRemoverList);
        } else {
            System.out.println("Não há itens no carrinho");
        }
    }

    public double calcularPrecoTotal() {
        double precoTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double precoItem = item.getPreco() * item.getQuantidade();
                precoTotal += precoItem;
            }
            return precoTotal;
        } else {
            throw new RuntimeException("Não há itens no carrinho");

        }
    }

    public void listarItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("Não há itens no carrinho");
        }
    }

 

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Camiseta", 2, 50);
        carrinho.adicionarItem("Calça", 1, 80);
        carrinho.adicionarItem("Camiseta", 1, 50);

        carrinho.listarItens();

        carrinho.removerItem("Camiseta");

        carrinho.listarItens();

        System.out.println("Valor total da compra é = " + carrinho.calcularPrecoTotal());
    }
}
