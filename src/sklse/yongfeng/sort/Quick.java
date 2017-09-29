package sklse.yongfeng.sort;

/***
 * <p>This class <b>Quick</b> implements the Quick Sorting algorithm. More details see {@link#Sorting()}</p>
 * <p>The Quick Sorting algorithm is famous for its high efficient and speed in big data processing, and it is also one of the most fast
 *  sorting algorithms.</p>
 *  <p>The idea of Quick Sorting algorithm might confusing us, it first select the 1st number as the key, and then divide the array into 2 parts, 
 *  where the number in 2 parts are either less than or bigger than the key. Next, we can focus each part of them, and iteratively use the sort 
 *  algorithm on the sub parts, then the whole array will be well sorted.</p>
 * <pre>
 *   Array {1, 3, 7, 10, 5, 8, 9, 4, 2, 6}
 *   
 * Round 0 {<b>1</b>, 3, 7, 10, 5, 8, 9, 4, 2, 6}
 * Round 1 {1, <b>2</b>, 3, 10, 5, 8, 9, 4, 7, 6}
 * Round 2 {1, 2, <b>3</b>, 6, 5, 8, 9, 4, 7, 10}
 *     ...
 * </pre>
 * @author yongfeng
 *
 */
public class Quick {
	private int[] nums;
		
	private int len;
	
	Quick(int[] nums){
		if(nums == null){
			System.out.println("The nums array is null!");
			return;
		}
		this.nums = nums;
		this.len = nums.length;
	}
	
	public int getLen(){
		return this.len;
	}
	
	public int[] getNums(){
		return this.nums;
	}
	
	public void Sorting(int i, int j){
		
		if(i >= j){
			return;
		}
		
		int index = partition(i, j);
		Sorting(i, index-1);
		Sorting(index+1, j);
	
	}
	
	public int partition(int st, int ed){
		
		int key = this.nums[st];
		
		while(st < ed){

			while(key <= this.nums[ed] && st < ed){

				ed--;
			}
			
			this.nums[st] = this.nums[ed];
			
			while(this.nums[st] <= key && st < ed){

				st++;
			}
			
			this.nums[ed] = this.nums[st];
		}
		
		this.nums[ed] = key;
		
		for(int i: getNums()){
			System.out.print(i + " ");
		}
		System.out.println("");
		
		return ed;
	}
}
