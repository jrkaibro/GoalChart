
package br.com.tega;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NomeEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NomeRelatorio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Dados">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="ImprimirValor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ImprimirHeader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Detalhe">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetalheItem">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="ImprimirGraficoTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Semanas">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SemanasItem" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Semana" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                                           &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                                           &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nomeEmpresa",
    "nomeRelatorio",
    "dados"
})
@XmlRootElement(name = "GraficoMetaSemanal")
public class GraficoMetaSemanal {

    @XmlElement(name = "NomeEmpresa", required = true)
    protected String nomeEmpresa;
    @XmlElement(name = "NomeRelatorio", required = true)
    protected String nomeRelatorio;
    @XmlElement(name = "Dados", required = true)
    protected GraficoMetaSemanal.Dados dados;

    /**
     * Gets the value of the nomeEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * Sets the value of the nomeEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmpresa(String value) {
        this.nomeEmpresa = value;
    }

    /**
     * Gets the value of the nomeRelatorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    /**
     * Sets the value of the nomeRelatorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeRelatorio(String value) {
        this.nomeRelatorio = value;
    }

    /**
     * Gets the value of the dados property.
     * 
     * @return
     *     possible object is
     *     {@link GraficoMetaSemanal.Dados }
     *     
     */
    public GraficoMetaSemanal.Dados getDados() {
        return dados;
    }

