package task_04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DataContainer<String> stringdatacontainer = new DataContainer<>(new ArrayList<>()); // Создаем экземпляр
        stringdatacontainer.addValue("L"); // Добавляем значение
        stringdatacontainer.addValue("OO");
        stringdatacontainer.addValue("OOO");
        stringdatacontainer.addValue("OOOO");
        stringdatacontainer.addValue("OOOPS");
        System.out.println(stringdatacontainer.getValue(0)); // Реализация метода получения значения по индексу
        stringdatacontainer.printData(); // Реализация метода вывода массива на экран
        System.out.println();
        stringdatacontainer.sort((str1,str2) -> str2.compareTo(str1)); // Сортировка в обратном порядке
        stringdatacontainer.printData();

    }
}