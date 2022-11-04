import java.util.ArrayList;

class Planner {
    public ArrayList<Task> tasks;

    Planner() {
        tasks = new ArrayList<>();
    }

    void addTask(Task task) {
        tasks.add(task);
    }

    ArrayList<Task> getList(){
        return tasks;
    }
}
