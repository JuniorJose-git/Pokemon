package PokemonTipo;

public class PokemonTipoEletrico extends PokemonTipo {
    public PokemonTipoEletrico () {

        this.setTipo("Elétrico");

        this.addVantagens("Água");
        this.addVantagens("Voador");

        this.addFraquezas("Terrestre");

        this.addImunidades("Nenhuma");
    }
}
