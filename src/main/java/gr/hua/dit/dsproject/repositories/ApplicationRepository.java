package gr.hua.dit.dsproject.repositories;

import gr.hua.dit.dsproject.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
