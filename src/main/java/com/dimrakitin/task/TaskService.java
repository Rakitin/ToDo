package com.dimrakitin.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskService {
    
    private final TaskRepository taskRepository;
    
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    public List<Task> getTasks() {
        // List<Task> tasks = new ArrayList<Task>();
        // tasks.add(new Task(1L, "wash the dishes", false));
        // tasks.add(new Task(2L, "read the book", false));
        // return tasks;
        
        return taskRepository.findAll();
    }

    public void addNewTask(Task task) {
    }

}
