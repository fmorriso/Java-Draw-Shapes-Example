import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.format("Java version: %s%n", getJavaVersion());
        String title = String.format("Draw Shapes Example using java version %s", getJavaVersion());
        Dimension scaledSize = SwingScreenUtilities.getScaledSize(.55, 100);
        GUI gui = new GUI(scaledSize, title);
        SwingUtilities.invokeLater(gui);
    }



    /** get the java version that is running the current program
     * @return string containing the java version running the current program
     */
    private static String getJavaVersion()
    {
        Runtime.Version runTimeVersion = Runtime.version();
        return String.format("%s.%s.%s.%s", runTimeVersion.feature(), runTimeVersion.interim(), runTimeVersion.update(), runTimeVersion.patch());
    }
}
