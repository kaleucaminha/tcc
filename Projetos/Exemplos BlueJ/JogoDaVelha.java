import aljava.*;

class JogoDaVelha {

    String nomeJogador1;
    String nomeJogador2;
    
    int casa1;
    int casa2;
    int casa3;
    int casa4;
    int casa5;
    int casa6;
    int casa7;
    int casa8;
    int casa9;
    
    JogoDaVelha(){
        Alj.inicializa(302, 352);
        
        nomeJogador1 = "Kaléu";
        nomeJogador2 = "Olavo";
        
        casa1 = 0;
        casa2 = 1;
        casa3 = 1;
        casa4 = 0; 
        casa5 = 0;
        casa6 = 2;
        casa7 = 0;
        casa8 = 0;
        casa9 = 2;
    }
    
    void desenha(){
        Alj.desenha.texto(20, 25, "Jogador 1: "+nomeJogador1);
        Alj.desenha.texto(170, 25, "Jogador 2: "+nomeJogador2);
        
        Alj.desenha.linha(0, 48, 302, 48);
        
        desenhaCasinhas();
        
        Alj.tela.exibe();
    }
    
    void desenhaCasinhas(){
        
        //Desenha casinha 1
        if(casa1 == 2){
           Alj.cor.nome("vermelho");           
        } else if(casa1 == 1) {
           Alj.cor.nome("azul");            
        } else {
           Alj.cor.nome("preto");            
        }
        Alj.desenha.retangulo(0, 50, 100, 100);
        
        //Desenha casinha 2
        if(casa2 == 2){
           Alj.cor.nome("vermelho");           
        } else if(casa2 == 1) {
           Alj.cor.nome("azul");            
        } else {
           Alj.cor.nome("preto");            
        }
        Alj.desenha.retangulo(101, 50, 100, 100);
        
        //Desenha casinha 3
        if(casa3 == 2){
           Alj.cor.nome("vermelho");           
        } else if(casa3 == 1) {
           Alj.cor.nome("azul");            
        } else {
           Alj.cor.nome("preto");            
        }
        Alj.desenha.retangulo(202, 50, 100, 100);
        
        //Desenha casinha 4
        if(casa4 == 2){
           Alj.cor.nome("vermelho");           
        } else if(casa4 == 1) {
           Alj.cor.nome("azul");            
        } else {
           Alj.cor.nome("preto");            
        }
        Alj.desenha.retangulo(0, 151, 100, 100);
        
        //Desenha casinha 2
        if(casa5 == 2){
           Alj.cor.nome("vermelho");           
        } else if(casa5 == 1) {
           Alj.cor.nome("azul");            
        } else {
           Alj.cor.nome("preto");            
        }
        Alj.desenha.retangulo(101, 151, 100, 100);
        
        //Desenha casinha 3
        if(casa6 == 2){
           Alj.cor.nome("vermelho");           
        } else if(casa6 == 1) {
           Alj.cor.nome("azul");            
        } else {
           Alj.cor.nome("preto");            
        }
        Alj.desenha.retangulo(202, 151, 100, 100);
        
        //Desenha casinha 7
        if(casa7 == 2){
           Alj.cor.nome("vermelho");           
        } else if(casa7 == 1) {
           Alj.cor.nome("azul");            
        } else {
           Alj.cor.nome("preto");            
        }
        Alj.desenha.retangulo(0, 252, 100, 100);
        
        //Desenha casinha 8
        if(casa8 == 2){
           Alj.cor.nome("vermelho");           
        } else if(casa8 == 1) {
           Alj.cor.nome("azul");            
        } else {
           Alj.cor.nome("preto");            
        }
        Alj.desenha.retangulo(101, 252, 100, 100);
        
        //Desenha casinha 9
        if(casa9 == 2){
           Alj.cor.nome("vermelho");           
        } else if(casa9 == 1) {
           Alj.cor.nome("azul");            
        } else {
           Alj.cor.nome("preto");            
        }
        Alj.desenha.retangulo(202, 252, 100, 100);
    }
}