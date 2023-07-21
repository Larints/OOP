package task_02;

public interface IQueueBehavior {

    /**
     * Этот метод отображает текущий статус очереди
     */
    void checkQueueStatus();

    /**
     * Этот метод позволяет добавить человека в очередь
     */
    void putPerson(String person);

    /**
     * Этот метод убирает человека из очереди
     */
    void removePerson(String person);

}
