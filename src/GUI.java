import java.awt.*;

public class GUI implements Runnable {
    private final Dimension scaledSize;
    private final String title;
    public GUI(Dimension scaledSize, String title) {
        this.scaledSize = scaledSize;
        this.title = title;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        new DrawShapesFrame(scaledSize, title);
    }

}
