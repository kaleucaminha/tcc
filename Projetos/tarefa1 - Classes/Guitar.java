public class Guitar {
              String cor1;
              String cor2;
              String cor3;
              String cor4; 

        Aljava aljava;
        Guitar (){
              cor1 = "vermelho";
              cor2 = "amarelo";
              cor3 = "laranja";
              cor4 = "azul";


              aljava = new Aljava(600, 600);
            }
            
        void guitar1 () {
            aljava.cor("preto");
            aljava.desenhaCirculo (200, 300, 150, 150);
            aljava.desenhaRetangulo (300, 358, 200 , 35);
            
            aljava.cor("branco");
            aljava.desenhaCirculo (210, 310, 130, 130);
            
            aljava.cor("azul"); 
            aljava.desenhaRetangulo (350+65, 359, 10 , 33);
            aljava.cor("amarelo");           
            aljava.desenhaRetangulo (350+85, 359, 10 , 33);
            aljava.cor("laranja");
            aljava.desenhaRetangulo (350+105, 359, 10 , 33);
            aljava.cor("vermelho");
            aljava.desenhaRetangulo (350+125, 359, 10 , 33); 
            
            aljava.cor("cinza");
            aljava.desenhaLinha(358, 300, 340, 440);

            aljava.mostraTela();
            }
        }