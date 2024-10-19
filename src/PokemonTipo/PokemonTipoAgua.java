package PokemonTipo;

public class PokemonTipoAgua extends PokemonTipo{
    public PokemonTipoAgua () {
        this.setTipo("Água");

        this.addVantagens("Fogo");
        this.addVantagens("Terrestre");
        this.addVantagens("Pedra");

        this.addFraquezas("Elétrico");
        this.addFraquezas("Planta");

        this.addImunidades("Nenhuma");
    }
}
