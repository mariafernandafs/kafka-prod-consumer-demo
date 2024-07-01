package br.com.maferfs.sb_kafka_producer.api;

import br.com.maferfs.sb_kafka_producer.dto.PagamentoDTO;
import br.com.maferfs.sb_kafka_producer.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoApi {
    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public String pagar(@RequestBody PagamentoDTO pagamento){
        return pagamentoService.integrarPagamento(pagamento);
    }
}
