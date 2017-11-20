package jogo;

import java.util.ArrayList;
import java.util.Collections;


public class Baralho<T> extends ArrayList<Carta>  {


    public Baralho() {
        super();
    }

    public void criaBaralho() {

 
        Carta c1 = new Carta("Maradona", "A1");
        c1.setValor(Atributo.ATAQUE, 94);
        c1.setValor(Atributo.DEFESA, 42);
        c1.setValor(Atributo.RESISTENCIA, 74);
        c1.setValor(Atributo.VELOCIDADE, 82);
        
        this.add(c1);
        
        Carta c2 = new Carta("Messi", "A2");
        c2.setValor(Atributo.ATAQUE, 95);
        c2.setValor(Atributo.DEFESA, 43);
        c2.setValor(Atributo.RESISTENCIA, 76);
        c2.setValor(Atributo.VELOCIDADE, 86);
        
        this.add(c2);
        
        
        Carta c3 = new Carta("CR7", "B1");
        c3.setValor(Atributo.ATAQUE, 94);
        c3.setValor(Atributo.DEFESA, 49);
        c3.setValor(Atributo.RESISTENCIA, 89);
        c3.setValor(Atributo.VELOCIDADE, 89);
        
        this.add(c3);
        
        
        Carta c4 = new Carta("Soares", "B2");
        c4.setValor(Atributo.ATAQUE, 95);
        c4.setValor(Atributo.DEFESA, 58);
        c4.setValor(Atributo.RESISTENCIA, 85);
        c4.setValor(Atributo.VELOCIDADE, 78);
        
        this.add(c4);

    }

    public void embaralha() {

        
        Collections.shuffle(this);
        this.get(0).setTrunfo();
        Collections.shuffle(this);
    }

}
