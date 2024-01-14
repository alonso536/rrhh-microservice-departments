package cl.acl.jdiazl.department.repositories;

import cl.acl.jdiazl.department.models.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
