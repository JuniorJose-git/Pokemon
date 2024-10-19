package PokemonTipo;

public class PokemonTipoPlanta extends PokemonTipo {

    public PokemonTipoPlanta () {

        this.setTipo("Planta");

        this.addVantagens("Terrestre");
        this.addVantagens("Pedra");
        this.addVantagens("Água");

        this.addFraquezas("Inseto");
        this.addFraquezas("Fogo");
        this.addFraquezas("Voador");
        this.addFraquezas("Gelo");
        this.addFraquezas("Venenoso");

        this.addImunidades("Nenhuma");
    }
}
