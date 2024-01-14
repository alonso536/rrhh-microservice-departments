package cl.acl.jdiazl.department.services;

import cl.acl.jdiazl.department.models.entities.Department;
import cl.acl.jdiazl.department.models.entities.Job;
import cl.acl.jdiazl.department.repositories.DepartmentRepository;
import cl.acl.jdiazl.department.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<Department> findDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public List<Job> findJobs() {
        return jobRepository.findAll();
    }
}
