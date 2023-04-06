package am.aca.springbootapp.school;

import lombok.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Value
@Scope("prototype")
public class Student {

    @org.springframework.beans.factory.annotation.Value("${stanford.student.name}")
    String name;

    @org.springframework.beans.factory.annotation.Value("${stanford.student.age}")
    int age;
}
