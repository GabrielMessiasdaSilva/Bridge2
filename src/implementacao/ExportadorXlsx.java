package implementacao;

import java.util.List;

public class ExportadorXlsx implements FormatoExportacao {
    @Override
    public void desenharCabecalho(String titulo) {
        // Mostra como o título seria identificado numa planilha.
        System.out.println("[XLSX] Cabeçalho: " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        // Junta os dados para simular as linhas da planilha.
        System.out.println("[XLSX] Linhas da planilha: " + String.join(" | ", dados));
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[XLSX] Arquivo finalizado.");
    }
}
