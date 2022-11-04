import java.io.IOException;
import java.util.ArrayList;

class Model {
    Task task;
    Planner planner;
    IdGenerator idgen;
    Storage storage;

    public Model() throws IOException {
        planner = new Planner();
        idgen = new IdGenerator();
        storage = new Storage();
    }

    public Planner fillPlanner() {
        TaskBuilder tb = new TaskBuilder();
        planner.tasks.add(tb.setId(idgen.setId()).setAuthorName("Mikle").setTextOfTask("Посмотреть фильм").setAddDate("04.11.22").setDeadLineDate("05.11.22").setPriority(Priority.LOW).createTask());
        planner.tasks.add(tb.setId(idgen.setId()).setAuthorName("Kate").setTextOfTask("Посмотреть лекцию").setAddDate("23.10.22").setDeadLineDate("05.11.22").setPriority(Priority.HIGH).createTask());
        planner.tasks.add(tb.setId(idgen.setId()).setAuthorName("Ann").setTextOfTask("Отдохнуть наконец-то").setAddDate("01.01.22").setDeadLineDate("05.11.22").setPriority(Priority.LOW).createTask());
        planner.tasks.add(tb.setId(idgen.setId()).setAuthorName("Fill").setTextOfTask("Сходить в магазин").setAddDate("14.05.22").setDeadLineDate("05.11.22").setPriority(Priority.MEDIUM).createTask());
        planner.tasks.add(tb.setId(idgen.setId()).setAuthorName("Nik").setTextOfTask("Поговорить с женой").setAddDate("24.08.22").setDeadLineDate("05.11.22").setPriority(Priority.MEDIUM).createTask());
        planner.tasks.add(tb.setId(idgen.setId()).setAuthorName("Angel").setTextOfTask("Сделать домашку").setAddDate("09.02.22").setDeadLineDate("05.11.22").setPriority(Priority.HIGH).createTask());

        return planner;
    }

    public ArrayList<Task> getListOfTasks (){
        return planner.getList();
    }

    public void myOwnExport() throws IOException {
        storage.myExport(planner);
    }

}
