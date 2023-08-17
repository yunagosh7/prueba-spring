package com.yunagosh.pruebasping;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT * FROM users u WHERE u.email = ?1", nativeQuery = true)
    public User getUserByEmail(String email);

//    @Query(value = "SELECT t.task_name, u.name, u.email FROM tasks t INNER JOIN users u ON t.id_user = u.id_user", nativeQuery = true)
//    public List<UserTask> getUsersTasks();

//    @Query(value = "SELECT t.task_name, u.name, u.email FROM tasks t INNER JOIN users u ON t.id_user = u.id_user  WHERE t.id_user = ?1", nativeQuery = true)
//    public List<UserTask> getUsersTasksByUsername(String username);

}
