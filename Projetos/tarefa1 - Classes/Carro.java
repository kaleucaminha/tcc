/**
* @author Alex Sandro Antunes Júnior
*/

public class Carro
{
    int x;
    int y;
    int xdosol;
    String cordocarro;
    boolean ligar;
    int velocidade;
    Aljava aljava;
    
    int rCeu;
    int rSol;
    int gSol;
    int bSol;
    
    int quantVerm;
    
    Carro ()    {
        x = 20;
        y = 20;
        xdosol = 20;
        rCeu = 255;
        rSol = 255;
        gSol = 255;
        bSol = 0;
        
        cordocarro = "preto";
        ligar = true;
        velocidade = 5; 
        
        quantVerm = 10;
        aljava = new Aljava();
     
    
    }
    
    void trocadecor(){
        int contador = 0;
        while(contador < 3){
            contador = contador + 1;
            aljava.limpaTela();
            
            quantVerm = quantVerm + 50;
            
            desenho();
            
            aljava.espera(50);                                                
        }
    }
    void voltaCornormal(){
        int contador = 0;
        while(contador < 3){
            contador += 1 ;
            aljava.limpaTela();
            quantVerm =  quantVerm - 50;
            desenho();
            aljava.espera(50);
        
        
        }
                
   
    }
     void finalDoDia(){
        int contador = 0;
     while(contador < 40){
        contador += 1;
        aljava.limpaTela();
        xdosol += velocidade;
        rCeu -= 5;
        rSol = 255;
        gSol = 255;
        bSol = 255;
        desenho();
        aljava.espera(20);
        
    
    }
        }
    
           
    void andaFrente(){
        int contador = 0;
        while(contador < 40){
            contador = contador + 1;
            aljava.limpaTela();
            
            x += velocidade;
            
            desenho();
            
            aljava.espera(20);                                                
        }
       
    } 
    void andaTras(){
        int contador = 0;
        while(contador < 40){
            contador += 1;
            aljava.limpaTela();
            x -= velocidade;
            desenho();
            aljava.espera(20);    
         
    
    }
    }
  
    void SuspensaoaArBaixo(){
          int contador = 0;
          while(contador < 6){
              contador = contador + 1;
                aljava.limpaTela();
                
               y = y + 1;
                desenho();
                aljava.espera(50);                        
            
            }
           }
    void  SuspensaoaArCima(){
        int contador = 0;
        
        while(contador < 6){
            contador += 1;
            aljava.limpaTela();
            y = y - 1;
            desenho();
            aljava.espera(50);    
            
            
        }
        
    }
        void desenho() {
       aljava.corRGB( 0, rCeu , 255); 
       aljava.desenhaRetangulo(0,0,1000,1000);
            
            //rodas
       aljava.cor("marrom");
       aljava.desenhaCirculo(x+70,208,30,30);
             
       aljava.cor("marron");
       aljava.desenhaCirculo(x+200,208,30,30);
      
        // sol/lua
        
        aljava.corRGB(rSol, gSol , bSol);
        aljava.desenhaCirculo(xdosol+50, 50, 35,35);
        
                 
       
       aljava.corRGB(quantVerm, 0, 0);
       aljava.desenhaRetangulo(x+60,y+171,30,15);
       
       aljava.cor("amarelo");
       aljava.desenhaRetangulo(x+90,y+171,30,15);
       
       aljava.corRGB(quantVerm, 0, 0);
       aljava.desenhaRetangulo(x+120,y+171,30,15);
       
       aljava.cor("amarelo");
       aljava.desenhaRetangulo(x+150,y+171,30,15);
       
       aljava.corRGB(quantVerm, 0, 0);
       aljava.desenhaRetangulo(x+180,y+171,30,15);
       
       aljava.cor("amarelo");
       aljava.desenhaRetangulo(x+60,y+186,30,15);
       
       aljava.corRGB(quantVerm, 0, 0);
       aljava.desenhaRetangulo(x+90,y+186,30,15);
       
       aljava.cor("amarelo");
       aljava.desenhaRetangulo(x+120,y+186,30,15);
       
       aljava.corRGB(quantVerm, 0, 0);
       aljava.desenhaRetangulo(x+150,y+186,30,15);
       
       aljava.cor("amarelo");
       aljava.desenhaRetangulo(x+180,y+186,30,15);
               
       aljava.corRGB(quantVerm, 0, 0);
       aljava.desenhaRetangulo(x+180,y+141,30,30);
       
       
       aljava.corRGB(quantVerm, 0, 0);
       aljava.desenhaRetangulo(x+80,y+141,100,30);
       
       aljava.cor("amarelo");
       aljava.desenhaRetangulo(x+180,y+141,30,30);
       
       aljava.cor("verde");
       aljava.desenhaRetangulo(x+210,y+171,25,30);     
       
       
       aljava.desenhaTexto(180, 280, "Socadasso.", 18);
       aljava.mostraTela();
    }



}