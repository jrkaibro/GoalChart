<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/GraficoMetaSemanal">
    <html>
    <body>
    <h2><xsl:value-of select="NomeEmpresa"/></h2>
    <a style="position:relative;top:-20px;"><xsl:value-of select="NomeRelatorio"/></a>
		
    <xsl:for-each select="Dados">
      <xsl:if test="ImprimirHeader='true'">
   

      <div style="background-color: rgb(242,242,242);border-left: 6.0px solid rgb(128,128,128);padding: 4.0px 12.0px;"><b>Nome</b>: <xsl:value-of select="Nome"/></div>
      <div style="background-color: rgb(242,242,242);border-left: 6.0px solid rgb(128,128,128);padding: 4.0px 12.0px;"><b>Descrição</b>: <xsl:value-of select="Descricao"/></div>
      <div style="background-color: rgb(242,242,242);border-left: 6.0px solid rgb(128,128,128);padding: 4.0px 12.0px;"><b>Meta</b>: <xsl:value-of select="ValorMeta"/><b style="padding-left:5px;">Alcançado</b>: <xsl:value-of select="ValorAtingido"/></div>

      </xsl:if>
      
    </xsl:for-each>
		
    <xsl:for-each select="Dados/Detalhe/DetalheItem">
      <p><xsl:value-of select="Nome"/></p>
      <p><xsl:value-of select="Descricao"/></p>
      
      <!-- Imprime Gráfico ou não o Total -->
      <xsl:if test="ImprimirGraficoTotal='true'">
        <p><xsl:value-of select="ValorMeta"/></p>
        <p><xsl:value-of select="ValorAtingido"/></p>
      </xsl:if>
    </xsl:for-each>
    
    <!-- Semanas -->
    <div style="display:flex;text-align:center;">
		
      <xsl:for-each select="Dados/Detalhe/DetalheItem/Semanas/SemanasItem">
        <div style="border:1px solid #f1f1f1; border-radius: 25px;margin:5px 5px 5px 5px;width:100%;background-color:#ffffff;"> <span><xsl:value-of select="Semana"/></span> <span><xsl:value-of select="Descricao"/></span> <span><xsl:value-of select="ValorMeta"/></span> <span><xsl:value-of select="ValorAtingido"/></span>
          <div id="grafico"> <img  height="200" class="irc_mi" src="http://blog.coletum.com/wp-content/uploads/2017/11/grafico-03-300x219.png" > </div>
        </div>
      </xsl:for-each>
		  
    </div>
    </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
