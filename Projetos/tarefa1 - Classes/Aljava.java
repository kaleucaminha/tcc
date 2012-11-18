import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Esta classe contém diversos métodos para auxiliar
 * o desenvolvimento inicial de jogos 2D.
 * 
 * Esta classe tem fins unicamente didáticos,
 * não sendo adequada para projetos finais pois
 * agrega uma grande quantidade de responsabilidades.
 * 
 * Em um projeto real as classes internas deverão ser 
 * desacopladas.
 * 
 * @author Kaléu Caminha <kaleu.caminha@gmail.com>
 * 
 * Obs: O nome aljava se refere ao instrumento no qual
 *      os arqueiros guardam as suas flechas.
 *      
 *      A idéia é que esta classe e o respectivo framework sejam
 *      um conjunto de flechas que podem ser usadas em diversas situações
 *      de uma batalha, para diversão ou desenvolvimento pessoal.
 *      
 * Obs2: As classes privadas auxiliares são baseadas no framework javaPlay criado por @author VisionLab/PUC-Rio
 */
public class Aljava
{
    GameCanvas canvas;
    GameEngine instance;
    
    Color cor;
    int transparencia = 0;
    
    int rotacionaXCentral = 0;
    int rotacionaYCentral = 0;
    int rotacionaAngulo = 0;
    
    public Aljava() 
    {
        init(300,300);
    }
    
    public Aljava(int width, int height) 
    {
        init(width, height);
    }
    
    /**
     * Construtor
     */
    public void init(int width, int height) 
    {
        instance = new GameEngine(width, height);
        canvas = instance.getGameCanvas();
        cor = Color.black;
        
        limpaTela();
        mostraTela();
    }
    
    /************************/
    /** Métodos de Desenho **/
    /************************/
   
    public void desenhaLinha(int xInicial, int yInicial, int xFinal, int yFinal){   
        xInicial = canvas.getStartX() + xInicial;
        yInicial = canvas.getStartY() + yInicial;
        xFinal = canvas.getStartX() + xFinal;
        yFinal = canvas.getStartY() + yFinal;
        Graphics g = canvas.getGameGraphics();
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(cor);
        execRotate(g2d);
        g2d.drawLine(xInicial, yInicial, xFinal, yFinal);
        eraseRotate(g2d);
    }
    
    public void desenhaCirculo(int x, int y, int largura, int altura){  
        x = canvas.getStartX() + x;
        y = canvas.getStartY() + y;
        Graphics g = canvas.getGameGraphics();
        Graphics2D g2d = (Graphics2D)g;
        execRotate(g2d);
        g.setColor(cor);
        g.fillOval(x, y, largura, altura);
        eraseRotate(g2d);
    }
    
    public void desenhaRetangulo(int x, int y, int largura, int altura){   
        x = canvas.getStartX() + x;
        y = canvas.getStartY() + y;
        Graphics g = canvas.getGameGraphics();
        Graphics2D g2d = (Graphics2D)g;
        execRotate(g2d);
        g2d.setColor(cor);
        g2d.fillRect(x, y, largura, altura);
        eraseRotate(g2d);
    }
    
    public void desenhaTriangulo(int x, int y, int largura, int altura){  
        x = canvas.getStartX() + x;
        y = canvas.getStartY() + y;
        Polygon triangulo = new Polygon();
        triangulo.addPoint(x, y+altura);
        triangulo.addPoint(x+largura, y+altura);
        triangulo.addPoint(x+(largura/2), y);
        triangulo.addPoint(x, y+altura);
        desenhaPoligono(triangulo);
    }
    
    public void desenhaPoligono(Polygon poligono){   
        Graphics g = canvas.getGameGraphics();
        Graphics2D g2d = (Graphics2D)g;
        execRotate(g2d);
        g2d.setColor(cor);
        g2d.fillPolygon(poligono);
        eraseRotate(g2d);
    }
    
    public void desenhaTexto(int x, int y, String texto, int tamanhoFonte){  
        x = canvas.getStartX() + x;
        y = canvas.getStartY() + y;
        
        Graphics g = canvas.getGameGraphics();
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(cor);
        
        Font f = new Font("Helvetica", Font.PLAIN, tamanhoFonte);       
        g2d.setFont(f);
        execRotate(g2d);
        g2d.drawString(texto, x, y);
        eraseRotate(g2d);
    }
    
