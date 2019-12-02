package com.advicer.br.model.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
@Data
public class Response {

	private LocalDateTime data;
	private int codStatus;
	private boolean sucesso;
	private String msg;
	private List<String> detalhes;

	public Response() {
		data = LocalDateTime.now();
	}

	public Response(int codStatus, boolean sucesso, String msg) {
		this.data = LocalDateTime.now();
		this.codStatus = codStatus;
		this.sucesso = sucesso;
		this.msg = msg;
		detalhes = new ArrayList<>();
	}



}

