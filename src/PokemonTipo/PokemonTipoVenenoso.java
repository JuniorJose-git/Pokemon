package PokemonTipo;

public class PokemonTipoVenenoso extends PokemonTipo {
    public PokemonTipoVenenoso () {
        this.setTipo("Venenoso");

        this.addVantagens("Fada");
        this.addVantagens("Planta");

        this.addFraquezas("Terrestre");
        this.addFraquezas("Psíquico");

        this.addImunidades("Nenhuma");

    }
}
