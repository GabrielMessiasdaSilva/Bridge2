package implementacao;

import java.util.List;

public interface FormatoExportacao {
    // Todos os formatos precisam saber desenhar essas três partes.
    void desenharCabecalho(String titulo);

    void desenharCorpo(List<String> dados);

    void finalizarArquivo();
}
