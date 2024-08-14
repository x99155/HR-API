package com.process.hr.controller;

import com.process.hr.model.Employee;
import com.process.hr.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping()
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * Create - Add a new employee
     * @param employee An object employee
     * @return The employee object saved
     */
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/employee", consumes = APPLICATION_JSON_VALUE)
    public void create(@RequestBody Employee employee) {
        this.employeeService.create(employee);
    }

    /**
     * Read - Get one employee
     * @param id The id of the employee
     * @return An Employee object full filled
     */
    @GetMapping(value = "/employee/{id}", produces = APPLICATION_JSON_VALUE)
    public Employee getEmployee(@PathVariable("id") final Long id) {
        return this.employeeService.getAnEmployee(id);
    }


    /**
     * Read - Get all employees
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping(value = "/employees", produces = APPLICATION_JSON_VALUE)
    public List<Employee> getEmployees() {
        return this.employeeService.getAllEmployee();
    }


    /**
     * Update - Update an existing employee
     * @param id - The id of the employee to update
     * @param employee - The employee object updated
     * @return
     */
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @PutMapping(value = "/employee/{id}", consumes = APPLICATION_JSON_VALUE)
    public Employee update(@PathVariable("id") final Long id, @RequestBody Employee employee) {
        return this.employeeService.updateAnEmployee(employee, id);
    }

    /**
     * Delete - Delete an employee
     * @param id - The id of the employee to delete
     */
    @ResponseStatus(value = HttpStatus.OK)
    @DeleteMapping(value = "/employee/{id}")
    public void delete(@PathVariable("id") final Long id) {
        this.employeeService.deleteAnEmployee(id);
    }
}
