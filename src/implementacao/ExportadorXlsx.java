package implementacao;

import java.util.List;

public class ExportadorXlsx implements FormatoExportacao {
    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[XLSX] Cabeçalho: " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[XLSX] Linhas da planilha: " + String.join(" | ", dados));
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[XLSX] Arquivo finalizado.");
    }
}
