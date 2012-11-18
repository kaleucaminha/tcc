/**
*@ Gabriel Nied
*/

public class Borracha
{
    int x;
    int y;
    int velocidade;
    String cor;

    Aljava objAljava;
    
    Borracha(String trocaCor, int velocidadeX)
    {

        cor = trocaCor;
        velocidade = velocidadeX;
        x = 20;
        y = 20;
        objAljava = new Aljava(600, 300);
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
    
    
    void andaParaTras(){
        int contador = 0;
        while(contador < 40){            
            contador = contador + 1;
            objAljava.limpaTela();
            
            x = x - velocidade;
            desenha();
            
            objAljava.espera(50);
        }
    }
    
    void rodandoNaPista(){
        int contador = 0;
        while(contador < 40){
            
            //rotaciona uma certa quantidade e graus o desenho
            //os outros dois parÃ¢metros sÃ£o o x e y do centro da rodaÃ§Ã£o.
            objAljava.rotaciona(contador*6, x+25, y+10);
            
            contador = contador + 1;
            objAljava.limpaTela();
            
            x = x + velocidade;
            desenha();
            
            objAljava.espera(50);
        }
    }
    
    void comeco(){
        int contador = 0;
        while(contador < 40){            
            contador = contador + 1;
            objAljava.limpaTela();
            
            x = y + velocidade;
            desenha();
            
            objAljava.espera(50);
        }
    }
    
   void Invisivel(){ 
        objAljava.limpaTela();
        
        objAljava.transparencia = 100;
        objAljava.cor("Preto");
        objAljava.desenhaCirculo( x, y, 20, 20);
        objAljava.mostraTela();
    
    }
    
        void Visivel(){ 
        objAljava.limpaTela();
        
        objAljava.transparencia = 0;
        objAljava.cor(cor);
        objAljava.desenhaRetangulo( x, y, 100, 40);      
        objAljava.mostraTela();
    
    }
    
        void Teleporte(){ 
            objAljava.limpaTela();
        x += 300;
        desenha();
        
    }
    
    void Acelera(){
        velocidade += 5;
        
    }
    
    void Freia(){
        velocidade -= 5;
        
    }
    
    void VelocidadeInicial(){
        velocidade = 5;
        
    }
   
         void Vermelho(){ 
        cor = "vermelho";
        desenha();        
    }
    
    void desenha(){ 

        objAljava.cor(cor );
        objAljava.desenhaRetangulo( x, y, 100, 40);        
        
        objAljava.mostraTela();
    }
}