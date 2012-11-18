/**
 * @author Marcelo Bernardo Filho
 * www.reblogando.com.br
 */

public class BatmanLogo {
   int posX;
   int posY;
   int tVar;
   int CorV1;
   int CorV2;
   int esp;
   int num;
   boolean mouseBe;
   
    Aljava objetoAljava;
    
   BatmanLogo() {
       posX = 50;
       posY = 50;
       tVar = 0;
       esp = 50;
       num = 0;
       mouseBe = false;

       
        
      
        
       objetoAljava = new Aljava (600,600);
    }
    
   void anima(int nesp, int numi){
       int contador = 0; 
       while(contador < numi){
          contador = contador + 1;
          desligaLuz(nesp);
          ligaLuz(nesp);          
        
          desenho();
        }  
    }
    
  void loop(){
      
      while(true){
          if( objetoAljava.mouseBotaoEsquerdoEstaPressionado() ){
              ligaLuz(10);
          }
          
          if( objetoAljava.mouseBotaoDireitoEstaPressionado() ) {
            desligaLuz(10);   
          }
        }
  }
   
  void rotaciona(int angulo){
      objetoAljava.limpaTela();
      objetoAljava.rotaciona(angulo, 485, 535);
      desenho();
  }
    
   void desligaLuz(int nesp){
       int contador = 0;
       while(contador < 40){            
            contador = contador + 1;
            objetoAljava.limpaTela();
            
            tVar = tVar+5;
            
            desenho();
                        
            objetoAljava.espera(nesp);
        }
    }
    
   void ligaLuz(int nesp){
      int contador = 0;
      while(contador > -40){            
            contador = contador - 1;
            objetoAljava.limpaTela();
            
            tVar = tVar-5;
            
            desenho();
                        
            objetoAljava.espera(nesp);
        }
    }
   
    void desenho() {
        //Feixo de luz
       objetoAljava.corTransparencia( tVar );            
       objetoAljava.corRGB(255,255,0);
       objetoAljava.rotaciona (139, 555, 510);
       objetoAljava.desenhaTriangulo (555,510,150,550);
       objetoAljava.rotaciona (0, 0, 0);
        
               
        
        //Logo 
       objetoAljava.corTransparencia( tVar );
       objetoAljava.cor("preto");
       objetoAljava.desenhaCirculo ( 20, 90, 253, 153);
       objetoAljava.cor("amarelo");
       objetoAljava.desenhaCirculo ( 22, 92, 248, 148);
       objetoAljava.cor("preto");
       objetoAljava.desenhaCirculo ( 29, 99, 234, 134);
       objetoAljava.cor("amarelo");
       objetoAljava.desenhaCirculo ( 93, 101, 35, 35);
       objetoAljava.desenhaCirculo ( 173, 101, 35, 35);
       
       
       
       objetoAljava.desenhaRetangulo ( 108, 98, 80, 38);
       objetoAljava.cor("preto");
       objetoAljava.desenhaRetangulo ( 135, 115, 30, 35);
       
       objetoAljava.desenhaTriangulo ( 129, 95, 15, 20);
       objetoAljava.desenhaTriangulo ( 157, 95, 15, 20);
       
       objetoAljava.cor("amarelo");
       objetoAljava.desenhaRetangulo ( 120, 96, 15, 20);
       objetoAljava.desenhaRetangulo ( 165, 96, 15, 20);
       
       objetoAljava.desenhaTriangulo ( 142, 182, 60, 50);
       objetoAljava.desenhaCirculo   ( 179, 176, 42, 50);
       
       objetoAljava.desenhaTriangulo ( 97, 184, 60, 50);
       objetoAljava.desenhaCirculo   ( 80, 181, 42, 50);
       objetoAljava.desenhaRetangulo ( 140, 230, 25, 5); 
       
      
       
       //Canhão de luz
       objetoAljava.corTransparencia( tVar );
       objetoAljava.cor("amarelo");
       objetoAljava.desenhaCirculo (410,460,70,70);
       objetoAljava.corTransparencia(0);
       objetoAljava.cor("preto");
       objetoAljava.desenhaCirculo (440, 490, 70, 70);
       objetoAljava.desenhaTriangulo (460,510, 60,40);
       objetoAljava.desenhaTriangulo (450,520, 70,50);
       objetoAljava.rotaciona (135, 500, 500);
       objetoAljava.desenhaRetangulo ( 500, 500, 70, 70);
       objetoAljava.rotaciona (0, 0, 0);
       objetoAljava.corRGB(128,128,128);
       objetoAljava.desenhaCirculo (480, 530, 10,10);
       
       
       
       
  

       
       

       

       
       
       objetoAljava.mostraTela();
        
        
    }
    

    

    
}