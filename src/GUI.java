public class GUI  implements Runnable {

    private String title;

    private GUI() {/* prevent uninitialized instances */}
    public GUI(String title) {
        this.title = title;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        new MainWindow(title);
    }
}
