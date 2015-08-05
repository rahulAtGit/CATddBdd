package code;

import java.util.*;

public class RpnCalculator {
	
	
	
	public String  calculate (String arr )
	{
		String input = arr;
        String output=" ";
        Stack<Float> new_stack = new Stack<Float>();
        String[] split = input.split(" ");
        float retval = 0;
        if(split.length == 0)
        {
        	return "error: no input";
        }   
        try{
        for(String token:split){
               try  
                 {  
                     retval = Float.parseFloat(token);
                     new_stack.push(retval);
                 }  
                 catch(NumberFormatException nfe)  
                 {  
                	 output = operations(new_stack,token);
                 } 
        }      
        }
        catch(EmptyStackException e)
        {
        	return "error: more operators";
        	
        }
        if(new_stack.size()>1)
        {
        	return "error: more operands";
        	
        }
        
        return String.valueOf(output);
	}

	
	private int factorial(Float n)
	{
		return (int) (n * factorial(n-1));
	}
	
	private String operations(Stack<Float> new_stack,String token)
	{
		 Float operand2 = new_stack.pop();
         Float operand1; 
         Float output = (float) 0;
         
         switch(token.charAt(0)){
         case '+':  operand1 = new_stack.pop();
      	          output = operand1+operand2;
                    new_stack.push(output);
                    break; 
         case '-':  operand1 = new_stack.pop();
      	          output = operand1-operand2;
                    new_stack.push(output);
                    break; 
         case '*':  operand1 = new_stack.pop();
      	          	output = operand1*operand2;
                    new_stack.push(output);
                    break; 
         case '/':  
        	 		if(operand2 == 0)
        	 			return "error:divided by zero";
	        		operand1 = new_stack.pop();
	   	            output = operand1/operand2;
	                new_stack.push(output);
                    break; 
         case '^':  operand1 = new_stack.pop();
      	          output= (float) Math.pow(operand1,operand2);
                    new_stack.push(output);
                    break;
         case '%':  output = (float) (operand2/100.0);    
                    new_stack.push(output);                                
                    break;
        case '!': output = (float)  factorial(operand2);
                    new_stack.push(output);                               
                    break;
                    
         } 
         
         return String.valueOf(output);
	}
	
}


