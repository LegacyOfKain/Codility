package com.codility;

import java.util.*;
import java.util.stream.Stream;
import java.math.*;

public class SoldProductsAggregator {

	private final EURExchangeService exchangeService;

	SoldProductsAggregator(EURExchangeService EURExchangeService) {
		this.exchangeService = EURExchangeService;
	}

	SoldProductsAggregate aggregate(Stream<SoldProduct> products) {
		List <SimpleSoldProduct>products1 = new ArrayList();
		//BigDecimal total = new BigDecimal(0.0);
		// Need to use Map as normal variables cannot be used to create the sum inside stream foreach
		Map<String, BigDecimal> totalmap = new HashMap<>();
		totalmap.put("Total",BigDecimal.ZERO);


		if(products!=null)
		{
			products.forEach(sp -> {
				if (sp ==null)
				{
					return;
				}
				// Trick for getting the use cases
				// System.out.println("hello"+sp.getName()+" "+sp.getPrice()+" "+sp.getCurrency());
				if(isNotNullOrEmpty(sp.getName()) )
				{
					Optional<BigDecimal> rateBD = exchangeService.rate(sp.getCurrency());
					if (rateBD != null && rateBD.isPresent()) {
						BigDecimal rateB = rateBD.get();
						if(rateB.compareTo(BigDecimal.ZERO) > 0)
						{
							//System.out.println( " rateB = "+rateB);
							BigDecimal totalBD = totalmap.get("Total");
							BigDecimal convertedBD =  sp.getPrice().multiply(rateB)  ;
							totalmap.put("Total",totalBD.add(convertedBD));
							//products1.add(new SimpleSoldProduct (sp.getName(),sp.getPrice()));
							products1.add(new SimpleSoldProduct (sp.getName(),convertedBD));
						}
						else
						{
							return ;
						}
					}
					else
					{
						return ;
					}
				}
				else
				{
					return; 
				}



			});
		}
		//System.out.println(totalmap.get("Total"));
		SoldProductsAggregate obj = new SoldProductsAggregate (products1,totalmap.get("Total"));
		return obj;
		//return null;
	}

	public static boolean isNotNullOrEmpty (String str) {
		return str != null && !str.isEmpty();
	}

}
