package Abyss;

import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Abyss.Screens.Screen;
import Abyss.Screens.StartScreen;

/*
 * I am now on tutorial #7
 */
public class ApplicationMain extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1060623638149583738L;

    private AsciiPanel terminal;
    private Screen screen;

    public ApplicationMain(){
        super();
        terminal = new AsciiPanel();
        add(terminal);
        pack();
        screen = new StartScreen();
        addKeyListener(this);
        repaint();
    }
    
    public void repaint(){
        terminal.clear();
        screen.displayOutput(terminal);
        super.repaint();
    }
    
    public void keyPressed(KeyEvent e) {
        screen = screen.respondToUserInput(e);
        repaint();
    }

    public void keyReleased(KeyEvent e) { }

    public void keyTyped(KeyEvent e) { }
    

    public static void main(String[] args) {
    	//Starting Attributes
    	PlayerAi.MaxHP = 95;
    	PlayerAi.hp = 75;
    	PlayerAi.stamina = 20;
    	PlayerAi.mana = 10;
    	PlayerAi.Attack = 10;
    	PlayerAi.Defense = 5;
    	PlayerAi.critical= 10.00;
    	
    	
    	
    	
    	PlayerAi.cunning = 3;
    	PlayerAi.endurance = 3;
    	PlayerAi.luck = 3;
    	PlayerAi.insight = 3;
    	PlayerAi.xp = 0;
    	
    	
    	
    	
        ApplicationMain app = new ApplicationMain();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

