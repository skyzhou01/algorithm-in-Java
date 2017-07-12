package App;

public class Application {
	
	public static void main(String[] args) {
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = 2 * i;
		}
		
		// O(1) complexity, random index.
		int num = nums[3];
		System.out.println(num);
		
		// O(N) Linear Search. ---> O(logN) with Binary Search; ---> O(1) with hash table.
		
		for(int i = 0; i< nums.length; i++) {
			if( nums[i] == 4 ) {
				System.out.println("Index found: " + i);
			}
			
		}
		
	}

}
