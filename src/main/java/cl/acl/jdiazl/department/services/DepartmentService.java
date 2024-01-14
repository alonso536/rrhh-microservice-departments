package cl.acl.jdiazl.department.services;

import cl.acl.jdiazl.department.models.entities.Department;
import cl.acl.jdiazl.department.models.entities.Job;

import java.util.List;

public interface DepartmentService {
    List<Department> findDepartments();
    List<Job> findJobs();
}
