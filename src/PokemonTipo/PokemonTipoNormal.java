package PokemonTipo;

import java.util.List;
import java.util.ArrayList;

public class PokemonTipoNormal extends PokemonTipo{

    public PokemonTipoNormal () {

        this.setTipo("Normal");

        this.addVantagens("Nenhuma");
        this.addFraquezas("Lutador");
        this.addImunidades("Fantasma");
    }
}
