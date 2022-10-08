import java.util.ArrayList;

class Planner {
    String tusk;
    ArrayList<String> tusks;
    protected ArrayList<String> tusksOfLow;
    protected ArrayList<String> tusksOfMedium;
    protected ArrayList<String> tusksOfHigh;

    Planner() {
        tusks = new ArrayList<>();
        tusksOfLow = new ArrayList<>();
        tusksOfMedium = new ArrayList<>();
        tusksOfHigh = new ArrayList<>();
    }

    public void addTusk(String tusk,Priority priority){
        if(priority == Priority.LOW){
            tusksOfLow.add(tusk);
            tusks.add(tusk);
        }
        else if(priority == Priority.MEDIUM){
            tusksOfMedium.add(tusk);
            tusks.add(tusk);
        }
        else if(priority == Priority.HIGH){
            tusksOfHigh.add(tusk);
            tusks.add(tusk);
        }
    }
    void showAllTusks() {
        for (String t: tusks
        ) {
            System.out.println(t);
        }
    }
    void showLowTusks() {
        for (String t: tusksOfLow
        ) {
            System.out.println(t);
        }
    }
    void showMediumTusks() {
        for (String t: tusksOfMedium
        ) {
            System.out.println(t);
        }
    }
    void showHighTusks() {
        for (String t: tusksOfHigh
        ) {
            System.out.println(t);
        }
    }


}
