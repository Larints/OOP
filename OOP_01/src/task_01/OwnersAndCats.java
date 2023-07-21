package task_01;

public class OwnersAndCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Тотошка");
        cat1.setAge(10);
        cat1.setOwnerName("Мишка");
        System.out.println(cat1.greetings());

    }
}
