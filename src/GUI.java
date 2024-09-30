import java.awt.*;

public class GUI implements Runnable {
    private final Dimension scaledSize;
    public GUI(Dimension scaledSize) {
        this.scaledSize = scaledSize;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        new DrawShapesFrame(scaledSize);
    }

}
