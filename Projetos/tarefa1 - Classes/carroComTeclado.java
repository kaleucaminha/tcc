/**
* @author Gabriel Schimitz e Fernando Martendal Pavanello.
*/
public class carroComTeclado{

    int x;
    int y;
    int aumentavelocidade;
    int xtiro;
    Aljava objetoAljava;

     carroComTeclado(){
     x = 20;
     y = 20;
     aumentavelocidade = 100;
        
     objetoAljava = new Aljava();
    }

    void desenha(){
        objetoAljava.cor("vermelho");
        
        objetoAljava.desenhaRetangulo( x, y, 50, 20);
        
        objetoAljava.cor("preto");
        objetoAljava.desenhaCirculo( x+30, y-10, 15, 15);
        objetoAljava.desenhaCirculo( x+30, y+15, 15, 15);
        objetoAljava.desenhaCirculo( x+5, y-10, 15, 15);
        objetoAljava.desenhaCirculo( x+5, y+15, 15, 15);
        
        objetoAljava.mostraTela();
    }
    
    void move(){
        int contador = 0;
    while(true){    
        if( objetoAljava.teclaEstaPressionada("d") ){                
        objetoAljava.limpaTela();
        
        x = x + 1;
        desenha();
        objetoAljava.rotaciona(0, 0, 0);
        
        objetoAljava.espera(aumentavelocidade);
        }
        if( objetoAljava.teclaEstaPressionada("a") ){                
        objetoAljava.limpaTela();
        
        x = x - 1;
        desenha();
        objetoAljava.rotaciona(0, 0, 0);
        
        objetoAljava.espera(aumentavelocidade);
        }
         if( objetoAljava.teclaEstaPressionada("w") ){                
        objetoAljava.limpaTela();
        
        objetoAljava.rotaciona(90, x+25, y+10);
        y = y - 1;
        desenha();
        objetoAljava.rotaciona(0, 0, 0);
        
        objetoAljava.espera(aumentavelocidade);
        }
         if( objetoAljava.teclaEstaPressionada("s") ){                
        objetoAljava.limpaTela();
        
        objetoAljava.rotaciona(90, x+25, y+10);
        y = y + 1;
        desenha();
        objetoAljava.rotaciona(0, 0, 0);
        
        objetoAljava.espera(aumentavelocidade);
        }
        if( objetoAljava.teclaEstaPressionada("cima") ){
        aumentavelocidade = aumentavelocidade - 25;
        }
         if( objetoAljava.teclaEstaPressionada("baixo") ){
        aumentavelocidade = aumentavelocidade + 25;
        }
    }
}
}