    public void rotaciona(int angulo, int xCentral, int yCentral){ 
        this.rotacionaAngulo = angulo;
        this.rotacionaXCentral = canvas.getStartX()+xCentral;
        this.rotacionaYCentral = canvas.getStartY()+yCentral;
    }    
    
    private void execRotate(Graphics2D g2d){
        g2d.rotate(Math.toRadians(this.rotacionaAngulo), this.rotacionaXCentral, this.rotacionaYCentral);
    }
     
    private void eraseRotate(Graphics2D g2d){
        g2d.rotate(-Math.toRadians(this.rotacionaAngulo), this.rotacionaXCentral, this.rotacionaYCentral);
    }
    
    /**********************/
    /** Métodos do Mouse **/
    /**********************/
    
    public boolean mouseBotaoEsquerdoEstaPressionado(){
        Mouse mouse = instance.getMouse();
        return mouse.isLeftButtonPressed();
    }
    
    public boolean mouseBotaoDireitoEstaPressionado(){
        Mouse mouse = instance.getMouse();
        return mouse.isRightButtonPressed();
    }
    
    public int mousePegaPosicaoClickX(){
        Mouse mouse = instance.getMouse();
        return (int)(mouse.getMousePos().getX()-canvas.getStartX());
    }
    
    public int mousePegaPosicaoClickY(){
        Mouse mouse = instance.getMouse();
        return (int)(mouse.getMousePos().getY()-canvas.getStartY());
    }
    
    /*************/
    /** Teclado **/
    /*************/
    
    public boolean teclaEstaPressionada(String tecla){
        int keyCode = 0;
        if(tecla.equals("enter")){
            keyCode = KeyEvent.VK_ENTER;
        } else if(tecla.equals("espaco")){
            keyCode = KeyEvent.VK_SPACE;
        } else if(tecla.equals("esquerda")){
            keyCode = KeyEvent.VK_LEFT;
        } else if(tecla.equals("direita")){
            keyCode = KeyEvent.VK_RIGHT;
        } else if(tecla.equals("cima")){
            keyCode = KeyEvent.VK_UP;
        } else if(tecla.equals("baixo")){
            keyCode = KeyEvent.VK_DOWN;
        } else if(tecla.equals("a")){
            keyCode = KeyEvent.VK_A;
        } else if(tecla.equals("s")){
            keyCode = KeyEvent.VK_S;
        } else if(tecla.equals("d")){
            keyCode = KeyEvent.VK_D;
        } else if(tecla.equals("w")){
            keyCode = KeyEvent.VK_W;
        } else if(tecla.equals("p")){
            keyCode = KeyEvent.VK_P;
        } else if(tecla.equals("x")){
            keyCode = KeyEvent.VK_X;
        } else if(tecla.equals("z")){
            keyCode = KeyEvent.VK_Z;
        }else {
            System.err.println("Tecla: \""+tecla+"\" nao reconhecida. as teclas permitidas sao:");
            System.err.println("\"enter\", \"espaco\", \"esquerda\", \"direita\", \"cima\" e \"baixo\"");
            System.err.println("\"w\", \"a\", \"s\", \"d\", \"z\", \"x\", \"p\"");
            return false;
        }
        Keyboard k = instance.getKeyboard();
        return k.keyDown(keyCode);
    }
    
    /**************************************/
    /** Métodos aplicados sobre as Cores **/
    /**************************************/
    
    /**
     * Altera a cor do desenho.
     * As cores disponíveis são: 
     * "vermelho", "laranja", "ciano", "preto", "azul", "amarelo", "verde", "magenta" e "branco".
     */
    public void cor(String colorString){
        if(colorString.equals("vermelho")) {
            cor = Color.red;
        }else if(colorString.equals("laranja")) {
            cor = Color.orange;
        }else if(colorString.equals("ciano")) {
            cor = Color.cyan;
        }else if(colorString.equals("preto")) {
            cor = Color.black;
        }else if(colorString.equals("azul")) {
            cor = Color.blue;
        }else if(colorString.equals("amarelo")) {
            cor = Color.yellow;
        }else if(colorString.equals("verde")) {
            cor = Color.green;
        }else if(colorString.equals("magenta")) {
            cor = Color.magenta;
        }else if(colorString.equals("branco")) {
            cor = Color.white;
        }else {
            cor = Color.black;
        }
        corTransparencia(transparencia);
    }  
    
