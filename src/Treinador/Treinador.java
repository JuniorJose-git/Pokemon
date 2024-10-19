package Treinador;

import Pokebola.*;
import Pokemon.*;

import java.util.ArrayList;
import java.util.List;

public class Treinador {

    private String nome;
    private List<Pokemon>  pokemons;
    private PokebolasQuantidade[] pokebolas;


    public Treinador(String nome, PokebolasQuantidade[] pokebolas, List<Pokemon> pokemons) {
        this.nome = nome;
        this.pokemons = pokemons;
        this.pokebolas = pokebolas;
    }

    public Treinador(String nome) {
        this.nome = nome;
        this.pokemons = new ArrayList<>();

        this.pokebolas = new PokebolasQuantidade[3];

        this.pokebolas[0] = new PokebolasQuantidade(10, new PokebolaComum());
        this.pokebolas[1] = new PokebolasQuantidade(5, new PokebolaGreatBall());
        this.pokebolas[2] = new PokebolasQuantidade(1, new PokebolaUltraBall());

        System.out.println(this);
    }


    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addPokemons(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public PokebolasQuantidade[] getPokebolas() {
        return pokebolas;
    }

    public void setPokebolas(PokebolasQuantidade[] pokebolas) {
        this.pokebolas = pokebolas;
    }

    public void printTreinador () {
        System.out.println("nome: " + this.nome);
        this.printPokebolas();

        System.out.println("lista de pokemons");
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println(pokemons.get(i).getName());
        }

        System.out.println("total pokemons " + pokemons.size());

    }

    public void printPokebolas () {
        System.out.println("Pokebolas: ");
        for (int i = 0; i < pokebolas.length; i++) {
            pokebolas[i].printQuantidadePokebola();
        }
    }

    public void printPokebolasNumerado () {
        System.out.println("Pokebolas: ");
        for (int i = 0; i < pokebolas.length; i++) {
            System.out.println(i + " " + pokebolas[i].getPokebola().getTipo() + " Qtd: " + pokebolas[i].getQuantidade());
            ;
        }
    }

    public boolean jogarPokebola(int tipo, Pokemon pokemon) {


        if (this.pokebolas[tipo].getQuantidade() == 0) {
            System.out.println("acabaram as pokebolas do tipo " + this.pokebolas[tipo].getPokebola().getTipo());
            return false;
        }

        System.out.println(this.nome + " jogou uma pokebola do tipo " + this.pokebolas[tipo].getPokebola().getTipo() + " para tentar capturar um " + pokemon.getName());

        if (this.pokebolas[tipo].getPokebola().CapturarPokemon(pokemon)) {
            this.pokemons.add(pokemon);
            return true;
        }

        this.pokebolas[tipo].setQuantidade(this.pokebolas[tipo].getQuantidade() - 1);
        return false;
    }
}
