public class Calculator {
	
	private int result;	
		
	void add(Integer... arg){
		for(Integer i : arg){
			result += i; 
		}
	}
	
	void sub(int first, int second){
		result = first - second;
	}
	
	void mul(Integer... arg){
		for(Integer i : arg){
			result *= i;
		}
	}
	
	void div(int first, int second){
		result = first / second;
	}
	
	int getResult(){
		return result;
	}
	
	void cleanResult(){
		result = 0;
	}
}