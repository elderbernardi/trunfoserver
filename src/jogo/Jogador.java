package jogo;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

	private String nome;

	private Integer pontuacao;

	private List<Carta> cartas;
        

    public Jogador(String nome, Integer pontos) {
        this.nome = nome;
        this.pontuacao = pontos;
        this.cartas = new ArrayList<>();
        
    }
    
    public Carta getMao()
    {
        return cartas.get(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }
        
        
    void addCarta(Carta carta) {
       
        cartas.add(carta);
    }

}
