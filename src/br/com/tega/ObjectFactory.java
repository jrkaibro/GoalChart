package br.com.tega;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public GraficoMetaSemanal createGraficoMetaSemanal() {
        return new GraficoMetaSemanal();
    }

    public GraficoMetaSemanal.Dados createGraficoMetaSemanalDados() {
        return new GraficoMetaSemanal.Dados();
    }

    public GraficoMetaSemanal.Dados.Detalhe createGraficoMetaSemanalDadosDetalhe() {
        return new GraficoMetaSemanal.Dados.Detalhe();
    }

    public GraficoMetaSemanal.Dados.Detalhe.DetalheItem createGraficoMetaSemanalDadosDetalheDetalheItem() {
        return new GraficoMetaSemanal.Dados.Detalhe.DetalheItem();
    }

    public GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas createGraficoMetaSemanalDadosDetalheDetalheItemSemanas() {
        return new GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas();
    }

    public GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas.SemanasItem createGraficoMetaSemanalDadosDetalheDetalheItemSemanasSemanasItem() {
        return new GraficoMetaSemanal.Dados.Detalhe.DetalheItem.Semanas.SemanasItem();
    }

}
