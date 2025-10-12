public class StringPractice {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        checkUserName(user1,user2);
        System.out.println(user1);
        System.out.println(user2);
    }

    private static void checkUserName(String user1, String user2) {
        if(user1.equalsIgnoreCase(user2))
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
    }
}