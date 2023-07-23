package task_001.interfaces;

import task_001.classes.Person;

public interface IQueueBehavior {

    /**
     * Этот метод отображает текущий статус очереди
     */
    void checkQueueStatus();

    /**
     * Этот метод позволяет добавить человека в очередь
     */
    void putPerson(Person person);

    /**
     * Этот метод убирает человека из очереди
     */
    void removePerson(Person person);

}
