/**
* @author Iury Fukuda
*/

public class Sapo {
    int x;
    int y;
    int l;
    int a;
    int c1;
    int c2;
    int c3;
    int s1;
    int s2;
    int s3;
    int v1;
    int v2;
    int v3;
    boolean menino;
    boolean cor;
    
    Aljava objetoAljava;
        
    Sapo(boolean macho, boolean verde){
    menino = macho;
    cor = verde;
    x = 116;
    y = 100;
    l = 10;
    a = 15;
    c1 = 0;
    c2 = 0;
    
    c3 = 0;
    s1 = 250;
    s2 = 250;
    s3 = 250;
      
    objetoAljava = new Aljava();
    }
     
   
    
    void desenha(){
      
        //fundo
        objetoAljava.corRGB(s1,s2,s3);
        objetoAljava.desenhaRetangulo(0,0,400,400);
        //cabeça
         if(cor){ 
           objetoAljava.cor("verde");
         } else  { 
           objetoAljava.cor("vermelho");
        }
        objetoAljava.desenhaCirculo(75,100,150,100);
        
        //olho esquerdo
        if(cor){ 
           objetoAljava.cor("verde");
        }
         else{ 
           objetoAljava.cor("vermelho");
        }
        objetoAljava.desenhaCirculo(100,70,40,60);
        objetoAljava.cor("branco");
        objetoAljava.desenhaCirculo(110,90,20,30);
        objetoAljava.corRGB(c1,c2,c3);
        objetoAljava.desenhaCirculo(x,y,l,a);
        objetoAljava.cor("branco");
        objetoAljava.desenhaCirculo(x+5,y+7,l-10,a-15);
        
        //olho direito
        if(cor){ 
           objetoAljava.cor("verde");
        }else{ 
           objetoAljava.cor("vermelho");
        }
        objetoAljava.desenhaCirculo(160,70,40,60);
        objetoAljava.cor("branco");
        objetoAljava.desenhaCirculo(170,90,20,30);
        objetoAljava.corRGB(c1,c2,c3);
        objetoAljava.desenhaCirculo(x+58,y,l,a);
        objetoAljava.cor("branco");
        objetoAljava.desenhaCirculo(x+63,y+7,l-10,a-15);
      //boca
       objetoAljava.cor("preto");
       objetoAljava.desenhaCirculo(130,145,40,40);
       objetoAljava.cor("vermelho");
       objetoAljava.desenhaCirculo(140,175,20,10);
       objetoAljava.cor("preto");
       objetoAljava.desenhaRetangulo(149,175,2,2);
      
       if(cor){ 
           objetoAljava.cor("verde");
       }else{ 
        objetoAljava.cor("vermelho");
       }
       objetoAljava.desenhaRetangulo(110,125,80,40);
       
       //nariz
       objetoAljava.cor ("preto");
       objetoAljava.desenhaCirculo(140,135,2,2);
       
       objetoAljava.cor ("preto");
       objetoAljava.desenhaCirculo(158,135,2,2); 
       
      if(menino){
           
       }else{
        if(cor){
           //pintas direita
           objetoAljava.cor ("vermelho");
           objetoAljava.desenhaCirculo(195,140,4,4);
            objetoAljava.cor ("vermelho");
           objetoAljava.desenhaCirculo(185,145,4,4);
            objetoAljava.mostraTela();
            objetoAljava.cor ("vermelho");
           objetoAljava.desenhaCirculo(195,150,4,4);
            objetoAljava.mostraTela();
           //pintas esquerda
           objetoAljava.cor ("vermelho");
           objetoAljava.desenhaCirculo(100,140,4,4);
            objetoAljava.cor ("vermelho");
           objetoAljava.desenhaCirculo(110,145,4,4);
            objetoAljava.mostraTela();
            objetoAljava.cor ("vermelho");
           objetoAljava.desenhaCirculo(100,150,4,4);
        }else{
           //pintas direita 
           objetoAljava.cor ("preto");
           objetoAljava.desenhaCirculo(195,140,4,4);
            objetoAljava.cor ("preto");
           objetoAljava.desenhaCirculo(185,145,4,4);            
            objetoAljava.cor ("preto");
           objetoAljava.desenhaCirculo(195,150,4,4);
           //pintas esquerda
           objetoAljava.cor ("preto");
           objetoAljava.desenhaCirculo(100,140,4,4);
            objetoAljava.cor ("preto");
           objetoAljava.desenhaCirculo(110,145,4,4);
            objetoAljava.cor ("preto");
           objetoAljava.desenhaCirculo(100,150,4,4);
            objetoAljava.mostraTela();
        }
        
       
       //Laço
       
       //contornoDireita
       
       objetoAljava.cor ("preto");
       objetoAljava.desenhaTriangulo(188,73,19,23);
        
       //contornoEsquerda
       
       objetoAljava.cor ("preto");
       objetoAljava.desenhaTriangulo(165,60,29,13);
        
       //laçoDireita
       objetoAljava.cor ("magenta");
       objetoAljava.desenhaTriangulo(190,75,15,20);
       
       //laçosquerda
       
       objetoAljava.cor ("magenta");
       objetoAljava.desenhaTriangulo(167,62,25,10);
       
       //meio
       
       objetoAljava.cor ("preto");
       objetoAljava.desenhaCirculo(186,69,14,14);
       objetoAljava.cor ("magenta");
       objetoAljava.desenhaCirculo(187,70,12,12);
    }
      
       objetoAljava.mostraTela();
}
    void aumentaTamanho(){
        int contador = 0;
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            
            l = l + 2;
            x = x - 1;
            y = y - 1;
            a = a + 2;
            desenha();
            
            objetoAljava.espera(100);
           
    }
    objetoAljava.espera(2000);
    contador = 0;
   while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            
            l = l - 2;
            x = x + 1;
            y = y + 1;
            a = a - 2;
            desenha();
            
