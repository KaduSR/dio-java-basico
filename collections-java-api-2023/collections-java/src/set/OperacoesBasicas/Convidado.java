package set.OperacoesBasicas;
import java.util.Objects;



public class Convidado {

    //atributos
    private String nome;
    private int codigoConvite;



    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }


  public String getNome() {
    return nome;
    }

    public int getCodigoConvite(){
        return codigoConvite;
    }


    public Convidado() {
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    public Convidado nome(String nome) {
        setNome(nome);
        return this;
    }

    public Convidado codigoConvite(int codigoConvite) {
        setCodigoConvite(codigoConvite);
        return this;
    }

   @Override
   public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
   }

   @Override
   public int hashCode() {
    return Objects.hash(getCodigoConvite());
   }

    @Override
    public String toString() {
        return "Convidado{" +
            " nome='" + getNome() + "'" +
            ", codigoConvite='" + getCodigoConvite() + "'" +
            "}";
    }

}
