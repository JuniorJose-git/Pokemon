import PokemonTipo.PokemonTipoFogo;
import PokemonTipo.PokemonTipoPlanta;
import PokemonTipo.PokemonTipoVenenoso;

public class Main {

    public static void main(String[] args) {
        Pokemon bulbasaur = new Pokemon(
                "Bulbasaur",
                new PokemonTipoPlanta(),
                new PokemonTipoVenenoso(),
                140,
                10,
                12,
                49,
                65,
                45
        );

        bulbasaur.PrintPokemon();


        Pokemon charmander = new Pokemon(
                "Charmander",
                new PokemonTipoFogo(),
                140,
                15,
                20,
                43,
                50,
                65
        );

        charmander.PrintPokemon();

        charmander.atacar(bulbasaur);

        bulbasaur.atacar(charmander);

    }
}
