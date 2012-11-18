/**
*@ Gabriel Lipiarski e Christopher 
*/    

public class Bicicleta
{
    int x;
    int y;
    int velocidade;
    String cor;
    Aljava objAljava;
    
    Bicicleta(String outraCor, int xVeloc)
    {
        cor = outraCor;
        x = 50;
        y = 50;
        velocidade = xVeloc;
        
        objAljava = new Aljava(600, 300);
    }
 
    
    
    void andaParaTras(){
        int contador = 0;
        while(contador < 40){            
            contador = contador + 1 ;
            objAljava.limpaTela();
            
            x = x - velocidade;
            desenha();
            
            objAljava.espera(50);
        }
    }
    
    void andaFrente(){
        int contador = 0;
        while(contador < 40){            
            contador = contador + 1;
            objAljava.limpaTela();
            
            x = x + velocidade;
            desenha();
            
            objAljava.espera(50);
        }
    }
    void acelera(int nVelocidade){
        
        velocidade += nVelocidade;
        
    }
     void trocaCor(){ 
        
        cor = "magenta";
        desenha();
        
        
    }

    
    void rodandoNaPista(){
        int contador = 0;
        while(contador < 40){
            
            
            objAljava.rotaciona(contador*18, x+100, y+0);
            
            contador = contador + 1;
            objAljava.limpaTela();
            
            x = x + velocidade;
            desenha();
            
            objAljava.espera(50);
        }
    }
    void chamarAtencao(){
        int contador = 0;
        while(contador < 10){            
            contador = contador + 1;
            objAljava.limpaTela();
            
            x = -x + velocidade;
           
            desenha();
            
            objAljava.espera(50);
        }
    }
    
    void desenha(){ 
     
        objAljava.cor(cor);
        objAljava.desenhaRetangulo( x, y, 50, 20);
        
         
        objAljava.corRGB(0,0,0);

        objAljava.desenhaCirculo( x+30, y+15, 15, 15);

        objAljava.desenhaCirculo( x+5, y+15, 15, 15);
        
        objAljava.mostraTela();
    }

    }