import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("aaa", OffsetDateTime.parse("2024-02-02T10:15:30+01:00"), false);
        Task task2 = new Task("jdd", OffsetDateTime.parse("2024-02-01T10:15:30+01:00"), false);
        Task task3 = new Task("ooo", OffsetDateTime.parse("2024-02-04T10:15:30+01:00"), false);
        ToDoList toDoList1 = new ToDoList();
        toDoList1.addTask(task1);
        toDoList1.addTask(task2);
        toDoList1.addTask(task3);
        toDoList1.stampaList();
        toDoList1.taskCompletato(task1);
        System.out.println();
        toDoList1.stampaList();
        System.out.println();
        toDoList1.stampaDettagliTramiteId(2);
        System.out.println();
        toDoList1.stampaTaskDueGiorni();
    }
}
