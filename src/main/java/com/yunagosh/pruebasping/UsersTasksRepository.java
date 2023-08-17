package com.yunagosh.pruebasping;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersTasksRepository extends CrudRepository<UserTask, Integer> {
//    @Query(value = "SELECT t.task_name, u.name, u.email FROM tasks t INNER JOIN users u ON t.id_user = u.id_user",nativeQuery = true)
//    public List<UserTask> getAllUsersTasks();
}
