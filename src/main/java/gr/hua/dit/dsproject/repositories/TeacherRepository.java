package gr.hua.dit.dsproject.repositories;

import gr.hua.dit.dsproject.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // Custom query methods go here
}
