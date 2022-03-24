package cs.microservices.currencyexchangeservices.model;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="currency_exchange")
public class CurrencyExchange implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionMultiple;
	
	private String environment;

	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	

}
