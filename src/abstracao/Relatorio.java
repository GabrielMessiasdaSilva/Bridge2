package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;
import java.util.Objects;

/** Abstração do Bridge. O formato é uma dependência injetada. */
public abstract class Relatorio {
    private FormatoExportacao exportador;

    protected Relatorio(FormatoExportacao exportador) {
        this.exportador = Objects.requireNonNull(exportador, "O exportador é obrigatório.");
    }

    public void setExportador(FormatoExportacao exportador) {
        this.exportador = Objects.requireNonNull(exportador, "O exportador é obrigatório.");
    }

    protected void exportar(String titulo, List<String> dados) {
        exportador.desenharCabecalho(titulo);
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }

    public abstract void gerarRelatorio();
}
