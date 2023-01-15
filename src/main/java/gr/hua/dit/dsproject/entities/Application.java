package gr.hua.dit.dsproject.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "applications")
public class Application {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bachelorDegreeTitle")
    private String bachelorDegreeTitle;

    @Column(name = "bachelorDegreeGrade")
    private String bachelorDegreeGrade;
    @Column(name = "teachers")
    private String teachers;

    @ManyToMany(fetch=FetchType.LAZY,
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name="application_student",
            joinColumns=@JoinColumn(name="application_id"),
            inverseJoinColumns=@JoinColumn(name="student_id"))
    private List<Student> students;

    @ManyToMany
    @JoinTable(
            name = "application_teacher",
            joinColumns = @JoinColumn(name = "application_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    private List<Teacher> teacher;
    private int priorityNumber;
    private boolean accepted;
    public Application(Student student, String bachelorDegreeTitle, double bachelorDegreeGrade, List<Teacher> teachers) {

    }

    public Application() {
    }

    public Application(String bachelorDegreeTitle, String bachelorDegreeGrade, String teachers) {
        this.bachelorDegreeTitle = bachelorDegreeTitle;
        this.bachelorDegreeGrade = bachelorDegreeGrade;
        this.teachers = teachers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBachelorDegreeTitle() {
        return bachelorDegreeTitle;
    }

    public void setBachelorDegreeTitle(String bachelorDegreeTitle) {
        this.bachelorDegreeTitle = bachelorDegreeTitle;
    }

    public String getBachelorDegreeGrade() {
        return bachelorDegreeGrade;
    }

    public void setBachelorDegreeGrade(String bachelorDegreeGrade) {
        this.bachelorDegreeGrade = bachelorDegreeGrade;
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Application{" +
                "bachelorDegreeTitle='" + bachelorDegreeTitle + '\'' +
                ", bachelorDegreeGrade='" + bachelorDegreeGrade + '\'' +
                ", teachers='" + teachers + '\'' +
                '}';
    }

    public void setPriorityNumber(int priorityNumber) {
    }

    public void setAccepted(boolean b) {
    }
}
