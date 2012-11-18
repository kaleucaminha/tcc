/*
 * By Thomas Ewert
 */



public class Boliche
{
    
    int x;
    int y;
    int velocidade;
    String cor;
    Aljava objAljava;
    
    boolean circular;
    
    
    Boliche(int nVelocidade)
    {
        
        x = 20;
        y = 20;
        velocidade = nVelocidade;
        
        objAljava = new Aljava(600, 200);
    }
 
    void animacaoCompleta(){
        girandoNaPista();
        pinoCaindo();
        
    }
    
    void girandoNaPista(){
        int contador = 0;
        int graus = 0;
        while(contador < 50){
            contador = contador +1;
            objAljava.limpaTela();
            
            
            x = x + velocidade;
            graus += 30;    
            
            objAljava.rotaciona( graus , x+30+12, y-10+12);
            desenha();
            
            
            objAljava.rotaciona(0, 0, 0);
            desenhaCenario();
            
            objAljava.espera(50);
            
        }
    }
    
    void pinoCaindo(){
        int contador = 0;
        int graus = 0;
        while(contador < 20){
            contador = contador +1;
            objAljava.limpaTela();
            
            
            x = x + velocidade;
            graus += 5;    
            
            objAljava.rotaciona( graus , x+30+12, y-10+12);
            desenhaCenario();
            
            
            objAljava.rotaciona(0, 0, 0);
            desenha();
            
            objAljava.espera(10);
            
        }
    }
    
    void desenhaCenario(){
        
        objAljava.corRGB(20,0,0);
        objAljava.corTransparencia(0);
        objAljava.desenhaCirculo( 420, 10, 15, 24);
        objAljava.desenhaCirculo( 421, 3, 12, 12);
        objAljava.mostraTela();
        
    
    }
    
    void desenha(){ 

        objAljava.corRGB(200,100,200);
        objAljava.corTransparencia(30);
        objAljava.desenhaCirculo( x+30, y-10, 24, 24);
        objAljava.desenhaCirculo( x+46, y-0, 5, 5);
        objAljava.desenhaCirculo( x+36, y-0, 5, 5);
        objAljava.desenhaCirculo( x+41, y+6, 5, 5);
       
        
        objAljava.mostraTela();
    }
}