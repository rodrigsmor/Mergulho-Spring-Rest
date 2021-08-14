package com.algaworks.algalog.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.algaworks.algalog.domain.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaModel {
	private Long Id;
	private BigDecimal taxa;
	private String nomeCliente;
	private OffsetDateTime dataPedido;
	private StatusEntrega status;
	private OffsetDateTime dataFinalizacao;
	private DestinatarioModel destinatario; 
	
}
