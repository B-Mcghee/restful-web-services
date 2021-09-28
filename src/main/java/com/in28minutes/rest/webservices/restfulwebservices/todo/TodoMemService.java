package com.in28minutes.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class TodoMemService {
    private static List<Todo> todos = new ArrayList();
    private static long idCounter = 0;
    static {
        todos.add(new Todo(++idCounter, "bmcghee", "learn to dance", new Date(), false));
        todos.add(new Todo(++idCounter, "bmcghee", "learn about Microservices", new Date(), false));
        todos.add(new Todo(++idCounter, "bmcghee", "learn to about React", new Date(), false));
    }

    public List<Todo> findAll(){
        return todos;
    }
    public Todo getTodo(long id){
        return findById(id);
    }
    public Todo deleteTodo(long id){
        Todo todo = findById(id);
        todos.remove(todo);
        return todo;
    }

    private Todo findById(long id) {
        for(Todo todo: todos){
            if(todo.getId() == id){
                return todo;
            }

        }

//        if(todos.stream().filter(todo -> todo.getId() == id).findFirst().isPresent()){
//
//        }
        return null;
    }
}
