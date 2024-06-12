package Springs.Service;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    private List<String> names = List.of("ismael","raz","ron","max","Olga","Godin"
            ,"Karina","Marina","Another","david");


    public StudentService() {
        System.out.println("Students Service created !!");
    }

    public Integer getCountStudents(){
        return names.size();
    }

    public List<String> getNames() {
        return names;
    }

    public Boolean isStudentExist(String name){
        return names.contains(name);
    }
}
