import aljava.*;
import aljava.jogo.Retangulo;
class Tiro extends Retangulo
{
    
    int velocidade;
    
    Tiro(int _x, int _y){
        x = _x;
        y = _y;
        largura = 2;
        altura = 4;
        
        velocidade = 10;
    }
    
    void movimenta(){        
        y -= velocidade;     
    }
    
    boolean estaForaDaTela(){
        if(y < 0 || y > 400){
            return true;
        }
        
        if(x < 0 || x > 400){
            return true;
        }
        
        return false;
    }
    
    public void desenha() {
        Alj.cor.rgb(255, 255, 255);
        Alj.desenha.oval(x-1, y-2, largura, altura);
    }

}
