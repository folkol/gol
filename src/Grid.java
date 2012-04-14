import java.awt.Button;
import java.awt.Canvas;
import java.awt.Graphics;

public class Grid extends Canvas {
    private CellKlump cellKlump;
    private Button button;

    Grid() {
        setSize(100, 100);
    }

    public void paint(Graphics g) {
        //g.clipRect(100, 100, 200, 200);
        //button.setVisible(false);
        arrangeCells(g);
        //button.setVisible(true);
    }

    public void setCellKlump(CellKlump cellKlump) {
        this.cellKlump = cellKlump;
    }

    private void arrangeCells(Graphics g) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 100; i++) {
            for (int k = 0; k < 100; k++) {
                Cell currentCell = cellKlump.getCell(i, k);
                int size = currentCell.getSize();
                if (currentCell.isAlive()) {
                    g.fillRect(x, y, size, size);
                }
                else{
                    g.drawRect(x, y, size, size);
                }
                x = x + 5;
            }
            x = 0;
            y = y + 5;
        }
    }

    public void setButton(Button button) {
        this.button = button;

    }

}