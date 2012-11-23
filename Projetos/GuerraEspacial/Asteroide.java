import aljava.*;
import aljava.jogo.Retangulo;
class Asteroide extends Retangulo
{
    int velocidade;
    
    Asteroide(){
        x = Alj.util.sorteia(0, 360);
        y = Alj.util.sorteia(-400, -50);
        largura = Alj.util.sorteia(30, 50);
        altura = Alj.util.sorteia(30, 50);
        
        velocidade = Alj.util.sorteia(2, 8);
    }
    
    void movimenta(){        
        y += velocidade;     
        
        if(y > 400){
            x = Alj.util.sorteia(0, 360);
            y = Alj.util.sorteia(-400, -50);
        }
    }
    
    void foiAtingido(){
        largura -= 1;
        altura -= 1;
    }
    
    boolean estaDestruido(){
        return (largura < 20);
    }
    
    public void desenha() {
        if(largura >= 20){
            Alj.cor.rgb(120, 120, 120);
            Alj.desenha.oval(x, y, largura, altura);
        } else {
            Alj.cor.rgb(255, 0, 0);
            Alj.desenha.oval(x, y, largura, altura);
        }
    }
}
