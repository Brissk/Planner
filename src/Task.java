import java.util.ArrayList;

class Task {
    Integer id;
    private String authorName;
    private String textOfTask;
    private String addDate;
    private String deadLineDate;
    Priority priority;

    public Task(Integer id, String authorName, String textOfTask, String addDate, String deadLineDate, Priority priority) {
        this.id = id;
        this.authorName = authorName;
        this.textOfTask = textOfTask;
        this.addDate = addDate;
        this.deadLineDate = deadLineDate;
        this.priority = priority;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id + " ").append(authorName + " ").append(textOfTask + " ").append(addDate + " ").append(deadLineDate + " ").append(priority);
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }
    public String getAuthorName() {
        return authorName;
    }

    public String getTextOfTask() {
        return textOfTask;
    }

    public String getAddDate() {
        return addDate;
    }

    public String getDeadLineDate() {
        return deadLineDate;
    }

    public Priority getPriority() {
        return priority;
    }

    protected Boolean doQualityCheck() {
        if (this.deadLineDate != null) return true;
        else return false;
    }
}

