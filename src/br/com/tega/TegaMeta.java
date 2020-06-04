package br.com.tega;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.text.DecimalFormat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import br.com.tega.GraficoMetaSemanal;
import br.com.tega.GraficoMetaSemanal.Dados;
import br.com.tega.GraficoMetaSemanal.Dados.Detalhe;
import br.com.tega.GraficoMetaSemanal.Dados.Detalhe.DetalheItem;
import br.com.tega.GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas;
import br.com.tega.GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas.SemanasItem;

public class TegaMeta {
	
	public TegaMeta() {}
			
	private static String path = "";
	private static String domain = "";

	public String GerarPDF(String xml,String Caminho,String Domain) {
		 
		 path   = Caminho;
		 domain = Domain;
		 
		 StringBuilder html = null;
		    
		    try
		    {
		    	JAXBContext jaxbContext;
		        jaxbContext = JAXBContext.newInstance(GraficoMetaSemanal.class); 
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		        GraficoMetaSemanal graficometasemanal = (GraficoMetaSemanal) jaxbUnmarshaller.unmarshal(new StringReader(xml));
		        html = GeraArquivo(graficometasemanal);
		        
		    }
		    catch (JAXBException e)
		    {
		        e.printStackTrace();
		    }		
		    
		    return html.toString();	
		    
	}
	

