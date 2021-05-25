//package com.apress.todo.controller;
//
//import com.apress.todo.domain.ToDo;
//import com.apress.todo.repository.ToDoRepository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//@RestController
//public class ToDoController {
//
//    private ToDoRepository toDoRepository;
//
//    public ToDoController(ToDoRepository toDoRepository) {
//        this.toDoRepository = toDoRepository;
//    }
//
//    @GetMapping("/todo/{id}")
//    public Mono<ToDo> getToDo(@PathVariable String id) {
//        return this.toDoRepository.findById(id);
//    }
//
//    @GetMapping("/todo")
//    public Flux<ToDo> getToDos() {
//        return this.toDoRepository.findAll();
//    }
//
//}
