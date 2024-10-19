import Pokebola.*;
import Pokemon.*;
import PokemonTipo.*;
import Treinador.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static boolean continuar() {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("deseja continuar ? 1 sim 0 nao");
            input = scanner.nextInt();
        } while (input < 0 || input > 1);

        if (input == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Pokemon bulbasaur = new Pokemon(
                "Bulbasauro",
                new PokemonTipoPlanta(),
                new PokemonTipoVenenoso(),
                140,
                10,
                12,
                49,
                65,
                45
        );


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


        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Digite o seu nome treinador");
        Treinador user = new Treinador(scanner.next());
        System.out.println("você comecara já com algumas pokebolas");
        user.printPokebolas();


        if (continuar()) {
            return;
        }

        System.out.println("Você esta andando e derrepente encontra um " + charmander.getName() + " selvagem");

        do {
            System.out.println("1 tentar capturar");
            System.out.println("0 sair");
            input = scanner.nextInt();
        } while (input < 0 || input > 1);

        if (input == 0) {
            return;
        }

        do {
            do {
                System.out.println("escolha uma pokebola");
                user.printPokebolasNumerado();
                input = scanner.nextInt();
            } while (input < 0 || input > 2);

        } while (!user.jogarPokebola(input, charmander));

        do {
            System.out.println("1 ver stats do pokemon capturado");
            System.out.println("2 continuar");
            System.out.println("0 sair");
            input = scanner.nextInt();
        } while (input < 0 || input > 2);
        if (input == 0) {
            return;
        }

        if (input == 1) {
            user.getPokemons().getFirst().PrintPokemon();
            if (continuar()) {
                return;
            }
        }

        System.out.println("voce continua andando pela estrada a fora até que encontra um " + bulbasaur.getName() + " selvagem");

        do {
            System.out.println("1 atacar");
            System.out.println("0 sair");
            input = scanner.nextInt();
        } while (input < 0 || input > 1);
        if (input == 0) {
            return;
        }

        System.out.println("voce joga a pokebola que contem seu " + user.getPokemons().getFirst().getName());


        if( bulbasaur.atacar(user.getPokemons().getFirst())) {
            return;
        };

        do {
            do {
                System.out.println("1 atacar");
                System.out.println("0 sair");
                input = scanner.nextInt();
            } while (input < 0 || input > 1);
            if (input == 0) {
                return;
            }

            if (user.getPokemons().getFirst().atacar(bulbasaur)) {
                return;
            }

            do {
                System.out.println("1 atacar");
                System.out.println("0 sair");
                input = scanner.nextInt();
            } while (input < 0 || input > 1);
            if (input == 0) {
                return;
            }
            if( bulbasaur.atacar(user.getPokemons().getFirst())) {
                return;
            }

        } while (true);


    }
}
