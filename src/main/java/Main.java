public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Пётр";
        post.patronymic = "Петрович";
        post.surname = "Петров";
        post.phone = "+7 999 999 99 99";
        post.subscription = "true";


        post.birthday = new FormDate();
        post.birthday.day = 12;
        post.birthday.month = 9;
        post.birthday.year = 1985;
    }
}
