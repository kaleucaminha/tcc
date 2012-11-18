import aljava.*;

class Carro3 {

    int posicaoX;
    int posicaoY;
    int angulo;
    String cor;
    
    double quantGasolina; 
    boolean estaLigado;
    char tipoVeiculo;
    
    
    Carro3(){
        posicaoX = 20;
        posicaoY = 50;
        angulo = 0;
        quantGasolina = 40.00;
        estaLigado = false;
        tipoVeiculo = 'e';
        cor = "vermelho"; 
    }
    
    void andaFrente(){
        posicaoX = posicaoX + 10;
        angulo = 0;
        
        //se andou, perde gasolina
        quantGasolina -= 0.1;       
    } 
    
    void andaDireita(){
        posicaoY = posicaoY + 10;
        angulo = 90;
        
        //se andou, perde gasolina
        quantGasolina -= 0.1;
    } 
    
    void liga(){
        estaLigado = true; 
    }
    
    void pintaVerde(){
        cor = "verde";
    }
    
    void animacaoCarroAndando(){
        int contadorQuadros = 0;
        while( contadorQuadros < 10) {
            andaFrente();
            desenha();
            Alj.util.espera(200);
            
            contadorQuadros = contadorQuadros + 1;
        }
    }
    
    void desenha(){
        Alj.tela.limpa();
        
        Alj.transforma.rotaciona(angulo, posicaoX + 40, posicaoY + 20);
        Alj.cor.nome( cor );
        Alj.desenha.retangulo(posicaoX, posicaoY, 80, 40);
  
        
        Alj.cor.nome("preto");
        Alj.desenha.oval(posicaoX + 10, posicaoY - 10, 20, 20);
        Alj.desenha.oval(posicaoX + 10, posicaoY + 30, 20, 20);
        Alj.desenha.oval(posicaoX + 50, posicaoY - 10, 20, 20);
        Alj.desenha.oval(posicaoX + 50, posicaoY + 30, 20, 20);
        Alj.transforma.limpaRotacao();
        
        Alj.tela.exibe();
    }
}