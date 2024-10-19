package PokemonTipo;

import java.util.ArrayList;
import java.util.List;


public abstract class PokemonTipo {

    private List<String> vantagens = new ArrayList<>();
    private List<String> fraquezas = new ArrayList<>();
    private List<String> imunidades = new ArrayList<>();;

    private String tipo;

    public PokemonTipo () {}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List getVantagens() {
        return this.vantagens;
    }

    public String getVantagem (int index) {
        return this.vantagens.get(index);
    }

    public void addVantagens(String tipo) {
        this.vantagens.add(tipo);
    }

    public List getFraquezas() {
        return this.fraquezas;
    }

    public String getFraqueza (int index) {
        return this.fraquezas.get(index);
    }

    public void addFraquezas (String tipo) {
        this.fraquezas.add(tipo);
    }

    public List getImunidades () {
        return this.imunidades;
    }

    public String getImunidade(int index) {
        return this.imunidades.get(index);
    }

    public void addImunidades (String tipo) {
        this.imunidades.add(tipo);
    }
}
