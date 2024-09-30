import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

public class TopPanel extends JPanel {

    private final Dimension scaledSize;
    public TopPanel(Dimension scaledSize) {
        this.scaledSize = scaledSize;
    }

    /**
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        double x1, y1, x2, y2, w, h;
        x1 = scaledSize.width * 0.05;
        x2 = scaledSize.width * 0.95;
        y1 = scaledSize.height * 0.05;
        y2 = scaledSize.height * 0.95;

        Shape line = new Line2D.Double(3, 3, 303, 303);
        Shape rect = new Rectangle(3, 3, 303, 303);
        Shape circle = new Ellipse2D.Double(100, 100, 100, 100);

        x1 = scaledSize.width * 0.10;
        y1 = x1;
        w = scaledSize.height * 2. / 3.;
        h = w;
//        Shape roundRect = new RoundRectangle2D.Double(20, 20, 250, 250, 5, 25);
        Shape roundRect = new RoundRectangle2D.Double(x1, y1, w, h, 5, 25);
        g2.draw(line);
        g2.draw(rect);
        g2.draw(circle);
        g2.draw(roundRect);
    }

}
