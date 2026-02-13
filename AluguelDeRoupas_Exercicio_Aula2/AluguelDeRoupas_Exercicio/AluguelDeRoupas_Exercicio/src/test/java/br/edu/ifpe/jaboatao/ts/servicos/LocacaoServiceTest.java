package br.edu.ifpe.jaboatao.ts.servicos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.edu.ifpe.jaboatao.ts.entidades.Cliente;
import br.edu.ifpe.jaboatao.ts.entidades.Locacao;
import br.edu.ifpe.jaboatao.ts.entidades.Roupa;

public class LocacaoServiceTest {
	@Test
	public void testeExercicio() {
		System.out.println("Funcionando.");
				//cenário
				LocacaoService service = new LocacaoService();
				Cliente cliente = new Cliente("juliana");
				Roupa roupa = new Roupa("Algodao", "pp", 20, 30.00);
				
				//ação
				Locacao locacao = service.alugarRoupa(cliente, roupa);
				
				//verificação
				assertTrue(locacao.getValorLocacao() == 30.00);
				//assertTrue(DataUtils.boDatasIguais(locacao.getDataLocacao(), new Date()));
				//assertTrue(DataUtils.boDatasIguais(locacao.getDataRetorno(), DataUtils.incrementarQntDias(1)));
				//Nome do cliente
				assertTrue(locacao.getCliente().getNome() == "juliana");
				//Nome da Roupa
				assertTrue(locacao.getRoupa().getNome() == "Algodao");
				
	}
}
