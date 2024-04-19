package com.pdev.springboot.firstWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    // it is used to manage the static list of todos
    private static List<Todo> todos = new ArrayList<>(); // initialized the list to escape from
    // null point exception

    private static int todoCount =0;
;
    static {
        todos.add(new Todo(++todoCount, "pdev", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoCount, "pdev", "Learn Cloud", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todoCount, "pdev", "Learn React", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }

    public void adddTodo(String username, String description, LocalDate targetDate, boolean done){
        Todo todo = new Todo(++todoCount, username, description, targetDate, done);
        todos.add(todo);
    }

}
