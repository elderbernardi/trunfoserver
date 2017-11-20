package jogo;

import java.util.HashMap;
import java.util.Map;

public class Carta {

	private Map<Atributo, Integer> atributos;
        
        private String nome;
        private Boolean trunfo;
        private String classe;

    public Carta(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        atributos = new HashMap<>();
        trunfo = false;
    }
        

    public Integer getValor(Atributo atributo) {
        return atributos.get(atributo);
    }
    
    public void setValor( Atributo a, Integer v )
    {
        atributos.put(a, v);
    }
    
    public void setTrunfo()
    {
        trunfo = true;
    }

}
