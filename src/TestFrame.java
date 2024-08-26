import java.awt.*;
import java.awt.event.*;;

public class TestFrame extends Frame {
    TestFrame(String title) {
        super(title);

        WindowAdapterTest ad = new WindowAdapterTest(this);

        addWindowListener(ad);
        setSize(300, 100);
        setVisible(true);

        getGraphics().drawString("Test", 10, 50);
    }

    public static void main(String[] args) {
        TestFrame test = new TestFrame("A test frame window");
    }
}

/**
 * WindowAdapterTest
 */
class WindowAdapterTest extends WindowAdapter {
    TestFrame test;

    public WindowAdapterTest(TestFrame test){
        this.test = test;
    }

    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}