/**
* @author Sahmuel Thiesen
*/

public class Pokemon{
    int x;
    int y;
    int velocidade;
    String cor;
    int trans;
    Aljava objAljava;
    
        Pokemon(){
        x = 20;
        y = 20;
        velocidade = 5;
        trans = 30;
        objAljava = new Aljava(600,340);
    }
    
    void jogaPokebola(){
         int contador = 0;
        while(contador < 57 ){
          
            objAljava.rotaciona(contador*6, x+15, y+4);
            
            contador = contador + 1;
            objAljava.limpaTela();
            
            x = x + velocidade;
            y = y + velocidade;
            desenha();
            objAljava.espera(70);
        }
        objAljava.limpaTela();
    }
    
    void Pokemon(){
       
        
         objAljava.corRGB(72, 118, 255); 
        objAljava.desenhaCirculo(350, 275, 65, 70);
 
        objAljava.corRGB(72, 118, 255);
        objAljava.desenhaCirculo(350, 280, 55, 65);
        
        objAljava.cor("preto");//olho esquerdo
        objAljava.desenhaCirculo(370, 278, 8, 8);
        
        objAljava.cor("branco");
        objAljava.desenhaCirculo(370, 278, 4, 4);
        
        objAljava.cor("preto");//olho direito
        objAljava.desenhaCirculo(385, 278, 8, 8);
        
        objAljava.cor("branco");
        objAljava.desenhaCirculo(385, 278, 4, 4);
        
        objAljava.corRGB(238, 59, 59);//boca
        objAljava.desenhaCirculo(378, 285, 6, 6);
        
        objAljava.cor("branco");
        objAljava.desenhaCirculo(355, 290, 45, 55);
        
        objAljava.cor("preto");
        objAljava.desenhaCirculo(360, 300, 35, 45);
        
        objAljava.cor("branco");
        objAljava.desenhaCirculo(365, 310, 25, 35);
        
        
        objAljava.cor("preto");
        objAljava.desenhaCirculo(370, 320, 15, 25);
        
        objAljava.cor("branco");
        objAljava.desenhaCirculo(375, 330, 5, 15);
        
        objAljava.corRGB(72, 118, 255);
        objAljava.desenhaCirculo(390, 335, 15, 15);
       
        objAljava.corRGB(72, 118, 255);
        objAljava.desenhaCirculo(350, 335, 15, 15);
       
        objAljava.mostraTela();
        
    }
    
    void soltaPoder(){
        int contador = 0;
        while(contador < 40){            
            contador = contador + 1;
            objAljava.desenhaCirculo(350+x, 275+y , 10, 10);
            objAljava.limpaTela();
            
            Pokemon();
            objAljava.mostraTela();
            objAljava.espera(50);
        }
        }
        
            void desenha(){
        objAljava.cor("vermelho");      
        objAljava.desenhaCirculo(x+0, y+0, 30, 30);
       
        objAljava.cor("branco");
        objAljava.desenhaRetangulo(x+0, y+15, 30, 16);
        
        objAljava.cor("preto");
        objAljava.desenhaLinha(x+0, y+15, x+29, y+15);
        
        objAljava.cor("preto");
        objAljava.desenhaCirculo(x+11, y+11, 8, 8);
        
        objAljava.cor("branco");
        objAljava.desenhaCirculo(x+13, y+13, 4, 4);
       
        objAljava.mostraTela();
    }
}
    
   
    
    