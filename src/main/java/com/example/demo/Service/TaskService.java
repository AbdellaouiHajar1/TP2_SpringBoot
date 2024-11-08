package com.example.demo.Service;

import com.example.demo.Entité.Task;
import com.example.demo.Repositories.TaskRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Service

public class TaskService {
@Autowired
    TaskRepository taskRepository;


    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id){
        Optional<Task> T = taskRepository.findById(id);
        if(T.isPresent()){
            return T.get();
        }
        else {
            return null;
        }
    }

    public Task updateTask(Long id, Task updatedTask){
        Optional<Task> T = taskRepository.findById(id);
        if(T.isPresent()){
            Task l= T.get();
            l.setDescription(updatedTask.getDescription());
            l.setDate_création(updatedTask.getDate_création());
            l.setDate_échéance(updatedTask.getDate_échéance());
            return taskRepository.save(l);

        }
        else {
            return null;
        }
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
