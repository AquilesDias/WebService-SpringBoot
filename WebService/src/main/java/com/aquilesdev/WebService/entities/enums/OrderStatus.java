package com.aquilesdev.WebService.entities.enums;

public enum OrderStatus {
	
	// AGUARDANDO_PAGAMENTO,PAGO,ENVIADO, ENTREGUE, CANCELADO
	WAITING_PAYMENT (1), 
	PAID (2), 
	SHIPPED (3), 
	DELIVERED (4),
	CANCELED (5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	

	public int getCode() {
		return code;
	}

}
