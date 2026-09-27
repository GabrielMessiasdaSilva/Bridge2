package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;

public class RelatorioVendas extends Relatorio {
    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        exportar("Relatório de Vendas", List.of(
                "Faturamento: R$ 125.000",
                "Pedidos: 840"
        ));
    }
}
