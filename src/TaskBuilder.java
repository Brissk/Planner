public class TaskBuilder{
    Integer id;
    private String authorName;
    private String textOfTask;
    private String addDate;
    private String deadLineDate;
    private Priority priority;

    public TaskBuilder () {
        super();
    }

    public TaskBuilder setId(Integer id) {
        this.id = id;
        return this;
    }
    public TaskBuilder setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public TaskBuilder setTextOfTask(String textOfTask) {
        this.textOfTask = textOfTask;
        return this;
    }
    public TaskBuilder setAddDate(String addDate) {
        this.addDate = addDate;
        return this;
    }
    public TaskBuilder setDeadLineDate(String deadLineDate) {
        this.deadLineDate = deadLineDate;
        return this;
    }
    public TaskBuilder setPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    public Task createTask() {
        Task task = new Task(id, authorName, textOfTask, addDate, deadLineDate, priority);
        if (task.doQualityCheck()) return task;
        else throw new RuntimeException("There is no tasks");
    }
}