package cl.acl.jdiazl.department.repositories;

import cl.acl.jdiazl.department.models.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
