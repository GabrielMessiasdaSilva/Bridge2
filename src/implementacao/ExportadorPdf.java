package implementacao;

import java.util.List;

public class ExportadorPdf implements FormatoExportacao {
    @Override
    public void desenharCabecalho(String titulo) {
        // Por enquanto, o PDF é representado por mensagens no console.
        System.out.println("[PDF] Cabeçalho: " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[PDF] Corpo: " + String.join(" | ", dados));
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[PDF] Arquivo finalizado.");
    }
}
