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
    public DrawShapesFrame(Dimension scaledSize, String title) throws HeadlessException {

        setSize(scaledSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TopPanel tp = new TopPanel(scaledSize);
        setTitle(title);
        this.getContentPane().add(tp);
        setLocationRelativeTo(null); // center
        setVisible(true);
    }

}
