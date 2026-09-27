package cliente;

import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorHtml;
import implementacao.ExportadorPdf;
import implementacao.ExportadorXlsx;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Relatório de Vendas em PDF");
        RelatorioVendas vendas = new RelatorioVendas(new ExportadorPdf());
        vendas.gerarRelatorio();

        System.out.println("\n2. Mesmo relatório de Vendas alterado dinamicamente para Excel");
        vendas.setExportador(new ExportadorXlsx());
        vendas.gerarRelatorio();

        System.out.println("\n3. Relatório de Desempenho de RH em HTML");
        RelatorioRH rh = new RelatorioRH(new ExportadorHtml());
        rh.gerarRelatorio();
    }
}
