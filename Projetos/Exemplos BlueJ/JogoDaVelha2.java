import aljava.*;

class JogoDaVelha2 {

    String nomeJogador1;
    String nomeJogador2;
    
    int casas[];
    boolean vezJogador1;
    
    JogoDaVelha2(){
        Alj.inicializa(302, 352);
        
        nomeJogador1 = "Kaléu";
        nomeJogador2 = "Olavo";
        vezJogador1 = true;
        
        casas = new int[9];
        casas[0] = 0;
        casas[1] = 0;
        casas[2] = 0;
        casas[3] = 0; 
        casas[4] = 0;
        casas[5] = 0;
        casas[6] = 0;
        casas[7] = 0;
        casas[8] = 0;
    }
    
    void loop(){
        while(true){
            Alj.tela.limpa();
            
            processaMouse();
            desenha();
            
            verificaVitoria();
            verificaEmpate();
        }
    }
    
    void processaMouse(){
        if( Alj.mouse.clickE() ){
            int xMouse = Alj.mouse.x();
            int yMouse = Alj.mouse.y();
            
            int coluna = xMouse / 101;
            int linha = (yMouse - 50) / 101;
            
            int pos = (linha * 3) + coluna;
            if(casas[pos] != 0){
                //A casa já está ocupada. bloqueia método
                return;
            }
            
            if(vezJogador1){
                casas[pos] = 1;
                vezJogador1 = false;
            } else {
                casas[pos] = 2;
                vezJogador1 = true;
            }
            
        }
    }
    
    void verificaVitoria(){
       //Horizontais
       verificaVitoria3Casas(0, 1, 2); 
       verificaVitoria3Casas(3, 4, 5); 
       verificaVitoria3Casas(6, 7, 8); 
       
       //Verticais
       verificaVitoria3Casas(0, 3, 6); 
       verificaVitoria3Casas(1, 4, 7); 
       verificaVitoria3Casas(2, 5, 8); 
       
       //Diagonais
       verificaVitoria3Casas(0, 4, 8); 
       verificaVitoria3Casas(2, 4, 6); 
    }
    
    void verificaVitoria3Casas(int c1, int c2, int c3){
        if(casas[c1] == 1 && casas[c2] == 1 && casas[c3] == 1){
            Alj.tela.exibeMensagem("Jogador "+nomeJogador1+" venceu.");
            reinicia();
        }
        
        if(casas[c1] == 2 && casas[c2] == 2 && casas[c3] == 2){
            Alj.tela.exibeMensagem("Jogador "+nomeJogador2+" venceu.");
            reinicia();
        }
    }
    
    void verificaEmpate(){
        for(int i = 0; i <= 8; i++){
            if( casas[i] == 0){
                return;
            }
        }
        
        Alj.tela.exibeMensagem("Empate.");
        reinicia();
    }
    
    void reinicia(){
        for(int i = 0; i <= 8; i++){
            casas[i] = 0;
        }
    }
    
    void desenha(){
        Alj.desenha.texto(20, 25, "Jogador 1: "+nomeJogador1);
        Alj.desenha.texto(170, 25, "Jogador 2: "+nomeJogador2);
        
        Alj.desenha.linha(0, 48, 302, 48);
        
        desenhaCasinhas();
        
        Alj.tela.exibe();
    }
    
    void desenhaCasinhas(){
        
        for(int i = 0; i <= 8; i = i + 1 ){
            if(casas[i] == 2){
                Alj.cor.nome("vermelho");           
            } else if(casas[i] == 1) {
                Alj.cor.nome("azul");            
            } else {
                Alj.cor.nome("preto");            
            }
            
            int linha = i / 3;
            int coluna = i % 3;
            
            int posX = coluna * 101;
            int posY = (linha * 101) + 50;
            Alj.desenha.retangulo(posX, posY, 100, 100);
        }
    }
}