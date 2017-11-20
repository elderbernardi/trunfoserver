package jogo;

public class Jogo {

    private Baralho<Carta> baralho;

    private Jogada jogada;

    private Jogador jogador1;

    private Jogador jogador2;

    private Jogador vezDeJogar;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        baralho = new Baralho<>();
        baralho.criaBaralho();
    }

    public void iniciaJogo() {
        baralho.embaralha();

        for (int i = 0; i < baralho.size(); i++) {
            if (i % 2 == 0) {
                jogador1.addCarta(baralho.get(i));
            } else {
                jogador2.addCarta(baralho.get(i));
            }
        }

        //vez de jogar é do jogador 1
        vezDeJogar = jogador1;

    }

    public Integer verificaFimDoJogo() {
        return 1;
    }

    public Resultado fazJogada(Atributo escolha) {

        jogada = new Jogada(jogador1, jogador2);
        Resultado res = jogada.comparaJogada(escolha);
        Resultado retorno= Resultado.DERROTA ;
        if( res == Resultado.VITORIA ){//vitoria do 1
            if(vezDeJogar == jogador1)
                retorno = Resultado.VITORIA;
            else
                retorno = Resultado.DERROTA;
            
            vezDeJogar = jogador1;
            //computa pontos para o 1 
            //tira carta do 2 vai para o 1
        }else if( res == Resultado.DERROTA )
        {
            if( vezDeJogar == jogador1 )
                retorno = Resultado.DERROTA;
            else
                retorno = Resultado.VITORIA;
            vezDeJogar = jogador2;
            //computa pontos para o 2 
            //tira carta do 1 vai para o 2
        }else
        {//empate
            //devolve cartas para os dois jogadores
            //vez de jogar é o mesmo
            retorno = Resultado.EMPATE;
        }
        
        

        return retorno;
    }

    public Jogo(Baralho baralho, Jogador jogador1, Jogador jogador2) {
        this.baralho = baralho;
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

}
