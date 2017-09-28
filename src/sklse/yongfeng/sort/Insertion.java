package sklse.yongfeng.sort;

/***
 * <p>This class <b>Insertion</b> implements the Selection Sorting algorithm. More details see {@link#Sorting()}</p>
 * <p>The idea of Insertion Sorting algorithm is quite similar to <b>Selection Sorting</b> algorithm, we can divide the array into 2 parts, one part is sorted collection
 *  while another part is unsorted collection. And in each time we select the first data from unsorted collection and insert it 
 *  into the sorted collection, so after (N-1) cycle we can sort the whole array.</p>
 * <pre>
 *   Array {1, 3, 7, 10, 5, 8, 9, 4, 2, 6}
 *   
 * Round 0 {1, <b>3</b>, 7, 10, 5, 8, 9, 4, 2, 6}
 * Round 1 {1, 3, <b>7</b>, 10, 5, 8, 9, 4, 2, 6}
 * Round 2 {1, 3, 7, <b>10</b>, 5, 8, 9, 4, 2, 6}
 *     ...     ...
 * Round 8 {1, 2, 3, 4, 5, 6, 7, 8, 9, <b>10</b>}
 * </pre>
 * @author yongfeng
 *
 */
public class Insertion {

	private int[] nums;
	
	private int len;
	
	Insertion(int[] nums){
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
			int min = this.nums[i+1];
			int pos = i+1;
			for(int k=0; k<pos; k++){
				if(this.nums[k] > min){
					pos = k;
					break;
				}
			}
			
			for(int j=i+1; j>pos; j--){
				this.nums[j] = this.nums[j-1];
			}
			this.nums[pos] = min;
			
		}
	}
}
