import java.awt.Canvas;
import java.awt.Graphics;


public class Grid extends Canvas {
    Grid(){
        setSize(100, 100);
    }
    public void paint(Graphics g){
        int x = 100;
        int a = 0;
        int b = 0;
        int c = 500;
        int d = 0;
        int e = 0;
        int f = 0;
        int g2 = 0;
        int h = 500;

        for(int i = 0; i < x; i++){
            g.drawLine(a, b, c, d);
            a = a + 0;
            b = b + 5;
            c = c + 0;
            d = d + 5;
        }
        for(int i = 0; i < x; i++){
            g.drawLine(e, f, g2, h);
            e = e + 5;
            f = f + 0;
            g2 = g2 + 5;
            h = h + 0;
        }
    }
}