import aljava.*;
import aljava.jogo.*;

class Nave extends Retangulo
{
    
    int velocidade;
    String nomeJogador;
    
    Nave(){
        x = 140;
        y = 320;
        largura = 40;
        altura = 60;
        
        velocidade = 5;
        nomeJogador = Alj.tela.solicitaTexto("Informe seu nome");
    }
    
    void movimenta(){
        if(Alj.tecla.press("esquerda")){
            x -= velocidade;    
        }
        
        if(Alj.tecla.press("direita")){
            x += velocidade;    
        }
        
        if(Alj.tecla.press("cima")){
            y -= velocidade;    
        }
        
        if(Alj.tecla.press("baixo")){
            y += velocidade;    
        }
    }
    
    public void desenha() {
        Alj.cor.nome("vermelho");
        Alj.desenha.texto(x, y+altura+10, nomeJogador, 12);
        Alj.desenha.triangulo(x, y, largura, altura);
        Alj.tela.exibe();
    }
    
    int pegaXTiro(){
        int xDoTiro = x + (largura/2);
        return xDoTiro;
    }
    
    void atira(){
        //Precisaremos de novos recursos para este método...
    }
}
