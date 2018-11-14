import java.awt.Color;
import java.awt.Graphics;

public class RectangleDemoPanel extends MyPanel
{
    public RectangleDemoPanel()
    {
        super();
    }
    
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        int startX = 10;
        int startY = 10;
        
        int endX = 280;
        int endY = 280;
        
        g.drawRect(startX, startY, endX, endY);
        
        startX += 30;
        startY += 30;
        
        endX += 30;
        endY += 30;
        
        g.setColor(Color.RED);
        g.drawRect(startX, startY, endX, endY);
    }
}
