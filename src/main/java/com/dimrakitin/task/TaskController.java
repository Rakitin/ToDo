package com.dimrakitin.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TaskController {
    
    private final TaskService taskService;
    
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    
    @GetMapping(path = "/task")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping(path = "/task")
    public void addNewTask(@RequestBody Task task) {
        taskService.addNewTask(task);
    }
    
}
