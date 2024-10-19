package PokemonTipo;

public class PokemonTIpoGelo extends PokemonTipo{

    public PokemonTIpoGelo () {

        this.setTipo("Gelo");

        this.addVantagens("Dragão");
        this.addVantagens("Voador");
        this.addVantagens("Planta");
        this.addVantagens("Terrestre");

        this.addFraquezas("Lutador");
        this.addFraquezas("Fogo");
        this.addFraquezas("Pedra");
        this.addFraquezas("Aço");

        this.addImunidades("Nenhuma");

    }
}
