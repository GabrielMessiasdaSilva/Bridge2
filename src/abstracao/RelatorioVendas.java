package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;

public class RelatorioVendas extends Relatorio {
    public RelatorioVendas(FormatoExportacao exportador) {
        // O formato escolhido é enviado para a classe base.
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        // Este relatório tem informações próprias de vendas.
        exportar("Relatório de Vendas", List.of(
                "Faturamento: R$ 125.000",
                "Pedidos: 840"
        ));
    }
}
