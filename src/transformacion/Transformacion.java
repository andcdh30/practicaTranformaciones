package transformacion;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 *
 * @author ISC CHRISTIAN DANIEL ANDRADE
 */
public class Transformacion extends JPanel{
    
    int x1=120, y1=120;
    
    public Transformacion() {
        // Crear slider de 0° a 360°
//        JSlider slider = new JSlider(0, 150);
//        slider.setPaintTicks(true);
//        slider.setPaintLabels(true);
//
//        // Listener para actualizar el ángulo
//        slider.addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent e) {
//                x1 = slider.getValue();
//                repaint(); // redibujar con el nuevo ángulo
//            }
//        });
//
//        setLayout(new BorderLayout());
//        add(slider, BorderLayout.SOUTH);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Dibujar cuadrado original
        Rectangle2D cuadrado = new Rectangle2D.Double(50, 50, 100, 100);
        g2.setColor(Color.BLUE);
        g2.draw(cuadrado);
        
//        //Traslacion
        AffineTransform traslacion =   AffineTransform.getTranslateInstance(x1, y1);
        Shape cuadradoTrasladado = traslacion.createTransformedShape(cuadrado);
        g2.setColor(Color.RED);
        g2.draw(cuadradoTrasladado);
////        
////        //Escalamiento
//        AffineTransform escala = AffineTransform.getScaleInstance(2, 2);
//        Shape cuadradoEscalado = escala.createTransformedShape(cuadrado);
//        g2.setColor(Color.GREEN);
//        g2.draw(cuadradoEscalado);
////
////       //Rotacion
//        AffineTransform rotacion = AffineTransform.getRotateInstance(Math.toRadians(45), 100, 100);
//        Shape cuadradoRotado = rotacion.createTransformedShape(cuadrado);
//        g2.setColor(Color.ORANGE);
//        g2.draw(cuadradoRotado);
////
////        //sesgado
//        AffineTransform sesgado = AffineTransform.getShearInstance(0.5, 0.2);
//        Shape cuadradoSesgado = sesgado.createTransformedShape(cuadrado);
//        g2.setColor(Color.MAGENTA);
//        g2.draw(cuadradoSesgado);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Transformaciones en 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Transformacion());
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
    
}
