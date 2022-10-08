class User extends DataStorage {
    static int id;
    static String fullName;

    User(String fullName){
        this.id = Generator.number();
        this.fullName = fullName;

    }
}
