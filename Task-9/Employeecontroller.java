package com.example.task9.controller;

import com.example.task9.model.Employee;
import com.example.task9.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        model.addAttribute("title", "Employee List");
        return "employee-list";
    }

    @GetMapping("/{id}")
    public String getEmployee(@PathVariable int id, Model model) {
        employeeService.getById(id).ifPresent(e -> model.addAttribute("employee", e));
        return "employee-detail";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees";
    }
}
