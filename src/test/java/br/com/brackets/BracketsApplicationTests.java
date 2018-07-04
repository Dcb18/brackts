package br.com.brackets;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BracketsApplicationTests {


	
	@Test
	public void BracketsTeste() {
		BracketsTeste bracktsTeste = new BracketsTeste();

	Assertions.assertThat(bracktsTeste.isValid("(){}[]")).isEqualTo(true);
	Assertions.assertThat(bracktsTeste.isValid("[{()}](){}")).isEqualTo(true);
	Assertions.assertThat(bracktsTeste.isValid("[]{()")).isEqualTo(false);
	Assertions.assertThat(bracktsTeste.isValid("[{)]")).isEqualTo(false);
	Assertions.assertThat(bracktsTeste.isValid("({[]})")).isEqualTo(true);
	Assertions.assertThat(bracktsTeste.isValid("")).isEqualTo(true);
	Assertions.assertThat(bracktsTeste.isValid("({[")).isEqualTo(false);
	Assertions.assertThat(bracktsTeste.isValid("}[)")).isEqualTo(false);
	
	}

}
