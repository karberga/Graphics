import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author grant
 *
 */
public class MyFrame extends JFrame
{

    private final int WIDTH = 300;
    private final int HEIGHT = 400;
    private static MyPanel panel;

    public MyFrame(String title)
    {
        setTitle(title);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame("Hello");
        frame.paintLine();
        
        MyFrame frame1 = new MyFrame("Rectangle");
        frame1.paintRectangle();
        
        MyFrame frame2 = new MyFrame("Oval");
        frame2.paintOval();
    }

    private void paintOval()
    {
        panel = new OvalDemoPanel();
        add(panel);
        setVisible(true);
    }

    private void paintRectangle()
    {
        panel = new RectangleDemoPanel();
        add(panel);
        setVisible(true);
    }

    private void paintLine()
    {
        panel = new LineDemoPanel();
        add(panel);
        setVisible(true);
    }

}
