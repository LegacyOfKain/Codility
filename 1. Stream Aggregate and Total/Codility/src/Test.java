import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import TieRopes.Solution;

//This class was used by me for doing rough work
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello world");
		//testfunc(4,5);
		
		
		TieRopes.Solution obj = new TieRopes.Solution();
		System.out.println
		("TieRopes.Solution = "+
							obj.solution(4, new int[]{ 1,2,3,4,1,1,3 }) 
		);
		
		
		
		Optional<BigDecimal> cadena = Optional.of(new BigDecimal(33.3));
		BigDecimal num = cadena.get();
		if(num.compareTo(BigDecimal.ZERO) > 0);
		{
			
		}
		BigDecimal total = new BigDecimal(0);
		total = total.add(num);
		System.out.println(total);
		
		Map<String, BigDecimal> totalmap = new HashMap<>();
        totalmap.put("Total",BigDecimal.ZERO);
	}

	/*
	public static void testfunc(int i, int j) {
		System.out.println("hello world in Func");
		
	}
	*/
	
	

}
