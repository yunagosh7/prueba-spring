package com.yunagosh.pruebasping;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TasksRepository  extends CrudRepository<Task, Integer> {
    @Query(value = "SELECT * FROM tasks", nativeQuery = true)
    public List<Task> getAllTasks();

}
