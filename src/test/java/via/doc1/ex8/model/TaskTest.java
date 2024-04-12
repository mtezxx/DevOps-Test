package via.doc1.ex8.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void ctorTest() {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask = new Task(taskId, taskName, taskDesc);

        assertEquals(taskId, testTask.getId());
        assertEquals(taskName, testTask.getName());
        assertEquals(taskDesc, testTask.getDescription());
    }

    @Test
    public void testSetters() {
        Task testTask = new Task("Task1", "Original Name", "Original Description");

        // Test ID Setter
        String newId = "Task2";
        testTask.setId(newId);
        assertEquals(newId, testTask.getId());

        // Test Name Setter
        String newName = "New Task";
        testTask.setName(newName);
        assertEquals(newName, testTask.getName());

        // Test Description Setter
        String newDescription = "Do something else";
        testTask.setDescription(newDescription);
        assertEquals(newDescription, testTask.getDescription());
    }

    @Test
    public void testEquals() {
        Task task1 = new Task("Task1", "Task Name", "Task Description");
        Task task2 = new Task("Task1", "Task Name", "Task Description");
        Task task3 = new Task("Task3", "Task Name", "Task Description");

        assertEquals(task1, task2);
        assertNotEquals(task1, task3);  // Different ID should mean not equal

        // Test equality with null and other class objects
        assertNotEquals(task1, null);
        assertNotEquals(task1, new Object());
    }

    @Test
    public void testHashCode() {
        Task task1 = new Task("Task1", "Task Name", "Task Description");
        Task task2 = new Task("Task1", "Task Name", "Task Description");
        Task task3 = new Task("Task3", "Task Name", "Task Description");

        assertEquals(task1.hashCode(), task2.hashCode());
        assertNotEquals(task1.hashCode(), task3.hashCode());
    }
}
