package PokemonTipo;

public class PokemonTipoFogo extends PokemonTipo{
    public PokemonTipoFogo () {

        this.setTipo("Fogo");

        this.addVantagens("Inseto");
        this.addVantagens("Planta");
        this.addVantagens("Gelo");
        this.addVantagens("Aço");

        this.addFraquezas("Pedra");
        this.addFraquezas("Terrestre");
        this.addFraquezas("Água");

        this.addImunidades("Nenhuma");
    }
}
