package PokemonTipo;

public class PokemonTipoPedra extends PokemonTipo{

    public PokemonTipoPedra() {

        this.setTipo("Pedra");

        this.addVantagens("Inseto");
        this.addVantagens("Fogo");
        this.addVantagens("Voador");
        this.addVantagens("Gelo");

        this.addFraquezas("Lutador");
        this.addFraquezas("Planta");
        this.addFraquezas("Terrestre");
        this.addFraquezas("Aço");
        this.addFraquezas("Água");

        this.addImunidades("Nenhuma");
    }

}
