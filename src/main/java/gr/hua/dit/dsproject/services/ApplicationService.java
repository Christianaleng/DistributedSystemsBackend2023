package gr.hua.dit.dsproject.services;

import gr.hua.dit.dsproject.entities.Application;
import gr.hua.dit.dsproject.entities.Student;
import gr.hua.dit.dsproject.entities.Teacher;
import gr.hua.dit.dsproject.repositories.ApplicationRepository;
import gr.hua.dit.dsproject.repositories.StudentRepository;
import gr.hua.dit.dsproject.repositories.TeacherRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public Application save(Application application) {
        return applicationRepository.save(application);
    }

    public List<Application> findAll() {
        return applicationRepository.findAll();
    }

    public Application findById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }

    public Application update(Application application) {
        return applicationRepository.save(application);
    }

    public void delete(Long id) {
        applicationRepository.deleteById(id);
    }
}
