package sklse.yongfeng.sort;

/***
 * <p>This class <b>Shell</b> implements the Shell Sorting algorithm. More details see {@link#Sorting()}</p>
 * <p>The advance of Shell Sorting algorithm is the runtime speed, and the time complexity of Shell algorithm is only 
 * <b>O(n*log(n))</b>, which is lower than <b>Selection</b> and <b>Insertion</b> algorithms.</p>
 * <pre>
 *   Array {1, 3, 7, 10, 5, 8, 9, 4, 2, 6}
 *   
 * Round 0 {1, 3, 7, 2, 5, 8, 9, 4, 10, 6}  -> gap is 5 
 * Round 1 {1, 2, 5, 3, 7, 4, 9, 6, 10, 8}  -> gap is 2
 * Round 2 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}  -> gap is 1
 * </pre>
 * @author yongfeng
 *
 */
public class Shell {
	private int[] nums;
		
	private int len;
	
	Shell(int[] nums){
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
	
	public void Sorting(){
		
		int gap = this.len/2;
		
		while(gap > 0){
			for(int i=0; i<this.len; i++){
				for(int k=i; k<this.len-gap; k+=gap){
					if(this.nums[k] > this.nums[k + gap]){
						int temp = this.nums[k];
						this.nums[k] = this.nums[k + gap];
						this.nums[k + gap] = temp;
					}
				}
				
			}
			
			gap /= 2;
		}
	}
}
