package com.red.SMS;

import com.red.SMS.Entity.Student;
import com.red.SMS.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Edward", "Silvers", "edwardsilvers89@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Jean", "Luc", "jl@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Jimmy", "Johns", "JJ@gmail.com");
		studentRepository.save(student3);*/
	}

}