    public void corRGB(int r, int g, int b){
        cor = new Color(r, g, b);
        corTransparencia(transparencia);
    }
    
    /**
     * Altera a transparência da cor.
     * Deve ser um valor entre 0 (opaco) e 100 (transparente)
     */
    public void corTransparencia(int porcentagem){
        if(porcentagem > 100){
            porcentagem = 100;
        }
        if(porcentagem < 0){
            porcentagem = 0;
        }
        int rgbalpha;
        if(porcentagem == 0){
            rgbalpha = 255;
        } else {
            double percent = porcentagem / 100.00;
            double alpha = percent * 255.00;
            rgbalpha = (int)(255 - alpha); //inverte pois quanto maior a porcentagem, menor o alpha
        }
        Color novaCor = new Color(cor.getRed(), cor.getGreen(), cor.getBlue(), rgbalpha);
        cor = novaCor;
        transparencia = porcentagem;
    }
    
    /************************/
    /** Métodos Auxiliares **/
    /************************/
    
    public void limpaTela(){
        int x = canvas.getStartX();
        int y = canvas.getStartY();
        Graphics g = canvas.getGameGraphics();
        g.setColor(Color.white);
        g.fillRect(x, y, canvas.getLargura(), canvas.getAltura());
    }
    
    /**
     * Em programação, existem questões técnicas que diferem do mundo real.
     * Para desenhar são usadas duas telas, 
     * isso serve para evitar um erro que ocorre da tela ficar piscando 
     * quando desenhamos vários objetos.
     * 
     * Uma das telas é exibida enquanto os desenhos sãso feitos na outra.
     * Quando este método é executado, os desenhos feitos são exibidos e 
     * a tela que estapa sendo visualizada fica aguardando novos desenhos.
     */
    public void mostraTela(){    
        canvas.swapBuffers();
    }
    
    public int sorteiaNumero(int min, int max){
        Random sorteador = new Random();
        return min + sorteador.nextInt(max);
    }
    
    /**
     * Para a execução do programa por um determinado tempo.
     * @param  milisegundos o tempo de pausa Ex: 1000 equivale a um segundo
     */
    public void espera(int milisegundos)
    {
        try{
            Thread.sleep(milisegundos);
        } 
        catch (Exception e){
            // exceção ignorada por enquanto
        }
    }
    
   
private class GameCanvas extends JFrame
{
    private final int defaultScreenWidth = 7;
    private final int defaultScreenHeight = 33;
    private Graphics g;
    private BufferStrategy bf;
    private int renderScreenStartX;
    private int renderScreenStartY;
    private int largura;
    private int altura;

    public GameCanvas(GraphicsConfiguration gc, int width, int height)
    {
        super(gc);
        this.largura = width;
        this.altura = height;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(this.largura+defaultScreenWidth, this.altura+defaultScreenHeight);
        setResizable(false);
        setVisible(true);
        
        createBufferStrategy(2);

        renderScreenStartX = this.getContentPane().getLocationOnScreen().x;
        renderScreenStartY = this.getContentPane().getLocationOnScreen().y;

        bf = getBufferStrategy();
    }

    public int getLargura(){
        return this.largura;
    }
    
    public int getAltura(){
        return this.altura;
    }
    
    public int getStartX()
    {
        return renderScreenStartX;
    }

    public int getStartY()
    {
        return renderScreenStartY;
    }

    public Graphics getGameGraphics()
    {        
        try{
            g = bf.getDrawGraphics();
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            
            return g;
        }catch(Exception e){
            try{
                Thread.sleep(100);
                return this.getGameGraphics();
            }catch(Exception e2){
                System.err.println("Erro inesperado, tente reiniciar o programa.");
                System.exit(0);
            }
        }
        return null;
    }