    /**
     * Sets the value of the dados property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraficoMetaSemanal.Dados }
     *     
     */
    public void setDados(GraficoMetaSemanal.Dados value) {
        this.dados = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="ImprimirValor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ImprimirHeader" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Detalhe">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetalheItem">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="ImprimirGraficoTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Semanas">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SemanasItem" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Semana" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                                                 &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                                                 &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descricao",
        "nome",
        "valorMeta",
        "valorAtingido",
        "imprimirValor",
        "imprimirHeader",
        "detalhe"
    })
    public static class Dados {

        @XmlElement(name = "Descricao", required = true)
        protected String descricao;
        @XmlElement(name = "Nome", required = true)
        protected String nome;
        @XmlElement(name = "ValorMeta")
        protected float valorMeta;
        @XmlElement(name = "ValorAtingido")
        protected float valorAtingido;
        @XmlElement(name = "ImprimirValor", required = true)
        protected String imprimirValor;
        @XmlElement(name = "ImprimirHeader", required = true)
        protected String imprimirHeader;
        @XmlElement(name = "Detalhe", required = true)
        protected GraficoMetaSemanal.Dados.Detalhe detalhe;

        /**
         * Gets the value of the descricao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescricao() {
            return descricao;
        }

        /**
         * Sets the value of the descricao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescricao(String value) {
            this.descricao = value;
        }

        /**
         * Gets the value of the nome property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNome() {
            return nome;
        }

        /**
         * Sets the value of the nome property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNome(String value) {
            this.nome = value;
        }

        /**
         * Gets the value of the valorMeta property.
         * 
         */
        public float getValorMeta() {
            return valorMeta;
        }

        /**
         * Sets the value of the valorMeta property.
         * 
         */
        public void setValorMeta(float value) {
            this.valorMeta = value;
        }

        /**
         * Gets the value of the valorAtingido property.
         * 
         */
        public float getValorAtingido() {
            return valorAtingido;
        }

        /**
         * Sets the value of the valorAtingido property.
         * 
         */
        public void setValorAtingido(float value) {
            this.valorAtingido = value;
        }

        /**
         * Gets the value of the imprimirValor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImprimirValor() {
            return imprimirValor;
        }

        /**
         * Sets the value of the imprimirValor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImprimirValor(String value) {
            this.imprimirValor = value;
        }

        /**
         * Gets the value of the imprimirHeader property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImprimirHeader() {
            return imprimirHeader;
        }

        /**
         * Sets the value of the imprimirHeader property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImprimirHeader(String value) {
            this.imprimirHeader = value;
        }

        /**
         * Gets the value of the detalhe property.
         * 
         * @return
         *     possible object is
         *     {@link GraficoMetaSemanal.Dados.Detalhe }
         *     
         */
        public GraficoMetaSemanal.Dados.Detalhe getDetalhe() {
            return detalhe;
        }

        /**
         * Sets the value of the detalhe property.
         * 
         * @param value
         *     allowed object is
         *     {@link GraficoMetaSemanal.Dados.Detalhe }
         *     
         */
        public void setDetalhe(GraficoMetaSemanal.Dados.Detalhe value) {
            this.detalhe = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DetalheItem">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="ImprimirGraficoTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Semanas">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SemanasItem" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Semana" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                                       &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                                       &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "detalheItem"
        })
        public static class Detalhe {

            @XmlElement(name = "DetalheItem")
            protected List<GraficoMetaSemanal.Dados.Detalhe.DetalheItem> detalheItem;

            /**
             * Gets the value of the detalheItem property.
             * 
             * @return
             *     possible object is
             *     {@link GraficoMetaSemanal.Dados.Detalhe.DetalheItem }
             *     
             */
            public List<DetalheItem> getDetalheItem() {
                
                if(detalheItem == null) {
                	detalheItem = new ArrayList<GraficoMetaSemanal.Dados.Detalhe.DetalheItem>();
                }
                
                return detalheItem;
            }
            


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="ImprimirGraficoTotal" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Semanas">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SemanasItem" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Semana" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *                             &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *                             &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "descricao",
                "nome",
                "valorMeta",
                "valorAtingido",
                "imprimirGraficoTotal",
                "semanas"
            })
            
            public static class DetalheItem {
            	
                @XmlElement(name = "Descricao", required = true)
                protected String descricao;
                @XmlElement(name = "Nome", required = true)
                protected String nome;
                @XmlElement(name = "ValorMeta")
                protected float valorMeta;
                @XmlElement(name = "ValorAtingido")
                protected float valorAtingido;
                @XmlElement(name = "ImprimirGraficoTotal", required = true)
                protected String imprimirGraficoTotal;
                @XmlElement(name = "Semanas", required = true)
                protected GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas semanas;

                /**
                 * Gets the value of the descricao property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescricao() {
                    return descricao;
                }

                /**
                 * Sets the value of the descricao property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescricao(String value) {
                    this.descricao = value;
                }

                /**
                 * Gets the value of the nome property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNome() {
                    return nome;
                }

                /**
                 * Sets the value of the nome property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNome(String value) {
                    this.nome = value;
                }

                /**
                 * Gets the value of the valorMeta property.
                 * 
                 */
                public float getValorMeta() {
                    return valorMeta;
                }

                /**
                 * Sets the value of the valorMeta property.
                 * 
                 */
                public void setValorMeta(float value) {
                    this.valorMeta = value;
                }

                /**
                 * Gets the value of the valorAtingido property.
                 * 
                 */
                public float getValorAtingido() {
                    return valorAtingido;
                }

                /**
                 * Sets the value of the valorAtingido property.
                 * 
                 */
                public void setValorAtingido(float value) {
                    this.valorAtingido = value;
                }

                /**
                 * Gets the value of the imprimirGraficoTotal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImprimirGraficoTotal() {
                    return imprimirGraficoTotal;
                }

                /**
                 * Sets the value of the imprimirGraficoTotal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImprimirGraficoTotal(String value) {
                    this.imprimirGraficoTotal = value;
                }

                /**
                 * Gets the value of the semanas property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas }
                 *     
                 */
                public GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas getSemanas() {
                    return semanas;
                }

                /**
                 * Sets the value of the semanas property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas }
                 *     
                 */
                public void setSemanas(GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas value) {
                    this.semanas = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="SemanasItem" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Semana" type="{http://www.w3.org/2001/XMLSchema}byte"/>
                 *                   &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
                 *                   &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "semanasItem"
                })
                public static class Semanas {

                    @XmlElement(name = "SemanasItem")
                    protected List<GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas.SemanasItem> semanasItem;

                    /**
                     * Gets the value of the semanasItem property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the semanasItem property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSemanasItem().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas.SemanasItem }
                     * 
                     * 
                     */
                    public List<GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas.SemanasItem> getSemanasItem() {
                        if (semanasItem == null) {
                            semanasItem = new ArrayList<GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas.SemanasItem>();
                        }
                        return this.semanasItem;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Semana" type="{http://www.w3.org/2001/XMLSchema}byte"/>
                     *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="ValorMeta" type="{http://www.w3.org/2001/XMLSchema}float"/>
                     *         &lt;element name="ValorAtingido" type="{http://www.w3.org/2001/XMLSchema}float"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "semana",
                        "descricao",
                        "valorMeta",
                        "valorAtingido"
                    })
                    public static class SemanasItem {

                        @XmlElement(name = "Semana")
                        protected byte semana;
                        @XmlElement(name = "Descricao", required = true)
                        protected String descricao;
                        @XmlElement(name = "ValorMeta")
                        protected float valorMeta;
                        @XmlElement(name = "ValorAtingido")
                        protected float valorAtingido;

                        /**
                         * Gets the value of the semana property.
                         * 
                         */
                        public byte getSemana() {
                            return semana;
                        }

                        /**
                         * Sets the value of the semana property.
                         * 
                         */
                        public void setSemana(byte value) {
                            this.semana = value;
                        }

                        /**
                         * Gets the value of the descricao property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDescricao() {
                            return descricao;
                        }

                        /**
                         * Sets the value of the descricao property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDescricao(String value) {
                            this.descricao = value;
                        }

                        /**
                         * Gets the value of the valorMeta property.
                         * 
                         */
                        public float getValorMeta() {
                            return valorMeta;
                        }

                        /**
                         * Sets the value of the valorMeta property.
                         * 
                         */
                        public void setValorMeta(float value) {
                            this.valorMeta = value;
                        }

                        /**
                         * Gets the value of the valorAtingido property.
                         * 
                         */
                        public float getValorAtingido() {
                            return valorAtingido;
                        }

                        /**
                         * Sets the value of the valorAtingido property.
                         * 
                         */
                        public void setValorAtingido(float value) {
                            this.valorAtingido = value;
                        }

                    }

                }

            }

        }

    }

}