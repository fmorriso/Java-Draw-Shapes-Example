import javax.swing.*;
import java.awt.*;

public class DrawShapesFrame extends JFrame {

    /**
     * Constructs a new frame that is initially invisible.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */
    public DrawShapesFrame() throws HeadlessException {

        setSize(new Dimension(320, 320));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TopPanel tp = new TopPanel();
        setTitle("My Shapes");
        this.getContentPane().add(tp);

        setVisible(true);
    }

}
