package com.example.demo.Repositories;

import com.example.demo.Entité.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
