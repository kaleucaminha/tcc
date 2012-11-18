// @author Carolina Quint Sizenando e Vitor Martins Amaral dos Santos~

public class PikaCasinha {

 boolean telhado;
 String corDoTelhado;
 String corDaParede;
 String corDoPorta;
 String corDaJanela;
 boolean janela;
 boolean porta;
 boolean arvore;
 int posicaoCasa;
 int posicaoArvore;
 boolean chao;
 boolean pikachu;
 String corDoPikachu;
 int posicaoPikachu;
 Aljava objetoAljava;
 int posicaoxPikachu;
 int tamanhoArvore;
 int maca;
 boolean evoluido;
 
PikaCasinha (boolean arvore1, int posicaoTudi, boolean pikachu1){
 telhado  = true;
 corDoTelhado = "vermelho";
 corDaParede = "amarelo";
 corDoPorta = "preto";
 corDaJanela = "azul";
 janela  = true;
 porta  = true;
 arvore  = arvore1;
 posicaoCasa  = posicaoTudi;
 posicaoArvore = posicaoTudi;
 chao = true;
 pikachu = pikachu1;
 corDoPikachu = "amarelo";
 posicaoPikachu = posicaoTudi;
 objetoAljava = new Aljava(500, 300);
 tamanhoArvore = 0;
}

void CasaSemTelhado (){
        objetoAljava.cor(corDaParede);
        objetoAljava.desenhaRetangulo(100,posicaoCasa, 100, 60);
        objetoAljava.cor (corDoPorta);
        objetoAljava.desenhaRetangulo (160, (posicaoCasa+10), 22, 50); 
        if (arvore){
            objetoAljava.cor ("preta");
            objetoAljava.desenhaRetangulo(50, (posicaoCasa-10-tamanhoArvore), 15, 70+tamanhoArvore);
            objetoAljava.cor ("verde");
            objetoAljava.desenhaCirculo (30, (posicaoCasa-30-tamanhoArvore), 55, 55);
            objetoAljava.cor ("vermelho");
            objetoAljava.desenhaCirculo(45,(posicaoCasa-15-tamanhoArvore),maca,maca);
            objetoAljava.cor ("vermelho");
            objetoAljava.desenhaCirculo(52,(posicaoCasa-0-tamanhoArvore),maca,maca);
            objetoAljava.cor ("vermelho");
            objetoAljava.desenhaCirculo(70,(posicaoCasa+10-tamanhoArvore),maca,maca);
            objetoAljava.cor ("vermelho");
            objetoAljava.desenhaCirculo(35,(posicaoCasa-25-tamanhoArvore),maca,maca);
            objetoAljava.cor ("vermelho");
            objetoAljava.desenhaCirculo(65,(posicaoCasa-25-tamanhoArvore),maca,maca);
        }
        objetoAljava.cor ("verde");
        objetoAljava.desenhaLinha (0, (posicaoCasa+60), 500, 180);
        objetoAljava.mostraTela ();
    }
    
    void Telhado (){
        objetoAljava.cor (corDoTelhado);
        objetoAljava.desenhaTriangulo (100,(posicaoCasa-50), 100, 50);
        objetoAljava.mostraTela ();
    }
    
    void Janela (){
        objetoAljava.cor (corDaJanela);
        objetoAljava.desenhaRetangulo (110, (posicaoCasa+10), 25, 25);
        objetoAljava.mostraTela ();
    }
    
