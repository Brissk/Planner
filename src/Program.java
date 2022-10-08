public class Program {
    public static void main(String[] args) {
        Planner planner1 = new Planner();
        User user1 = new User("Иван Петров");
        planner1.addTusk("Посмотреть фильм",Priority.LOW);
        planner1.addTusk("Отдохнуть наконец-то",Priority.LOW);
        planner1.addTusk("Сходить в магазин",Priority.MEDIUM);
        planner1.addTusk("Поговорить с женой",Priority.MEDIUM);
        planner1.addTusk("Сделать домашку",Priority.HIGH);
        planner1.addTusk("Посмотреть лекцию",Priority.HIGH);

//        planner1.showAllTusks();
        planner1.showLowTusks();
    }
}