    public void swapBuffers()
    {
        bf.show();
        g.dispose();       
        Toolkit.getDefaultToolkit().sync();
    }
}

private class GameEngine 
{
    private GameCanvas canvas;
    private Mouse mouse;
    private Keyboard keyboard;

    private GameEngine(int width, int height)
    {
        GraphicsEnvironment graphEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice graphDevice = graphEnv.getDefaultScreenDevice();
        GraphicsConfiguration graphicConf = graphDevice.getDefaultConfiguration();

        canvas = new GameCanvas(graphicConf, width, height);

        mouse = new Mouse();
        keyboard = new Keyboard();

        canvas.addMouseListener(mouse);
        canvas.addMouseMotionListener(mouse);
        canvas.addKeyListener(keyboard);
        
        instance = null;
    }

    public GameCanvas getGameCanvas()
    {
        return canvas;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }
}


/**
 * Classe responsável por gerenciar questões do mouse.
 */
private class Mouse implements MouseMotionListener, MouseListener
{
    private Point mousePos;
    private boolean leftButtonPressed;
    private boolean middleButtonPressed;
    private boolean rightButtonPressed;

    public Mouse()
    {
        mousePos = new Point(0, 0);
        leftButtonPressed = false;
        middleButtonPressed = false;
        rightButtonPressed = false;
    }

    public Point getMousePos()
    {
        return mousePos;
    }

    public boolean isLeftButtonPressed()
    {
        return leftButtonPressed;
    }

    public boolean isMiddleButtonPressed()
    {
        return middleButtonPressed;
    }

    public boolean isRightButtonPressed()
    {
        return rightButtonPressed;
    }

    public void mouseClicked(MouseEvent e)
    {
        
    }

    public void mousePressed(MouseEvent e)
    {
        switch(e.getButton())
        {
            case MouseEvent.BUTTON1:
                leftButtonPressed = ((e.getModifiersEx() & MouseEvent.BUTTON1_DOWN_MASK) != 0);
                break;
            case MouseEvent.BUTTON2:
                middleButtonPressed = ((e.getModifiersEx() & MouseEvent.BUTTON2_DOWN_MASK) != 0);
                break;
            case MouseEvent.BUTTON3:
                rightButtonPressed = ((e.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) != 0);
                break;
        }
    }

    public void mouseReleased(MouseEvent e)
    {
        switch(e.getButton())
        {
            case MouseEvent.BUTTON1:
                leftButtonPressed = ((e.getModifiersEx() & MouseEvent.BUTTON1_DOWN_MASK) != 0);
                break;
            case MouseEvent.BUTTON2:
                middleButtonPressed = ((e.getModifiersEx() & MouseEvent.BUTTON2_DOWN_MASK) != 0);
                break;
            case MouseEvent.BUTTON3:
                rightButtonPressed = ((e.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) != 0);
                break;
        }
    }

    public void mouseEntered(MouseEvent e)
    {
        
    }

    public void mouseExited(MouseEvent e)
    {
        
    }

    public void mouseDragged(MouseEvent e)
    {
        
    }

    public void mouseMoved(MouseEvent e)
    {
        mousePos = e.getPoint();
    }

}




/**
 * Classe responsável por gerenciar questões relacionadas ao Teclado
 */
private class Keyboard implements KeyListener
{
    private Hashtable<Integer, Integer> keysPressed;

    public static final int UP_KEY = 38;
    public static final int LEFT_KEY = 37;
    public static final int RIGHT_KEY = 39;
    public static final int DOWN_KEY = 40;
    public static final int ESCAPE_KEY = 27;
    public static final int SPACE_KEY = 32;
    public static final int ENTER_KEY = 10;

    public Keyboard() {
        keysPressed = new Hashtable<Integer,Integer>();
    }

    public synchronized boolean keyDown(int keyCode) {        
        return keysPressed.contains(keyCode);
    }

    public void keyTyped(KeyEvent e)  {
        
    }

    public synchronized void keyPressed(KeyEvent e)
    {        
        if(keysPressed.contains(e.getKeyCode()) == false) {
            keysPressed.put(e.getKeyCode(), e.getKeyCode());            
        }
    }

    public synchronized void keyReleased(KeyEvent e)
    {     
        keysPressed.remove(e.getKeyCode());        
    }
}
    
}
