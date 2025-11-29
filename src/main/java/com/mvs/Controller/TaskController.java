package com.mvs.Controller;

import com.mvs.data.Tasks;
import com.mvs.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController
{
    @Autowired
    private TaskService service;

    @PostMapping
    public Tasks saveTask(@RequestBody Tasks task)
    {
       return service.createTask(task);
    }

    @GetMapping("/{id}")
    public Tasks getTaskbyId(@PathVariable Long id)
    {
        return service.getTaskbyId(id);
    }

    @GetMapping
    public List<Tasks> getAllTasks()
    {
        return service.getAllTasks();
    }

    @PutMapping("/{id}")
    public Tasks UpdateTask(@PathVariable Long id)
    {
        return service.UpdateTask(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTask(@PathVariable Long id)
    {
          return service.deleteTask(id);
    }
}
