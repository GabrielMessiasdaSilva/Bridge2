package implementacao;

import java.util.List;

public class ExportadorHtml implements FormatoExportacao {
    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[HTML] <h1>" + titulo + "</h1>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[HTML] <p>" + String.join("</p><p>", dados) + "</p>");
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[HTML] </body></html> - arquivo finalizado.");
    }
}
