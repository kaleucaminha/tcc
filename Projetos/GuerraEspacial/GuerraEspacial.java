import aljava.*;
import aljava.jogo.Retangulo;
import java.util.ArrayList;

public class GuerraEspacial {

    Nave jogador;
    ArrayList<Asteroide> asteroides;
    
    ArrayList<Tiro> tiros;
    
    GuerraEspacial(){
        jogador = new Nave();
        
        asteroides = new ArrayList<Asteroide>();
        asteroides.add( new Asteroide() );
        asteroides.add( new Asteroide() );
        asteroides.add( new Asteroide() );
        
        tiros = new ArrayList<Tiro>();
    }
    
    void loop() {
        while(true){
            Alj.tela.limpa();
            
            jogador.movimenta();
            processaAsteroides();
            processaTiros();
            lancaTiros();
            removeObjetosNaoUtilizados();
            
            if(asteroides.size() == 0){
                Alj.tela.exibeMensagem("Parabéns, voce venceu");
                Alj.tela.finaliza();
            }
            
            desenha();
            Alj.tela.exibe();
            Alj.util.espera(50);
        }
    }
    
    void processaAsteroides(){
        for(Asteroide a : asteroides) {
            a.movimenta();
                
            if( a.toca(jogador) ){
               Alj.tela.exibeMensagem("Você perdeu");
               Alj.tela.finaliza();
            }
        }
    }
    
    void processaTiros(){
        for(Tiro t : tiros) {
           t.movimenta();
               
           for(Asteroide a : asteroides){
               if(t.toca(a)){
                   a.foiAtingido();
               }
           }
        }
    }
    
    void lancaTiros(){
        //Passo 1
        if( Alj.tecla.press("espaco") ){ 
            //Passo 2
            int xTiro = jogador.pegaXTiro();
            int yTiro = jogador.pegaY();
            //Passo 3
            Tiro umTiro = new Tiro(xTiro, yTiro);
            //Passo 4
            tiros.add( umTiro );
        } 
    }
    
    void desenha() {
        Alj.cor.nome("preto");
        Alj.desenha.retangulo(0, 0, 400, 400);
        jogador.desenha();
        
        for( int i = 0; i < asteroides.size(); i++) {
            Asteroide a = asteroides.get( i ); 
            a.desenha();
        }
        
        for(Tiro t : tiros) {
               t.desenha();
            }
    }
    
    void removeObjetosNaoUtilizados(){
        int max = asteroides.size() - 1;
        for(int i = max; i >= 0; i--){
            Asteroide a = asteroides.get(i);
            if(a.estaDestruido()){
                asteroides.remove(a);
            }
        }
        
        int maxTiros = tiros.size() - 1;
        for(int i = maxTiros; i >= 0; i--){
            Tiro t = tiros.get(i);
            if(t.estaForaDaTela()){
                tiros.remove(t);
            }
        }
    }
}