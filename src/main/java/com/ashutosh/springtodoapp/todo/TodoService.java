package com.ashutosh.springtodoapp.todo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static{
        todos.add(new Todo(1, "ashutosh","Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "vinod","Learn Aml", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(3, "abhay","Learn Devops", LocalDate.now().plusYears(1), false));

    }

    public List<Todo> findByUsername(String username){
        return todos;
    }
}
