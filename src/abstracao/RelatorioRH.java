package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;

public class RelatorioRH extends Relatorio {
    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        exportar("Relatório de Desempenho de RH", List.of(
                "Colaboradores avaliados: 42",
                "Meta atingida: 88%"
        ));
    }
}
