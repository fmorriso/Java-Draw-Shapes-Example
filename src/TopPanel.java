import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

public class TopPanel extends JPanel {


    /**
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Shape line = new Line2D.Double(3, 3, 303, 303);
        Shape rect = new Rectangle(3, 3, 303, 303);
        Shape circle = new Ellipse2D.Double(100, 100, 100, 100);
        Shape roundRect = new RoundRectangle2D.Double(20, 20, 250, 250, 5, 25);
        g2.draw(line);
        g2.draw(rect);
        g2.draw(circle);
        g2.draw(roundRect);
    }

}
