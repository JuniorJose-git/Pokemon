package Pokemon;

import PokemonTipo.PokemonTipo;
import java.util.Objects;

public class Pokemon {

    private String name;
    private PokemonTipo[] tipo;
    private int hp;
    private int ataque;
    private int ataque_especial;
    private int defesa;
    private int defesa_especial;
    private int velocidade;

    public Pokemon(String name, PokemonTipo tipo, int hp, int ataque, int ataque_especial, int defesa, int defesa_especial, int velocidade) {


        this.name = name;
        this.tipo = new PokemonTipo[1];
        this.tipo[0] = tipo;

        this.hp = hp;
        this.ataque = ataque;
        this.ataque_especial = ataque_especial;
        this.defesa = defesa;
        this.defesa_especial = defesa_especial;
        this.velocidade = velocidade;
    }

    public Pokemon(String name, PokemonTipo tipo,PokemonTipo tipo2, int hp, int ataque, int ataque_especial, int defesa, int defesa_especial, int velocidade) {


        this.name = name;
        this.tipo = new PokemonTipo[2];
        this.tipo[0] = tipo;
        this.tipo[1] = tipo2;
        this.hp = hp;
        this.ataque = ataque;
        this.ataque_especial = ataque_especial;
        this.defesa = defesa;
        this.defesa_especial = defesa_especial;
        this.velocidade = velocidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokemonTipo[] getTipo() {
        return tipo;
    }

    public void setTipo(PokemonTipo tipo, int idx) {
        this.tipo[idx] = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque_especial() {
        return ataque_especial;
    }

    public void setAtaque_especial(int ataque_especial) {
        this.ataque_especial = ataque_especial;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDefesa_especial() {
        return defesa_especial;
    }

    public void setDefesa_especial(int defesa_especial) {
        this.defesa_especial = defesa_especial;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void PrintPokemon() {

        System.out.println("-------------------------------------");
        System.out.println("Pokemon");
        System.out.println("Nome: "+  this.name);

        System.out.printf("Tipo: ");
        for (int i = 0; i < this.tipo.length; i++) {
            System.out.printf(this.tipo[i].getTipo() + " ");
        }
        System.out.println();

        System.out.println("HP: " + this.hp);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Ataque Especial: " + this.ataque_especial);
        System.out.println("Defesa: " + this.defesa);
        System.out.println("Defesa Especial: " + this.defesa_especial);
        System.out.println("Velocidade: " + this.velocidade);
    }

    public boolean atacar(Pokemon pokemon_inimigo) {

        int dano_ataque = ataque;
        System.out.println(this.getName() + " ataca!");

        for (int i = 0; i < this.tipo.length; i++) {
            for (int j = 0; j < this.tipo[i].getVantagens().size(); j++) {

                for (int k = 0; k < pokemon_inimigo.tipo.length; k++) {
                    for (int l = 0; l < pokemon_inimigo.tipo[k].getFraquezas().size(); l++) {

                        if (Objects.equals(this.tipo[i].getVantagem(j), pokemon_inimigo.tipo[k].getFraqueza(l))) {
                            System.out.println("vantagem de "+ this.name + " " + this.tipo[i].getVantagem(j) + " fraqueza de " + pokemon_inimigo.name);
                            //System.out.println("dano_ataque_atual: " + dano_ataque + " novo_dano_ataque (dano_ataque * 2) : " + dano_ataque * 2);
                            dano_ataque = dano_ataque * 2;
                        }
                    }
                }
            }
        }


        for (int i = 0; i < this.tipo.length; i++) {

            for (int k = 0; k < pokemon_inimigo.tipo.length; k++) {
                for (int l = 0; l < pokemon_inimigo.tipo[k].getVantagens().size(); l++) {

                    if (Objects.equals(this.tipo[i].getTipo(), pokemon_inimigo.tipo[k].getVantagem(l))) {
                        dano_ataque = dano_ataque / 2;
                    }

                }
            }
        }

        for (int i = 0; i < this.tipo.length; i++) {

            for (int k = 0; k < pokemon_inimigo.tipo.length; k++) {
                for (int l = 0; l < pokemon_inimigo.tipo[k].getImunidades().size(); l++) {

                    if (Objects.equals(this.tipo[i].getTipo(), pokemon_inimigo.tipo[k].getImunidade(l))) {
                        dano_ataque = 0;
                    }

                }
            }
        }





        if (pokemon_inimigo.getHp() - dano_ataque <= 0) {
            System.out.println("Dano causado " + dano_ataque + ". ");
            System.out.println(this.getName() + " venceu a luta");
            return true;
        }

        System.out.println("Dano causado " + dano_ataque + ". " + (pokemon_inimigo.getHp() - dano_ataque) +" de hp de " + pokemon_inimigo.getName() + " restante");

        pokemon_inimigo.setHp(pokemon_inimigo.getHp() - dano_ataque);
        return false;
    }
}
