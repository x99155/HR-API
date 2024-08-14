package com.process.hr.service;

import com.process.hr.model.Employee;
import com.process.hr.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void create(Employee employee) {
        this.employeeRepository.save(employee);
    }

    public Employee getAnEmployee(final Long id) {
        Optional<Employee> employee = this.employeeRepository.findById(id);
        return employee.orElse(null);
    }

    public List<Employee> getAllEmployee() {
        return this.employeeRepository.findAll();
    }

    public Employee updateAnEmployee(Employee employee, Long id) {
        Optional<Employee> e = this.employeeRepository.findById(id);
        if (e.isPresent()) {
            Employee currentEmployee = e.get();

            String firstName = employee.getFirstName();
            if (firstName != null) {
                currentEmployee.setFirstName(firstName);
            }

            String lastName = employee.getLastName();
            if (lastName != null) {
                currentEmployee.setLastName(lastName);
            }

            String email = employee.getEmail();
            if (email != null) {
                currentEmployee.setEmail(email);
            }

            String password = employee.getPassword();
            if (password != null) {
                currentEmployee.setPassword(password);
            }

            employeeRepository.save(currentEmployee);
            return currentEmployee;
        } else {
            return null;
        }
    }

    public void deleteAnEmployee(Long id) {
        this.employeeRepository.deleteById(id);
    }
}
