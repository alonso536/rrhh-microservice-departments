package cl.acl.jdiazl.department.controllers;

import cl.acl.jdiazl.department.models.entities.Department;
import cl.acl.jdiazl.department.models.entities.Job;
import cl.acl.jdiazl.department.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getDepartments() {
        return departmentService.findDepartments();
    }

    @GetMapping("/jobs")
    public List<Job> getJobs() {
        return departmentService.findJobs();
    }
}
