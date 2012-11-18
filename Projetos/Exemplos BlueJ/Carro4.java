import aljava.*;

class Carro4 {

    int posicaoX;
    int posicaoY;
    int angulo;
    String cor;
    
    double quantGasolina; 
    boolean estaLigado;
    char tipoVeiculo;
    
    
    Carro4(char parametroTipoVeiculo){
        posicaoX = 20;
        posicaoY = 50;
        angulo = 0;
        quantGasolina = 40.00;
        estaLigado = false;
        tipoVeiculo = parametroTipoVeiculo;
        cor = "vermelho"; 
    }
    
    void andaFrente(int distancia){
        if(quantGasolina <= 0){
            Alj.tela.exibeMensagem("Carro sem combustível. Abasteça");
            return;
        } 
        
        posicaoX = posicaoX + distancia;
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
            andaFrente(1);
            desenha();
            Alj.util.espera(200);
            
            contadorQuadros = contadorQuadros + 1;
        }
    }
    
    void desenha(){
        Alj.tela.limpa();
        
        Alj.transforma.rotaciona(angulo, posicaoX + 40, posicaoY + 20);
        Alj.cor.nome( cor );
        if(tipoVeiculo == 'c') {
            Alj.desenha.retangulo(posicaoX, posicaoY, 80, 40);
        } else if (tipoVeiculo == 'm') {
            Alj.desenha.oval(posicaoX, posicaoY, 80, 40);
        } else {
            Alj.desenha.retangulo(posicaoX + 15, posicaoY, 10, 40);
            Alj.desenha.retangulo(posicaoX + 20, posicaoY+12, 65, 16);
            Alj.desenha.retangulo(posicaoX + 55, posicaoY, 10, 40);
        }
        
        Alj.cor.nome("preto");
        Alj.desenha.oval(posicaoX + 10, posicaoY - 10, 20, 20);
        Alj.desenha.oval(posicaoX + 10, posicaoY + 30, 20, 20);
        Alj.desenha.oval(posicaoX + 50, posicaoY - 10, 20, 20);
        Alj.desenha.oval(posicaoX + 50, posicaoY + 30, 20, 20);
        Alj.transforma.limpaRotacao();
        
        Alj.tela.exibe();
    }
}