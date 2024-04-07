package pl.edu.wszib.springbootfirststeps.rest;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskEndpoint {

    // @PathVariable
    // @RequestParam()
    // @RequestBody
    @GetMapping("/{id}")
    public void getTaskById(
            @PathVariable String id,
            @RequestParam(required = false) String name) {
        System.out.println("Id = " + id);
        System.out.println("name = " + name);
        System.out.println(UUID.randomUUID());
    }

    @PostMapping
    public Task createTask(@RequestBody String task) {
        System.out.println(task);
        return new Task(UUID.randomUUID(), "Test");
    }

    public record Task(UUID id, String name) {}


}
