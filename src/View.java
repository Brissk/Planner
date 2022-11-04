import java.util.ArrayList;

class View {


    public View() {

    }

    void showTasks(ArrayList<Task> tasks) {
        for (Task t:tasks) {
            System.out.println(t);

        }
    }

}
