package com.api.cliente.entidades.enums;

public enum StatusPedido {

	AGUARDANDO_PAGAMENTO(1), PAGO(2), ENVIADO(3), ENTREGUE(4), CANCELADO(5);

	private int codigo;

	private StatusPedido(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public static StatusPedido valorCodigo(int codigo) {
		for (StatusPedido valor : StatusPedido.values()) {
			if (valor.getCodigo() == codigo) {
				return valor; //recebe o código e retorna o objeto do tipo do enum
			}			
		}
		throw new IllegalArgumentException("Código Inválido");
	}
}
