package com.nailton.dominioorm.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_participante_atividade")
public class ParticipanteAtividade {
	
	@EmbeddedId
	private ParticipanteAtividadePK id = new ParticipanteAtividadePK();
	
	public ParticipanteAtividade() {}

	public ParticipanteAtividadePK getId() {
		return id;
	}

	public void setId(ParticipanteAtividadePK id) {
		this.id = id;
	}

	public ParticipanteAtividade(Participante participante, Atividade atividade) {
		super();
		id.setParticipante(participante);
		id.setAtividade(atividade);
	}
	
	
	
	

}
