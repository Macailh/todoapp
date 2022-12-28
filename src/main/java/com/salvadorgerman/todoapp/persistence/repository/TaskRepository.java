package com.salvadorgerman.todoapp.persistence.repository;

import com.salvadorgerman.todoapp.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository extends JpaRepository<Task, Long> {
}
