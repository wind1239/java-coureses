/**
 * Класс реализует базовые арифметические операции
 */
public class Calculator {
	
	private int result;	
	
	/**
	 * Операция суммирования
	 * @param arg входящие аргументы
	 * для суммирования
	 */
	void add(Integer... arg){
		for(Integer i : arg){
			result += i; 
		}
	}
	
	/**
	 * Операция вычитания
	 * @param arg входящие аргументы
	 * для вычитания
	 */
	void sub(int first, int second){
		result = first - second;
	}

	/**
	 * Операция умножения
	 * @param arg входящие аргументы
	 * для умножения
	 */	
	void mul(Integer... arg){
		for(Integer i : arg){
			result *= i;
		}
	}
	
	/**
	 * Операция деления
	 * @param arg входящие аргументы
	 * для деления
	 */	
	void div(int first, int second){
		result = first / second;
	}
	
	/**
	 * Метод возвращает результат 
	 * арифметической операции
	 * @return результат арифметической операции
	 */
	int getResult(){
		return result;
	}
	
	/**
	 * Метод выполняет очистку переменной result 
	 */
	void cleanResult(){
		result = 0;
	}
}