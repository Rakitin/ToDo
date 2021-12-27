package com.dimrakitin.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TaskController {
    
    @GetMapping(path = "api/v1/task")
    public List<Task> getTasks() {
        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task(1L, "wash the dishes", false));
        tasks.add(new Task(2L, "read the book", false));
        return tasks;
    }

}
