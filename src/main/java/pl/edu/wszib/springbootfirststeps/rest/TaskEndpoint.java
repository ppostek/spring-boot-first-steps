package pl.edu.wszib.springbootfirststeps.rest;

import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springbootfirststeps.configurationproperties.TaskConfigurationProperties;

import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskEndpoint {
    private final TaskConfigurationProperties taskConfigurationProperties;

    public TaskEndpoint(TaskConfigurationProperties taskConfigurationProperties) {
        this.taskConfigurationProperties = taskConfigurationProperties;
    }

    // @PathVariable
    // @RequestParam()
    // @RequestBody
    @GetMapping("/{id}")
    public void getTaskById(
            @PathVariable String id,
            @RequestParam(required = false) String name) {
        if (taskConfigurationProperties.enabled()) {
            System.out.println("Id = " + id);
            System.out.println("name = " + name);
            System.out.println(UUID.randomUUID());
        } else {
            throw new IllegalArgumentException("Tasks are disabled.");
        }
    }

    @PostMapping
    public Task createTask(@RequestBody CreateTask task) {
        System.out.println(task);
        return new Task(UUID.randomUUID(), "Test");
    }

    @PutMapping("/{id}")
    public void updateTask(
            @PathVariable String id,
            @RequestBody Task task) {
        System.out.println(task);
    }

    public record CreateTask(String name) {
    }

    public record Task(UUID id, String name) {
    }


}
