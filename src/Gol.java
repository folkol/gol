public class Gol {
    public static void main(String[] args) {
        new Gol().run();
    }

    void run() {
        CellKlump cellKlump = new CellKlump();

        // Set game stat
        cellKlump.getCell(37, 35).setAlive(true);
        cellKlump.getCell(35, 35).setAlive(true);
        cellKlump.getCell(34, 35).setAlive(true);
        cellKlump.getCell(33, 35).setAlive(true);

        cellKlump.getCell(33, 36).setAlive(true);

        cellKlump.getCell(37, 37).setAlive(true);
        cellKlump.getCell(36, 37).setAlive(true);

        cellKlump.getCell(37, 38).setAlive(true);
        cellKlump.getCell(35, 38).setAlive(true);
        cellKlump.getCell(34, 38).setAlive(true);

        cellKlump.getCell(37, 39).setAlive(true);
        cellKlump.getCell(35, 39).setAlive(true);
        cellKlump.getCell(33, 39).setAlive(true);

        Gui gui = new Gui();
        gui.launchFrame(cellKlump);
        while (true) {
            cellKlump = new CellKlump(cellKlump);
            gui.getGrid().setCellKlump(cellKlump);
            gui.reDraw();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
