package com.karan.tasktracker.repository;

import com.karan.tasktracker.entity.Task;
import com.karan.tasktracker.enums.TaskStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepo extends JpaRepository<Task , Long> {
    Page<Task> findByStatus(TaskStatus status, Pageable pageable);
}
