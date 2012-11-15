class Carro {

    int posicaoX;
    double quantGasolina; 
    boolean estaLigado;
    char tipoVeiculo;
    String cor;
    
    Carro(){
        posicaoX = 20;
        quantGasolina = 40.00;
        estaLigado = false;
        tipoVeiculo = 'e';
        cor = "vermelho"; 
    }
    
    void andaFrente(){
        posicaoX = posicaoX + 10;
        //se andou, perde gasolina
        quantGasolina -= 0.1;
    } 
    
    void liga(){
        estaLigado = true; 
    }
    
    void pintaVerde(){
        cor = "verde";
    }
}