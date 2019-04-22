/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockey;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author deinfo
 */
public class Hockey extends JComponent{

    public AlphaComposite makeComposite(float alpha) {
    int type = AlphaComposite.SRC_OVER;
    return(AlphaComposite.getInstance(type, alpha));
 }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(Color.BLACK);
        g2.setStroke(new BasicStroke(2.0f));

        // P.inicial(50,50), Tamanho(300,150), arcLarg(50), arcAlt(50) 
        g2.draw(new RoundRectangle2D.Double(50, 50, 300, 150, 50, 50));
        
        // zona neutra
            // linha central
        g2.setPaint(Color.RED);
        g2.drawLine(200, 50, 200, 115); 
        g2.drawOval(199, 124, 3, 3);
        g2.drawLine(200, 135, 200, 200);
            // circulo central
        //g2.setPaint(new Color(0, 1, 0, alpha));
        g2.setPaint(Color.BLUE);
        g2.drawOval(175, 100, 50, 50);
            // linha central esquerda
        g2.setPaint(Color.BLUE);
        g2.drawLine(152, 50, 152, 200);
            // linha central direita
        g2.drawLine(248, 50, 248, 200);
        
        //linha gol esquerda
        g2.setPaint(Color.RED);
        g2.drawLine(65, 54, 65, 196);
        
        //linha gol direita
        g2.drawLine(334, 54, 334, 196);
        
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rounded Rectangle Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Hockey(), BorderLayout.CENTER);
        frame.pack();
        frame.setSize(420, 300);
        frame.setVisible(true);
    }
}
