package com.company.todoapp.repository;

import com.company.todoapp.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ITodoJPARepository  extends JpaRepository<Todo, Integer>{
    public Optional<List<Todo>> findByTitle(String title);
}
