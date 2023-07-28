package zerobase.weatherpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
public class WeatherpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherpracticeApplication.class, args);
	}

}
