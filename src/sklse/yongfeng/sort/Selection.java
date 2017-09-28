package sklse.yongfeng.sort;

/***
 * <p>This class <b>Selection</b> implements the Selection Sorting algorithm. More details see {@link#Sorting()}</p>
 * <p>The idea of Selection Sorting algorithm is quite direct, we can divide the array into 2 parts, one part is sorted collection
 *  while another part is unsorted collection. And in each time we select the minimum data from unsorted collection and add it 
 *  to the end of sorted collection, so after (N-1) cycle we can sort the whole array.</p>
 * <pre>
 *   Array {1, 3, 7, 10, 5, 8, 9, 4, 2, 6}
 *   
 * Round 0 {1, 3, 7, 10, 5, 8, 9, 4, 2, 6}
 * Round 1 {1, <b>2</b>, 7, 10, 5, 8, 9, 4, <b>3</b>, 6}
 * Round 2 {1, 2, <b>3</b>, 10, 5, 8, 9, 4, <b>7</b>, 6}
 *     ...     ...
 * Round 8 {1, 2, 3, 4, 5, 6, 7, 8, <b>9</b>, 10}
 * </pre>
 * @author yongfeng
 *
 */
public class Selection {
	
	private int[] nums;
	
	private int len;
	
	Selection(int[] nums){
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
		for(int i=0; i<this.len-1; i++){
			int min = this.nums[i];
			int pos = i;
			for(int k=i+1; k<this.len; k++){
				if(this.nums[k] < min){
					pos = k;
					min = this.nums[k];
				}
			}
			int temp = this.nums[pos];
			this.nums[pos] = this.nums[i];
			this.nums[i] = temp;
		}
	}

}
