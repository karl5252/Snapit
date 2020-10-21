import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;

    public class RobotTest {

        RobotTest(String name){
            try {
                Robot robot = new Robot();
                String format = "png";
                String fileName = name + "." + format;

                Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
                ImageIO.write(screenFullImage, format, new File(fileName));

                System.out.println("A full screenshot saved!");
            } catch (AWTException | IOException e) {
                System.err.println(e);
            }
        }

        public static void main(String[] args) {
            String test = "C:/tmp/Test2";
            new RobotTest(test);

        }
    }

