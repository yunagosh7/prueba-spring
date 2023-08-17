package com.yunagosh.pruebasping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@CrossOrigin(origins = "*")
@Controller
public class MainController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private TasksRepository tasksRepository;

//    @Autowired
//    private UsersTasksRepository usersTasksRepository;

    @PostMapping(path = "/user")
    public @ResponseBody String addNewUser(
            @RequestParam String name,
            @RequestParam String email
    ) {
        User newUser = new User();
        newUser.setEmail(email);
        newUser.setName(name);
        int min = 50;
        int max = 1000000;
        Integer id = new Random().nextInt((max - min) + 1) + min;
        newUser.setId(id);
        usersRepository.save(newUser);
        return "Saved";
    }

    @PostMapping(path = "/task")
    public @ResponseBody String addNewTask(
            @RequestParam String name,
            @RequestParam Integer id_user
    ) {
        Task newTask = new Task();
        newTask.setName(name);
        newTask.setIdUser(id_user);
        tasksRepository.save(newTask);
        return "saved";

    }



    @GetMapping(path = "/users")
    public @ResponseBody Iterable<User> getAllUser() {
        return usersRepository.findAll();
    }

    @GetMapping(path = "/tasks")
    public @ResponseBody Iterable<Task> getAllTasks() {
        return tasksRepository.findAll();
    }

    @GetMapping(path = "/users/{email}")
    public @ResponseBody User getUserByEmail(@PathVariable String email) {
        return usersRepository.getUserByEmail(email);
    }

//    @GetMapping(path = "/userstasks")
//    public Iterable<UserTask> getAllUsersTasks() {
//        return usersTasksRepository.getAllUsersTasks();
//    }


}
