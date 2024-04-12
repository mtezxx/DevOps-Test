package via.doc1.ex8.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TeamMemberTest {

    @Test
    public void ctorTest() {
        List<Task> tasks = Arrays.asList(new Task("Task1", "Task Name", "Task Description"));
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", tasks);

        assertEquals("1", teamMember.getId());
        assertEquals("John Doe", teamMember.getName());
        assertEquals("john.doe@example.com", teamMember.getEmail());
        assertEquals(tasks, teamMember.getTasks());
    }

    @Test
    public void testSetters() {
        List<Task> tasks = Arrays.asList(new Task("Task1", "Task Name", "Task Description"));
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", tasks);

        // Test ID Setter
        teamMember.setId("2");
        assertEquals("2", teamMember.getId());

        // Test Name Setter
        teamMember.setName("Jane Doe");
        assertEquals("Jane Doe", teamMember.getName());

        // Test Email Setter
        teamMember.setEmail("jane.doe@example.com");
        assertEquals("jane.doe@example.com", teamMember.getEmail());

        // Test Tasks Setter
        List<Task> newTasks = Arrays.asList(new Task("Task2", "Another Task Name", "Another Task Description"));
        teamMember.setTasks(newTasks);
        assertEquals(newTasks, teamMember.getTasks());
    }

    @Test
    public void testToString() {
        List<Task> tasks = Arrays.asList(new Task("Task1", "Task Name", "Task Description"));
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", tasks);

        String expectedString = "TeamMember{id='1', name='John Doe', email='john.doe@example.com'}";
        assertEquals(expectedString, teamMember.toString());
    }
}
