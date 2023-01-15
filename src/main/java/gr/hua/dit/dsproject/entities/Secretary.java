package gr.hua.dit.dsproject.entities;

import jakarta.persistence.*;

@Entity
@Table(name="secretary")
public class Secretary {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;



    public Secretary() {

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Secretary[id=" + id + " ]";
    }
}

