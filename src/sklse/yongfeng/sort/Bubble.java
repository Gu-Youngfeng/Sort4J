package sklse.yongfeng.sort;

/***
 * <p>This class <b>Bubble</b> implements the Bubble Sorting algorithm. More details see {@link#sorting()}</p>
 * <p>The idea of the Bubble Sorting is quite easy, we conduct double cycle to the array, and each outside cycle is a round,
 * where two numbers next to compare, and if one is less than another then exchange their position.</p>
 * <pre>
 *   Array {1, 3, 7, 10, 5, 8, 9, 4, 2, 6}
 *   
 * Round 0 {1, 3, 7, 5, 8, 9, 4, 2, 6, <b>10</b>}
 * Round 1 {1, 3, 7, 5, 8, 4, 2, 6, <b>9</b>, 10}
 * Round 2 {1, 3, 7, 5, 4, 2, 6, <b>8</b>, 9, 10}
 *     ...     ...
 * Round 8 {1, <b>2</b>, 3, 4, 5, 6, 7, 8, 9, 10}
 * </pre>
 * @author yongfeng
 *
 */
public class Bubble {
	
	private int[] nums;
	
	private int len;
	
	Bubble(int[] nums){
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
	
	/***
	 * <p>To sort the nums array.</p>
	 */
	public void Sorting(){
		
		for(int i=0; i<this.len-1; i++){ // outside cycle is a comparison round, we have (N-1) rounds.
			for(int j=0; j<this.len-i-1; j++){
				if(this.nums[j+1] < this.nums[j]){
					int temp = this.nums[j];
					this.nums[j] = this.nums[j+1];
					this.nums[j+1] = temp;
				}
			}
		}
	}

}
