package com.karan.tasktracker.repository;

import com.karan.tasktracker.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends JpaRepository<Task , Long> {
    List<Task> findByStatus(String status);
}