	private StringBuilder GeraArquivo(GraficoMetaSemanal graficometasemanal) {
		
		
        byte i = 0;		
		StringBuilder html = new StringBuilder();
		Dados dados = graficometasemanal.getDados();
		String href;
        
		html.append("<!doctype html>");
		html.append(System.getProperty("line.separator")); 
		html.append("<html>");
		html.append(System.getProperty("line.separator")); 
		html.append("<head>");
		html.append(System.getProperty("line.separator")); 
		html.append("<meta charset=\"utf-8\">");
		html.append(System.getProperty("line.separator")); 
		html.append("<title>Painel de Metas</title>");
		html.append(System.getProperty("line.separator")); 
		html.append("</head>");
		html.append(System.getProperty("line.separator")); 
		
		html.append("<body>");
		html.append(System.getProperty("line.separator")); 

		html.append("<h1>"+ graficometasemanal.getNomeRelatorio() +"</h1>");
		html.append("<span>"+ graficometasemanal.getNomeEmpresa() +"</span>");

		html.append(System.getProperty("line.separator"));
		html.append("<div style=\"background-color: rgb(242,242,242);border-left: 6.0px solid rgb(128,128,128);padding: 4.0px 12.0px;\"><b>"+dados.getDescricao() +"</b>:" + dados.getNome() + "</div>");
		html.append(System.getProperty("line.separator"));
			
			if (dados.getImprimirHeader().equals("true")) {
			
				html.append("<div style=\"background-color: rgb(242,242,242);border-left: 6.0px solid rgb(128,128,128);padding: 4.0px 12.0px;\"><b>Valor da Meta</b>:" + dados.getValorMeta() + " <b>Valor Atingido </b> :" + dados.getValorAtingido() + "</div>");
				html.append(System.getProperty("line.separator"));
			
			}
		
        Detalhe detalhe = graficometasemanal.getDados().getDetalhe();
        
        for(DetalheItem detalheitem : detalhe.getDetalheItem()) 
        {        	
        	
        	
           html.append("<hr>");
    	   html.append("<table style=\"border-spacing:0\">");
           html.append(System.getProperty("line.separator"));  
                   
           html.append("<tr>");
           html.append(System.getProperty("line.separator"));  
           html.append("<th></th>");
           html.append(System.getProperty("line.separator"));  
        	
        	
        if (detalheitem.getImprimirGraficoTotal().equals("true")) {
        	
        	@SuppressWarnings("unused")
			String imgGraficoTotal = gerarGrafico((byte) 9,detalheitem.getNome(),detalheitem.getDescricao(),detalheitem.getValorMeta(),detalheitem.getValorAtingido());
        	 href = domain + "9.png";
         	 html.append("<th rowspan=5><img src="+ href +" height=\"100\" width=\"100\"></th>");	
        	 html.append(System.getProperty("line.separator"));           	
        }
               
        html.append("</tr>");
        html.append(System.getProperty("line.separator"));  
        
        html.append("<tr>");
        html.append(System.getProperty("line.separator"));  
        html.append(" <td>"+ detalheitem.getDescricao()+ " " +detalheitem.getNome()+"</td>");
        html.append(System.getProperty("line.separator"));  
        html.append("</tr>");
        html.append(System.getProperty("line.separator"));  
        
                
        html.append("<tr>");
        html.append(System.getProperty("line.separator"));  
        html.append(" <td> Valor da Meta : "+detalheitem.getValorMeta()+"</td>");
        html.append(System.getProperty("line.separator"));  
        html.append("</tr>");
        html.append(System.getProperty("line.separator"));  
                
        html.append("<tr>");
        html.append(System.getProperty("line.separator"));  
        html.append(" <td>Valor Atingido : "+detalheitem.getValorAtingido()+"</td>");
        html.append(System.getProperty("line.separator"));  
        html.append("</tr>");
        html.append(System.getProperty("line.separator"));  
                
        html.append("</table>");
        html.append(System.getProperty("line.separator"));

        Semanas semanas = detalheitem.getSemanas();

        for(SemanasItem semanasitem : semanas.getSemanasItem()) 
        {     
        	
            i++;

        	// Gera Grafico da Semana
        	@SuppressWarnings("unused")
			String imgHTML = gerarGrafico(i,semanasitem.getDescricao(),semanasitem.getDescricao(),semanasitem.getValorMeta(),semanasitem.getValorAtingido());

        	href = domain + i + ".png"; 
        
        	html.append("<img src="+ href + " height=\"200\" width=\"200\">");	
        	html.append(System.getProperty("line.separator"));       	
        	 
        }
             
        
	} 
		html.append("</body>");
		html.append(System.getProperty("line.separator"));
		html.append("</html>");
		html.append(System.getProperty("line.separator"));

        return html;
	 
	}
	
	
	private String gerarGrafico(byte semana, String Title, String description, float valorMeta,float valorAtingido) {
		
		DefaultPieDataset dataSet = new DefaultPieDataset();
		
		
		dataSet.setNotify(false);
		dataSet.setValue("Restam", (valorMeta - valorAtingido));
		dataSet.setValue("Alcançado", valorAtingido);
		
		JFreeChart chart = ChartFactory.createPieChart3D(Title + "  Meta - " + valorMeta , dataSet, false, false, false);
		
		Color trans = new Color(0xFF, 0xFF, 0xFF, 0);
		chart.setBackgroundPaint(trans);
				
	     
		 PiePlot illegalLegalRestPiePlot4 = (PiePlot) chart.getPlot();
	     		 illegalLegalRestPiePlot4.setSectionPaint("Restam", new Color(255, 0, 0));
	     		 illegalLegalRestPiePlot4.setSectionPaint("Alcançado", new Color(0, 255, 0));
		    
	     	PiePlot plot = (PiePlot) chart.getPlot();
	     	plot.setBackgroundPaint(trans);
		    plot.setExplodePercent("some data 1", 0.0);
		    plot.setSimpleLabels(true);	
	        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
	        plot.setNoDataMessage("No data available");
	        plot.setCircular(true);
	        plot.setIgnoreZeroValues(true);
	        plot.setLabelGap(0.02);
		    
		    
		    PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator("{0} = {1}", new DecimalFormat("0"), new DecimalFormat("0.00%"));
		   
		    plot.setLabelGenerator(generator);
		
				
		File outputfile = new File(path + semana +".png");
		
		try {
			ChartUtilities.saveChartAsPNG(outputfile, chart, 300, 300);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return outputfile.getAbsolutePath();
	}
	
	
	
}
