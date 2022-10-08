import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class DataStorage extends Planner{
    String addDate;
    String addTime;
    String endTime;


    String path = "data";
    File file = new File(path);
    PrintWriter pw;
    {
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.printf("%d %s",User.id, User.fullName);
        pw.close();
    }


}
