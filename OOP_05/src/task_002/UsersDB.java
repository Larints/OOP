package task_002;

import java.io.File;
import java.io.IOException;

public class UsersDB {

    private static UsersDB instance;

    UsersDB() {
        try {
            File file = new File("usersdb");
            if (file.createNewFile()) {
                System.out.println("Файл успешно создан.");
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

