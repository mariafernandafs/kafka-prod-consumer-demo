package br.com.maferfs.sb_kafka_producer.producer;

import br.com.maferfs.sb_kafka_producer.dto.PagamentoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PagamentoRequestProducer {
    @Value("${topicos.pagamento.request.topic}")
    private String topicoRequestTopic;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String sendMessage(PagamentoDTO pagamento) throws JsonProcessingException {
        String conteudo = objectMapper.writeValueAsString(pagamento);
        kafkaTemplate.send(topicoRequestTopic, conteudo);
        return "Pagamento enviado para processamento";
    }
}
