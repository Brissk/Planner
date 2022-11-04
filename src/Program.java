import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Presenter p = new Presenter(new Model(), new View());
        p.fillPlanner();
        p.showAllTasks();
        p.exportingTasks();

    }
}