            objetoAljava.espera(100);
            }
} 
   
   void diminuiTamanho(){
        int contador = 0;
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            
            l = l - 2;
            x = x + 1;
            y = y + 1;
            a = a - 2;
            desenha();
            
            objetoAljava.espera(100);
        }
        contador = 0;
        objetoAljava.espera(2000);
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            
            l = l + 2;
            x = x - 1;
            y = y - 1;
            a = a + 2;
            desenha();
            
            objetoAljava.espera(100);
        }
}

    void olhaPraDireitaBaixo(){int contador = 0;
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x + 1;
            y = y + 1;
            desenha();
            objetoAljava.espera(100);
        }
        contador = 0;
        objetoAljava.espera(2000);
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x - 1;
            y = y - 1;
            desenha();
            objetoAljava.espera(100);
        }   
    
}
        void olhaPraEsquerdaBaixo(){int contador = 0;
    
            while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x - 1;
            y = y + 1;
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
        contador = 0;
        objetoAljava.espera(2000);
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x + 1;
            y = y - 1;
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
    
}
 
       void olhaPraEsquerdaCima(){int contador = 0;
    
            while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x - 1;
            y = y - 1;
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
        contador = 0;
        objetoAljava.espera(2000); 
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x + 1;
            y = y + 1;
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
   
}
        void olhaPraDireitaCima(){int contador = 0;
    
            while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x + 1;
            y = y - 1;
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
        contador = 0;
        objetoAljava.espera(2000);
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x - 1;
            y = y + 1;
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
   
}
 void olhaPraDireita(){int contador = 0;
    
            while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x + 1;
            
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
        contador = 0;
        objetoAljava.espera(2000); 
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x - 1;
            
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
   
}
 void olhaPraEsquerda(){int contador = 0;
    
            while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x - 1;
            
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
        contador = 0;
        objetoAljava.espera(2000); 
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            x = x + 1;
            
            desenha();
            
            objetoAljava.espera(100);
            
    
        }

   
}
void olhaPraCima(){int contador = 0;
    
            while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            y = y - 1;
            
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
        contador = 0;
        objetoAljava.espera(2000); 
         while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            y = y + 1;
            
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
   
}
void olhaPraBaixo(){int contador = 0;
    
            while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            y = y + 1;
            
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
        contador = 0;
        objetoAljava.espera(2000); 
        while(contador < 4){
            contador = contador + 1;
            objetoAljava.limpaTela();
            y = y - 1;
            
            desenha();
            
            objetoAljava.espera(100);
            
    
        }
   
}
void mudarCorOlho(){int contador = 0;

        while(contador < 250){
        contador = contador + 1;
        objetoAljava.limpaTela();
        if (cor){
        c1 = c1 + 1;
    }
        else{
        c2 = c2 + 1;   
        c1 = c1 + 1;
        }
        desenha();
        
        objetoAljava.espera(10);
        
    }   
        objetoAljava.espera(300);
        contador = 0;
        while(contador < 250){
        contador = contador + 1;
        objetoAljava.limpaTela();
        if (cor){
        c1 = c1 - 1;
      }
        else{
        c2 = c2 - 1;
        c1 = c1 - 1;
      }
        desenha();
        
        objetoAljava.espera(10);
        
    }
   

}
void tremerVisao(){
int contador = 0;


       
           
           while(contador < 15){
            
            contador = contador + 1;
            objetoAljava.limpaTela();
            y = y - 1;           
            
            desenha();
            
            objetoAljava.espera(50);
            objetoAljava.limpaTela();
            y = y + 1;
            
            desenha();
             
            objetoAljava.espera(50);
            objetoAljava.limpaTela();
            x = x - 1;           
            
            desenha();
            
            objetoAljava.espera(50);
            objetoAljava.limpaTela();
            x = x + 1;           
            
            desenha();
            
            objetoAljava.espera(50);
           
            
           
    
        }
        
    x = 116;
    y = 100;
    l = 10;
    a = 15;
   
}
void mudarCorFundo(){int contador = 0;

        while(contador < 250){
        contador = contador + 1;
        objetoAljava.limpaTela();
        s1 = s1 - 1;
        s2 = s2 - 1;
        s3 = s3 - 1;
        
        desenha();
        
        objetoAljava.espera(10);
        
    }
        contador = 0;
        objetoAljava.espera(1000);

        while(contador < 250){
        contador = contador + 1;
        objetoAljava.limpaTela();
        s1 = s1 + 1;
        s2 = s2 + 1;
        s3 = s3 + 1;
        
        desenha();
        
        objetoAljava.espera(10);

    }
}



}