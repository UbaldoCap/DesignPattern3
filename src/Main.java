public class Main {
    private static User user;
    public static User getUser() {
        if (user==null) {
            user = new User();
        }
        return user;
    }
    public static void main(String[] args) {
        User user1 = getUser();
        user1.stampaDettagli();
        User user2 = getUser();
        user2.setNome("Marco");
        user2.setEta(24);
        user2.stampaDettagli();
    }
}
