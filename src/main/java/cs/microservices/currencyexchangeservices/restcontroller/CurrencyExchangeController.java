package cs.microservices.currencyexchangeservices.restcontroller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cs.microservices.currencyexchangeservices.model.CurrencyExchange;

@RestController
public class CurrencyExchangeController
{
	private static final String PORTPROPERTY = "local.server.port";
	@Autowired
	private Environment environment;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeCurrency(@PathVariable String from
			,@PathVariable String to)
	{
		final CurrencyExchange currencyExchange = new CurrencyExchange(10L,from,to,BigDecimal.valueOf(60));
		currencyExchange.setEnvironment(environment.getProperty(PORTPROPERTY));
		return currencyExchange;
		
	}

}
