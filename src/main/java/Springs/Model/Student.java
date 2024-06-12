package Springs.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Integer avg;
    private String Name;

    public Student() {
    }

    public Student(String name,Integer avg) {
        this.Name = name;
        this.avg = avg;
    }
}
