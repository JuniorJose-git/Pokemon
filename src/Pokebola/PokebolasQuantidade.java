package Pokebola;

public class PokebolasQuantidade {
    private int quantidade;
    private Pokebola pokebola;


    public PokebolasQuantidade (int quantidade, Pokebola tipo_pokebola) {
        this.quantidade = quantidade;
        this.pokebola = tipo_pokebola;
    }


    public void printQuantidadePokebola () {
        System.out.print("tipo: " + this.pokebola.getTipo());
        System.out.println(". quantidade: " + this.quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Pokebola getPokebola() {
        return pokebola;
    }

/*    public void setPokebola(Pokebola pokebola) {
        this.pokebola = pokebola;
    }*/
}
