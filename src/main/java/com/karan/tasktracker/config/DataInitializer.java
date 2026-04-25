package com.karan.tasktracker.config;

import com.karan.tasktracker.entity.User;
import com.karan.tasktracker.enums.Role;
import com.karan.tasktracker.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

	@Configuration
	public class DataInitializer {
		@Bean
		public CommandLineRunner init(UserRepo repo, PasswordEncoder encoder){
			return args -> {
				if(repo.findByUsername("Admin").isEmpty()){
					User admin = new User();
					admin.setUsername("Admin");
					admin.setPassword(encoder.encode("admin123"));
					admin.setRole(Role.ADMIN);

					repo.save(admin);

					System.out.println("Default admin created!!");
				}
			};
		}
	}