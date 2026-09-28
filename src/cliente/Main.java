package cliente;

import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorHtml;
import implementacao.ExportadorPdf;
import implementacao.ExportadorXlsx;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Relatório de Vendas em PDF");
        // Aqui juntamos o tipo do relatório com o formato PDF.
        RelatorioVendas vendas = new RelatorioVendas(new ExportadorPdf());
        vendas.gerarRelatorio();

        System.out.println("\n2. Mesmo relatório de Vendas alterado dinamicamente para Excel");
        // O relatório é o mesmo; só trocamos quem faz a exportação.
        vendas.setExportador(new ExportadorXlsx());
        vendas.gerarRelatorio();

        System.out.println("\n3. Relatório de Desempenho de RH em HTML");
        // Outro tipo de relatório também pode usar um formato diferente.
        RelatorioRH rh = new RelatorioRH(new ExportadorHtml());
        rh.gerarRelatorio();
    }
}
