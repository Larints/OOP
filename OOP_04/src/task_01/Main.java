package task_01;

public class Main {
    public static void main(String[] args) {
        printElement(10);
        printElement("Тотошка лучше всех!");

    }

    static <T> void printElement(T element) {
        System.out.println(element);
    }
}


