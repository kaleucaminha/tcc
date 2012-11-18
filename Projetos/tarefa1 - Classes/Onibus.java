/**
* @author Fellipe Hoffmann
*/
public class Onibus {
    int velocidade;
    String Marca;
    int x;
    int y;
    String c2;
    String corroda;
    Aljava objetoAljava;
    String corceu;
    String corjanelan;
    int noite;
    int corazul;
    
   Onibus(int nVelocidade,String coronibus){
        Marca = "JOTUR";
        noite = 1;
        corazul=1;
        x = 10;
        y = 10;
        velocidade +=nVelocidade;
        c2 = coronibus;
        corroda = "vermelho";
        corjanelan = "preto";
        corceu = "azul";
        objetoAljava= new Aljava(300,150);
   }
   void MudaCorRoda(String corroda2){
      corroda = corroda2;
      desenho();
   }
   void MudaCorOnibus(String coronibus){
      c2=coronibus;
      desenho();
   }
   void MudaCorJanela(String corjanela){
      corjanelan= corjanela;
      desenho();
   }
   void MudaCorCeu(String corceun){
      corceu=corceun;
      desenho();
   }
    void andaParaCima(){
      int contador=0;
      while(contador < 20){
            contador=contador + 1;
            objetoAljava.limpaTela();
            y-= velocidade;
            desenho();
    }
   }
   void andaParaBaixo(){
       int contador = 0;
       while(contador < 20){
                contador +=1;
                objetoAljava.limpaTela();
                y+= velocidade;
                desenho();
    }    
   }
   void andaParaTras(){
       int contador = 0;
       while(contador < 17){            
            contador += 1;
            objetoAljava.limpaTela();
            x += velocidade;
            desenho();
    }
   }
   void andaParaFrente(){
       int contador = 0;
       while(contador < 17){
                    contador+=1;
                    objetoAljava.limpaTela();
                    x-= velocidade;
                    desenho();
    }
   }
   void Noite(){ // mesmo com essa lógica o código não funciona.
       int contador=0;
       while(contador < 17);{
           noite=2;
           contador+=1;
            corazul = corazul + 15;
            desenho();
            objetoAljava.espera(50);
        }
    }
   void desenho(){
       //ceu
        if( noite == 2){
        objetoAljava.corRGB(0,0,corazul);
    }
    else{
        objetoAljava.cor(corceu);
    }
        objetoAljava.desenhaRetangulo(0,0,600,600);
        
        //sol
        objetoAljava.cor("amarelo");
        objetoAljava.desenhaCirculo(7,5,30,30);
        
        //Estrada
        objetoAljava.cor("cinza");
        objetoAljava.desenhaRetangulo(0,140,300,10);
       
       //Lataria
        objetoAljava.cor(c2);
        objetoAljava.desenhaRetangulo(x+50,y+45, 175, 75);
        
        objetoAljava.cor("branco");
        objetoAljava.desenhaRetangulo(x+52,y+80, 172, 23);
        
        objetoAljava.cor("preto");
        objetoAljava.desenhaTexto(x+100, y+100, "JOTUR", 16);
        
        //Vidros
        objetoAljava.cor(corjanelan);
        objetoAljava.desenhaRetangulo(x+52,y+48, 20, 35);
        
        //Roda
        objetoAljava.cor(corroda);
        objetoAljava.desenhaCirculo(x+65,y+110,24,24);
        
        //Calota
        objetoAljava.cor("branco");
        objetoAljava.desenhaCirculo(x+68,y+113,18,18);
        
        //Roda
        objetoAljava.cor(corroda);
        objetoAljava.desenhaCirculo(x+183,y+110,24,24);
        
        //Calota
        objetoAljava.cor("branco");
        objetoAljava.desenhaCirculo(x+186,y+113,18,18); 
        
       //Vidro
        objetoAljava.cor(corjanelan);
        objetoAljava.desenhaRetangulo(x+75, y+48, 20, 20); 
        
        //Vidro
        objetoAljava.cor(corjanelan);
        objetoAljava.desenhaRetangulo(x+98,y+ 48, 20, 20);
        
        //Vidro
        objetoAljava.cor(corjanelan);
        objetoAljava.desenhaRetangulo(x+120,y+ 48, 20, 20); 
        
        //Vidro
        objetoAljava.cor(corjanelan);
        objetoAljava.desenhaRetangulo(x+143,y+48, 20, 20);
            
        //Vidro
        objetoAljava.cor(corjanelan);
        objetoAljava.desenhaRetangulo(x+165, y+48, 20, 20);
        
        //Vidro
        objetoAljava.cor(corjanelan);
        objetoAljava.desenhaRetangulo(x+187,y+48, 20, 20);
          
        //Vidro
        objetoAljava.cor(corjanelan);
        objetoAljava.desenhaRetangulo(x+210,y+ 48, 10, 20);
        objetoAljava.mostraTela();
        
        
        
        
   }
}
