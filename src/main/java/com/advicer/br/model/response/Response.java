package com.advicer.br.model.response;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	public List<String> getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(List<String> detalhes) {
		this.detalhes = detalhes;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public int getCodStatus() {
		return codStatus;
	}

	public void setCodStatus(int codStatus) {
		this.codStatus = codStatus;
	}

	public boolean isSucesso() {
		return sucesso;
	}

	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}

}

