package br.com.brackets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BracketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BracketsApplication.class, args);
		
		BracketsTeste bracktsTeste = new BracketsTeste();
		bracktsTeste.isValid("(){}[]");
	}

	
}
