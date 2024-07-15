package set.pesquisa;

import java.util.Objects;

public class Contato {
    // Atritubos

    private String nome;

    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public Contato() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Contato nome(String nome) {
        setNome(nome);
        return this;
    }

    public Contato numero(int numero) {
        setNumero(numero);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contato contato)) {
            return false;
        }
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "{" + nome + "," + numero + "}";
    }
}
