package br.com.akato;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class LeitorTest {

	@Mock
	Leitor leitor;
	
	@Before
	public void init() throws Exception{
		initMocks(this);	
//		when(leitor.lerEventos()).thenReturn(criarEventos());
		
		object = new Cenario();
	}

	@Test
	public void validarArquivo()throws Exception{
		leitor.lerPerimetro();
	}
}
