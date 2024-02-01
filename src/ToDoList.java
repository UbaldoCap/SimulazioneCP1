import java.time.OffsetDateTime;
import java.util.ArrayList;

public class ToDoList {
    private final ArrayList<Task> taskArrayList;

    public ToDoList() {
        this.taskArrayList = new ArrayList<>();
    }

    public ArrayList<Task> getTaskArrayList() {
        return taskArrayList;
    }

    public void addTask(Task task) {
        if (taskArrayList.contains(task)) {
            System.out.println("Task già inserito");
        } else {
            taskArrayList.add(task);
        }
    }

    public void removeTask(Task task) {
        if (taskArrayList.contains(task)) {
            taskArrayList.add(task);
        } else {
            System.out.println("Task non presente");
        }
    }

    public void stampaList() {
        for (Task task : taskArrayList) {
            task.stampaDettagli();
        }
    }

    public void taskCompletato(Task task) {
        for (Task task1 : taskArrayList) {
            if (task1.equals(task)) {
                task.setIscompleto(true);
                break;
            }
        }
    }

    public void stampaDettagliTramiteId(Integer id) {
        for (Task task : taskArrayList) {
            if (task.getId().equals(id)) {
                task.stampaDettagli();
            }
        }
    }

    public void stampaTaskDueGiorni() {
        for (Task task : taskArrayList) {
            if (task.getScadenza().isBefore(OffsetDateTime.now().plusDays(2)) && task.getScadenza().isAfter(OffsetDateTime.now())) {
                task.stampaDettagli();
            }
        }
    }
}
