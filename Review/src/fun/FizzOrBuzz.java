package fun;

public class FizzOrBuzz {
	public static void main(String[] args){
		 int i = 1;
		
		while(i <= 100) {
			if(i%5 == 0){
				if(i%3 == 0){
					System.out.println("Fizz Buzz");
				
				}
				else{
					System.out.println("Buzz");
				}
			}
			else if(i%3 == 0){
				System.out.println("Fizz");
			}
			else{
				System.out.println(i);
			}
			i ++;
		}
	}
}