    void Pika (){
        if (pikachu){
            if (evoluido){
                objetoAljava.cor(corDoPikachu);
                objetoAljava.desenhaCirculo(posicaoxPikachu+260, (posicaoPikachu+5), 60, 60);
            }  else {
                objetoAljava.cor(corDoPikachu);
                objetoAljava.desenhaRetangulo(posicaoxPikachu+270, (posicaoPikachu+10), 40, 50);
            }
            objetoAljava.cor("preto");
            objetoAljava.desenhaRetangulo(posicaoxPikachu+280, (posicaoPikachu+25), 5, 5);
            
             objetoAljava.cor("preto");
            objetoAljava.desenhaRetangulo(posicaoxPikachu+295, (posicaoPikachu+25), 5, 5);
            
            objetoAljava.cor("vermelho");
            objetoAljava.desenhaRetangulo(posicaoxPikachu+275, (posicaoPikachu+35), 5, 5);
            
            objetoAljava.cor("vermelho");
            objetoAljava.desenhaRetangulo(posicaoxPikachu+300, (posicaoPikachu+35), 5, 5);
            
            objetoAljava.cor(corDoPikachu);
            objetoAljava.desenhaRetangulo(posicaoxPikachu+295, (posicaoPikachu+60), 10, 5);
            
            objetoAljava.cor(corDoPikachu);
            objetoAljava.desenhaRetangulo(posicaoxPikachu+275, (posicaoPikachu+60), 10, 5);
            
            objetoAljava.cor(corDoPikachu);
            objetoAljava.desenhaRetangulo(posicaoxPikachu+275, (posicaoPikachu-5), 5, 20);
            
            objetoAljava.cor(corDoPikachu);
            objetoAljava.desenhaRetangulo(posicaoxPikachu+300, (posicaoPikachu-5), 5, 20);
            
            objetoAljava.cor("preto");
            objetoAljava.desenhaRetangulo(posicaoxPikachu+300, (posicaoPikachu-10), 5, 5);
            
            objetoAljava.cor("preto");
            objetoAljava.desenhaRetangulo(posicaoxPikachu+275, (posicaoPikachu-10), 5, 5);
            
            objetoAljava.cor(corDoPikachu);
            objetoAljava.desenhaRetangulo(posicaoxPikachu+265, (posicaoPikachu+45), 10, 10);
            
            objetoAljava.cor(corDoPikachu);
            objetoAljava.desenhaRetangulo(posicaoxPikachu+260, (posicaoPikachu+40), 8, 10);
            
            objetoAljava.cor(corDoPikachu);
            objetoAljava.desenhaRetangulo(posicaoxPikachu+258, (posicaoPikachu+35), 10, 10);
            
            objetoAljava.cor("preto");
            objetoAljava.desenhaRetangulo(posicaoxPikachu+258, (posicaoPikachu+32), 10, 5);
            
            objetoAljava.mostraTela ();
        }
}

void pulaPikaPulaMaxPower (int aceleraAPika){
    int contador = 0;
    while(contador < 20){
        contador = contador+1;
        posicaoPikachu = posicaoPikachu-1;
        
        objetoAljava.limpaTela ();
        Pika();
        objetoAljava.espera(aceleraAPika);
    
    }
    while(contador < 40){
        contador = contador+1;
        posicaoPikachu = posicaoPikachu+1;
        
         objetoAljava.limpaTela ();
        Pika();
        objetoAljava.espera(aceleraAPika);
    }
}

void arvoreEreta (int arvoreCresce){
    int contador = 0;
    while(contador < 10){
        contador = contador+1;
        tamanhoArvore = tamanhoArvore+1;
        
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        Janela();
        Pika();
        objetoAljava.espera(5);
    
}
}

void macasRenascer (int tamanhoMaca){
    int contador = 0;
    while(contador < tamanhoMaca){
        contador = contador+1;
        maca += 1;
        
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        Janela();
        Pika();
        objetoAljava.espera(5);
    
}
}

void arvoreMole (int arvoreDiminui){
    int contador = 0;
    while(contador < arvoreDiminui){
        contador = contador+1;
        tamanhoArvore = tamanhoArvore-1;
        
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        Janela();
        Pika();
        objetoAljava.espera(5);
    
}
}

void pikaEvolui (int tempoEv){
    int contador = 0;
    while(contador < tempoEv/2){
        contador = contador+1;
        corDoPikachu = ("preto");
        Janela();
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        Pika();
        
        contador = contador+1;
        corDoPikachu = ("amarelo");
        Janela();
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        Pika();
    }
    evoluido = true;
    contador = 0;
    while(contador < tempoEv/2){
        contador = contador+1;
        corDoPikachu = ("preto");
        Janela();
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        Pika();
        
        contador = contador+1;
        corDoPikachu = ("amarelo");
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        Pika();
        Janela();
    }
}
void janelaRestart (int tempoRestart){
    int contador = 0;
    while(contador < tempoRestart){
        contador = contador+1;
        corDaJanela = ("branco");
        Janela();
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        
        contador = contador+1;
        corDaJanela = ("preto");
        Janela();
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        
        contador = contador+1;
        corDaJanela = ("vermelho");
        Janela();
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        
        contador = contador+1;
        corDaJanela = ("azul");
        Janela();
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        
        contador = contador+1;
        corDaJanela = ("amarelo");
        Janela();
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        
        contador = contador+1;
        corDaJanela = ("verde");
        Janela();
        objetoAljava.espera(80);
        objetoAljava.limpaTela ();
        Telhado();
        CasaSemTelhado();
        Janela();
        objetoAljava.espera(1);
    
    }
   
}

void casinhaSeduiz (){
    int contador = 0;
    while(contador < 20){
        objetoAljava.rotaciona(contador+1, 200, posicaoCasa-50);
        
        contador = contador+1;
        
        objetoAljava.limpaTela ();
        Telhado();
        objetoAljava.rotaciona(0, 0, 0);
        CasaSemTelhado();
        Janela();
        objetoAljava.espera(1);
    
    }
    contador = 0;
    while(contador < 20){
        objetoAljava.rotaciona(20-contador, 200, posicaoCasa-50);
        
        contador = contador+1;
        
        objetoAljava.limpaTela ();
        Telhado();
        objetoAljava.rotaciona(0, 0, 0);
        CasaSemTelhado();
        Janela();
        objetoAljava.espera(1);
    
    }
}
void pulaPikaPula (){
    int contador = 0;
    while(contador < 20){
        contador = contador+1;
        posicaoPikachu = posicaoPikachu-1;
        
        objetoAljava.limpaTela ();
        Pika();
        objetoAljava.espera(10);
        Telhado();
        CasaSemTelhado();
        Janela();
    
    }
    while(contador < 40){
        contador = contador+1;
        posicaoPikachu = posicaoPikachu+1;
        
         objetoAljava.limpaTela ();
        Pika();
        objetoAljava.espera(10);
        Telhado();
        CasaSemTelhado();
        Janela();
    }
}

void andaPikaPula (){
    int contador = 0;
    int contador2= 0;
    while(contador < 40){
    contador = contador+1;
    contador2 = 0;
        while (contador2<5){
        contador2 = contador2+1;
        posicaoxPikachu = posicaoxPikachu+1;
        
        objetoAljava.limpaTela ();
        Pika();
        objetoAljava.espera(10);
        
        contador2 = contador2+1;
        posicaoPikachu = posicaoPikachu-1;
        
        objetoAljava.limpaTela ();
        Pika();
        objetoAljava.espera(10);
        Telhado();
        CasaSemTelhado();
        Janela();
    }
    contador = contador+1;
    contador2 = 0;
    while (contador2<5){
        contador2 = contador2+1;
        posicaoxPikachu = posicaoxPikachu+1;
        
        objetoAljava.limpaTela ();
        Pika();
        objetoAljava.espera(10);
        
        contador2 = contador2+1;
        posicaoPikachu = posicaoPikachu+1;
        
        objetoAljava.limpaTela ();
        Pika();
        objetoAljava.espera(10);
        Telhado();
        CasaSemTelhado();
        Janela();
    }
    }
}

}

//desenhaRetangulo(x,y,largura,altura)
//desenhaCirculo(x,y,largura,altura)
//desenhaTriangulo(x,y,largura,altura)
//desenhaLinha(x,y,x2,y2)
//desenhaTexto(x,y,"texto",tamFonte)
//cor("vermelho")
//corTransparencia(porcentagem)
//rotaciona(angulo,x,y)
//corRGB(numR,numG,numB)