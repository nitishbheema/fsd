
package com.example.task9.service;
 
import com.example.task9.model.Employee;
import org.springframework.stereotype.Service;
import java.util.*;
 
@Service
public class EmployeeService {
    private final List<Employee> store = new ArrayList<>();
    private int counter = 1;
 
    public EmployeeService() {
        store.add(new Employee(counter++, "Alice Johnson", "Engineering", 75000));
        store.add(new Employee(counter++, "Bob Smith", "Marketing", 55000));
        store.add(new Employee(counter++, "Carol White", "HR", 50000));
    }
 
    public List<Employee> getAllEmployees() { return new ArrayList<>(store); }
 
    public Optional<Employee> getById(int id) {
        return store.stream().filter(e -> e.getId() == id).findFirst();
    }
 
    public Employee save(Employee e) {
        e.setId(counter++);
        store.add(e);
        return e;
    }
}
 
