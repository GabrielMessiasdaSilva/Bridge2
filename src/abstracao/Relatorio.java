package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;
import java.util.Objects;

/**
 * Aqui fica a parte geral do relatório; o formato de saída vem separado,
 * que é a ideia principal do padrão Bridge.
 */
public abstract class Relatorio {
    private FormatoExportacao exportador;

    protected Relatorio(FormatoExportacao exportador) {
        // Guarda o formato recebido e evita deixar o exportador vazio.
        this.exportador = Objects.requireNonNull(exportador, "O exportador é obrigatório.");
    }

    public void setExportador(FormatoExportacao exportador) {
        // Assim dá para trocar o formato sem criar outro relatório.
        this.exportador = Objects.requireNonNull(exportador, "O exportador é obrigatório.");
    }

    protected void exportar(String titulo, List<String> dados) {
        // O relatório passa as partes para o exportador montar no formato dele.
        exportador.desenharCabecalho(titulo);
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }

    public abstract void gerarRelatorio();
}
