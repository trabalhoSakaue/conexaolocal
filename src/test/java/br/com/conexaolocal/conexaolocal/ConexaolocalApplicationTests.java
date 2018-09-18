package br.com.conexaolocal.conexaolocal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.conexaolocal.entidade.Hello;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConexaolocalApplicationTests {

	@Test
	public void contextLoads() {		
	}
	
	@Test
	public void setTituloOk() {
		Hello hello = new Hello();
		hello.setTitulo("Good Morning");
		assertEquals("Good Morning",hello.getTitulo());
	}
	
	

}
