// @author LUiz Gustavo Miranda


public class CarroCameleao {
         int x;
         int y;
         int corR;
         int corG;
         int corB;
         int h;
         int l;
         int z;
         String a;
         
         Aljava objetoAljava;
         
         CarroCameleao(int altura, int largura, String cor){
              x = 60;
              y = 15;
              corR = 255; 
              corG = 255;
              corB = 0;
              h = largura;
              l = altura;
              z = 0;
              a = cor;
              
              objetoAljava = new Aljava(500,500);
            }
            void desenha() {
                objetoAljava.cor ("preto");
                objetoAljava.desenhaCirculo (x+60,175,30+l,30+h);
                objetoAljava.desenhaCirculo (x+135,175,30+l,30+h);
                objetoAljava.corRGB (corR, corG, corB);
                objetoAljava.desenhaRetangulo (x+50,150,120+l,40+h);
                objetoAljava.desenhaRetangulo (x+100,115,50+l,40+h);
                objetoAljava.cor (a);
                objetoAljava.desenhaRetangulo (x+105,121,40+l,30+h);       
                objetoAljava.mostraTela();    
            }
            void move (int velo){
                int contador = 0;
                while(contador<100) {
                contador = contador+1;
                x += velo;
                desenha();
                objetoAljava.limpaTela();
                objetoAljava.espera(10);        
                
                
                }
            }
            
            void mudaCor (){
                    int contador = 0;
                    while(contador<20) {
                    contador = contador+1;
                    corR = corR-1;
                    corG = corG-1;
                    corB = corB+1;
                    desenha();
                    objetoAljava.limpaTela();
                    objetoAljava.espera(10);        
                        
                    }
                }
                
                void voltaCor (){
                    int contador = 0;
                    while(contador<20) {
                    contador = contador+1;
                    corR = corR+1;
                    corG = corG+1;
                    corB = corB-1;
                    desenha();
                    objetoAljava.limpaTela();
                    objetoAljava.espera(10);        
                        
                    }
            }
            
            void crescer (int veloCrescer){
                int contador = 0;
                while(contador<101) {
                contador += veloCrescer;
                h = h+1;
                l = l+1;
                desenha();
                objetoAljava.limpaTela();
                objetoAljava.espera(10);        
                    
                }
                while(contador<101) {
                contador += veloCrescer;
                h = h-1;
                l = l-1;
                desenha();
                objetoAljava.limpaTela();
                objetoAljava.espera(10);        
                    
                }
        }
         
        void decrescer (int veloDecrescer){
                int contador = 0;
                while(contador<101) {
                contador += veloDecrescer;
                h = h-1;
                l = l-1;
                desenha();
                objetoAljava.limpaTela();
                objetoAljava.espera(10);        
                    
                }
        }
            
            void rotacionar (int angulo){            
                int contador = 0;
                        while(contador<angulo) {
                                  
                objetoAljava.rotaciona(angulo, x+82, y+125);
                objetoAljava.limpaTela();
                desenha();                       
            }
        }
        void vidro (String janela) {
             objetoAljava.limpaTela ();
                    
                a = janela;
                            
                
                desenha();
                objetoAljava.espera(100); 
            }
    }