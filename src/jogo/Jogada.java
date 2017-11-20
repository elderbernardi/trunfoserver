package jogo;

public class Jogada {

	private Carta carta1;

	private Carta carta2;

    Jogada(Jogador jogador1, Jogador jogador2) {
        carta1 = jogador1.getMao();
        carta2 = jogador2.getMao();
    
    }

	public Resultado comparaJogada(Atributo atributo) {
            Integer valor1 = carta1.getValor( atributo );
            Integer valor2 = carta2.getValor( atributo );
            
            if(  valor1 > valor2  )
                return Resultado.VITORIA;
            else if( valor1 < valor2 ){
                return Resultado.DERROTA;
            }else
                return Resultado.EMPATE;
            
	}

}
