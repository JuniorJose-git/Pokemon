package PokemonTipo;

public class PokemonTipoVoador extends PokemonTipo{
    public PokemonTipoVoador () {

        this.setTipo("Voador");

        this.addVantagens("Inseto");
        this.addVantagens("Lutador");
        this.addVantagens("Planta");

        this.addFraquezas("Elétrico");
        this.addFraquezas("Gelo");
        this.addFraquezas("Pedra");

        this.addImunidades("Terrestre");
    }

}
