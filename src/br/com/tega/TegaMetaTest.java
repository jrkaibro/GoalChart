package br.com.tega;

public class TegaMetaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String xml = "<GraficoMetaSemanal>\r\n" + 
				"	<NomeEmpresa>KnetApp Soluções Inteligentes</NomeEmpresa>\r\n" + 
				"	<NomeRelatorio>metas.pdf</NomeRelatorio>\r\n" + 
				"	<Dados>\r\n" + 
				"		<Descricao>Vendas Estofados</Descricao>\r\n" + 
				"		<Nome>Venda de Sofás</Nome>\r\n" + 
				"		<ValorMeta>100.00</ValorMeta>\r\n" + 
				"		<ValorAtingido>80.00</ValorAtingido>\r\n" + 
				"		<ImprimirValor>true</ImprimirValor>\r\n" + 
				"		<ImprimirHeader>true</ImprimirHeader>\r\n" + 
				"		<Detalhe>\r\n" + 
				"			<DetalheItem>\r\n" + 
				"				<Descricao>Descrição 1º</Descricao>\r\n" + 
				"				<Nome>Poliéster e Polipropileno</Nome>\r\n" + 
				"				<ValorMeta>100.00</ValorMeta>\r\n" + 
				"				<ValorAtingido>45.00</ValorAtingido>\r\n" + 
				"				<ImprimirGraficoTotal>false</ImprimirGraficoTotal>\r\n" + 
				"				<Semanas>\r\n" + 
				"					<SemanasItem>\r\n" + 
				"						<Semana>1</Semana>\r\n" + 
				"						<Descricao>Semana 1</Descricao>\r\n" + 
				"						<ValorMeta>1000.00</ValorMeta>\r\n" + 
				"						<ValorAtingido>1100.00</ValorAtingido>\r\n" + 
				"					</SemanasItem>\r\n" + 
				"				</Semanas>\r\n" + 
				"			</DetalheItem>\r\n" + 
				"		</Detalhe>\r\n" + 
				"	</Dados>\r\n" + 
				"</GraficoMetaSemanal>";
		
		
		  TegaMeta tegameta = new TegaMeta();
		  
		  String HTML = tegameta.GerarPDF(xml, "C:\\Meta\\", "C:\\Meta\\");
		  
		  System.out.println(HTML);
		
	}

}
