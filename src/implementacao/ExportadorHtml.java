package implementacao;

import java.util.List;

public class ExportadorHtml implements FormatoExportacao {
    @Override
    public void desenharCabecalho(String titulo) {
        // Simula um título HTML usando a tag h1.
        System.out.println("[HTML] <h1>" + titulo + "</h1>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        // Cada item da lista vira um parágrafo.
        System.out.println("[HTML] <p>" + String.join("</p><p>", dados) + "</p>");
    }

    @Override
    public void finalizarArquivo() {
        // Indica que o conteúdo HTML terminou.
        System.out.println("[HTML] </body></html> - arquivo finalizado.");
    }
}
