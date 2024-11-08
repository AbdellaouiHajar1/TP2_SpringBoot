package com.example.demo.Controller;

import com.example.demo.Entité.Task;
import com.example.demo.Service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
@Autowired
    TaskService taskService;
    @PostMapping("/Createtask")
    public Task createTaskService(@Valid @RequestBody Task task) {
        return taskService.createTask(task);
    }
    @GetMapping("/allTasks")
    public List<Task> allTaskService() {
        return taskService.getAllTasks();
    }
    @GetMapping("/task/{id}")
    public Task TaskServicebyid(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }
    @PutMapping("/updateTask/{id}")
    public Task modTaskService(@PathVariable Long id,@Valid @RequestBody Task task) {
        return taskService.updateTask(id,task);
    }
    @DeleteMapping("/deleteTask/{id}")
    public void deleteTaskService(@PathVariable Long id) {
      taskService.deleteTask(id);
    }
}
