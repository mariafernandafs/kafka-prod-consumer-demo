package br.com.maferfs.sb_kafka_producer.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter

public class PagamentoDTO {
    private Integer numero;
    private String descricao;
    private BigDecimal valor;
}
