package com.dimrakitin.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TaskService {
    public List<Task> getTasks() {
        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task(1L, "wash the dishes", false));
        tasks.add(new Task(2L, "read the book", false));
        return tasks;
    }

}
