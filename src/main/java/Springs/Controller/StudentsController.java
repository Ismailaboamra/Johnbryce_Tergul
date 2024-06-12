package Springs.Controller;

import Springs.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan("Springs.Service")
public class StudentsController {


    @Autowired
    StudentService studentService;





    @RequestMapping(value = "/isStudentExist/{name}",method = RequestMethod.GET)
    @ResponseBody
    public Boolean isStudentExist(@PathVariable("name") String name){
        return studentService.isStudentExist(name);
    }

    @RequestMapping("/countStudents")
    public Integer countStudents(){
        System.out.println("Starting count students => "+studentService.getCountStudents());
        return studentService.getCountStudents();
    }
    @RequestMapping("/Name")
    public String schoolName(){
        System.out.println("School X");
        return "School X";
    }
    @RequestMapping("/StudentsNames")
    public List<String>StudentsNames(){

        System.out.println("Names is => "+studentService.getNames().toString());
        return studentService.getNames();
    }
}
