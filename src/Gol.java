public class Gol {
    public static void main(String[] args) {
        new Gol().run();
    }

    void run() {
        CellKlump cellKlump = new CellKlump();

        Gui gui = new Gui();
        gui.launchFrame(cellKlump);

        // Set game stat
        cellKlump.getCell(35, 2).setAlive(true);

        cellKlump.getCell(35, 3).setAlive(true);
        cellKlump.getCell(33, 3).setAlive(true);

        cellKlump.getCell(46, 4).setAlive(true);
        cellKlump.getCell(45, 4).setAlive(true);
        cellKlump.getCell(32, 4).setAlive(true);
        cellKlump.getCell(31, 4).setAlive(true);
        cellKlump.getCell(24, 4).setAlive(true);
        cellKlump.getCell(23, 4).setAlive(true);

        cellKlump.getCell(46, 5).setAlive(true);
        cellKlump.getCell(45, 5).setAlive(true);
        cellKlump.getCell(32, 5).setAlive(true);
        cellKlump.getCell(31, 5).setAlive(true);
        cellKlump.getCell(26, 5).setAlive(true);
        cellKlump.getCell(22, 5).setAlive(true);

        cellKlump.getCell(32, 6).setAlive(true);
        cellKlump.getCell(31, 6).setAlive(true);
        cellKlump.getCell(27, 6).setAlive(true);
        cellKlump.getCell(21, 6).setAlive(true);
        cellKlump.getCell(12, 6).setAlive(true);
        cellKlump.getCell(11, 6).setAlive(true);

        cellKlump.getCell(35, 7).setAlive(true);
        cellKlump.getCell(33, 7).setAlive(true);
        cellKlump.getCell(28, 7).setAlive(true);
        cellKlump.getCell(27, 7).setAlive(true);
        cellKlump.getCell(25, 7).setAlive(true);
        cellKlump.getCell(21, 7).setAlive(true);
        cellKlump.getCell(12, 7).setAlive(true);
        cellKlump.getCell(11, 7).setAlive(true);

        cellKlump.getCell(35, 8).setAlive(true);
        cellKlump.getCell(27, 8).setAlive(true);
        cellKlump.getCell(21, 8).setAlive(true);

        cellKlump.getCell(26, 9).setAlive(true);
        cellKlump.getCell(22, 9).setAlive(true);

        cellKlump.getCell(24, 10).setAlive(true);
        cellKlump.getCell(23, 10).setAlive(true);


//        cellKlump.getCell(22, 10).setAlive(true);
//        cellKlump.getCell(23, 11).setAlive(true);
//        cellKlump.getCell(24, 12).setAlive(true);
//        cellKlump.getCell(23, 12).setAlive(true);
//        cellKlump.getCell(24, 12).setAlive(true);
//        cellKlump.getCell(23, 12).setAlive(true);

        while (true) {
            cellKlump = new CellKlump(cellKlump);
            gui.getGrid().setCellKlump(cellKlump);
            gui.reDraw();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
