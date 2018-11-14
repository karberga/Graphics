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
    private MyPanel panel;

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
    }

}
