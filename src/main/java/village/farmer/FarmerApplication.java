package village.farmer;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import village.farmer.entity.Role;
import village.farmer.repository.RoleRepository;

import java.util.Arrays;
import java.util.Date;
@SpringBootApplication
public class FarmerApplication implements CommandLineRunner {

	@Autowired
	RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(FarmerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		roleRepository.saveAll(Arrays.asList(
				new Role(1, "admin", new Date().toInstant(),new Date().toInstant()),
				new Role(2, "user", new Date().toInstant(), new Date().toInstant())
		));
	}
	@Bean
	public ModelMapper modelMapper() {

		return new ModelMapper();

	}

}
