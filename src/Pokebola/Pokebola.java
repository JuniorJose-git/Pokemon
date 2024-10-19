package Pokebola;

import Pokemon.Pokemon;

import java.util.Random;

public abstract class Pokebola {


     private String tipo;
     private Double taxa_captura;
     private Double preco;


     public void printPokebola (){
          System.out.println("tipo: " + this.tipo);
          System.out.println("taxa de captura: " + this.taxa_captura);
          System.out.println("preco: " + this.preco);
     }

     public String getTipo() {
          return tipo;
     }

     public void setTipo(String tipo) {
          this.tipo = tipo;
     }

     public Double getPreco() {
          return preco;
     }

     public void setPreco(Double preco) {
          this.preco = preco;
     }

     public void setPreco(int preco) {
          this.preco = preco + 0.0;
     }

     public Double getTaxa_captura() {
          return taxa_captura;
     }

     public void setTaxa_captura(Double taxa_captura) {
          this.taxa_captura = taxa_captura;
     }

     public void setTaxa_captura(int taxa_captura) {
          this.taxa_captura = taxa_captura + 0.0;
     }

     public boolean CapturarPokemon (Pokemon pokemon) {
          Random rand = new Random();

          Double sucesso = rand.nextInt(100) * taxa_captura;

          if (sucesso >= 55) {
               System.out.println(pokemon.getName() + " capturado");
               return true;
          }

          System.out.println(pokemon.getName() + " escapou");
          return false;
     }
}
