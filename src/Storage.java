import java.io.*;
import java.util.ArrayList;


public class Storage {
    private String name = "planner.csv";
    private File file;
    public Storage () throws IOException {
        file = new File(this.name);
        file.createNewFile();
    }

    public void myExport(Planner planner) throws IOException {
        FileWriter fw = new FileWriter(this.name);
        fw.write(serialize(planner.tasks));
        fw.close();
    }

    public String serialize(ArrayList<Task> tasks) {
        StringBuilder csv = new StringBuilder();
        csv.append("id ").append("authorName ").append("textOfTask ").append("addDate ").append("deadLineDate ").append("priority ").append(";").append("\n");

        for (Task c : tasks) {
            csv.append(c.getId()).append("\t")
                    .append(c.getAuthorName()).append("\t")
                    .append(c.getTextOfTask()).append("\t")
                    .append(c.getAddDate()).append("\t")
                    .append(c.getDeadLineDate()).append("\t")
                    .append(c.getPriority()).append("\n");
        }

        return csv.toString();
    }
}