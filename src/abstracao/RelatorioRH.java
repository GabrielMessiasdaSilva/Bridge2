package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;

public class RelatorioRH extends Relatorio {
    public RelatorioRH(FormatoExportacao exportador) {
        // Reaproveita a exportação definida na classe mais geral.
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        // Os dados daqui são específicos do relatório de RH.
        exportar("Relatório de Desempenho de RH", List.of(
                "Colaboradores avaliados: 42",
                "Meta atingida: 88%"
        ));
    }
}
