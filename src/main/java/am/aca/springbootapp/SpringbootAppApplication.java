package am.aca.springbootapp;

import am.aca.springbootapp.school.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class SpringbootAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootAppApplication.class, args);

		var student1 = applicationContext.getBean(Student.class);
		log.info("student-name: {}, student-age: {}", student1.getName(), student1.getAge());
		var student2 = applicationContext.getBean(Student.class);

		log.info("students are equal: {}", student1 == student2);

	}

}
