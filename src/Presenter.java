import java.io.IOException;

class Presenter {
    Model m;
    View v;

    public Presenter(Model m, View v) {
        this.m = m;
        this.v = v;
    }

    void fillPlanner() {
        m.fillPlanner();
    }
    void showAllTasks() {
        v.showTasks(m.getListOfTasks());
    }

    void exportingTasks() throws IOException {
        m.myOwnExport();
    }
}
