package codingBat;

public class maxMirror {

	public int maxMirror(int[] nums) {
	    int max = 0;
	    
	    for(int i = 0; i < nums.length; i++) {
	        int count = 0;
	        for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
	            if(nums[i + count] == nums[j]) {
	                count++;
	            } else {
	                max = Math.max(max, count);
	                count = 0;
	            }
	        }
	                                                                
	        max = Math.max(max, count);
	    }

	    return max;
	}
	// Or
	/*
	public int maxMirror(int[] nums) {
	    int max = 0;
	    
	    for(int start = 0; start < nums.length; start++) {
	        for(int begin = nums.length - 1; begin >= 0; begin--) {
	            int size = 0;
	            int i = start;
	            int j = begin;
	                                  
	            while(i < nums.length && j >= 0 && nums[i] == nums[j]) {
	                size++;
	                i++;
	                j--;
	            }
	                                                                              
	            max = Math.max(max, size);
	        }
	    }
	                                                                                            
	    return max;
	}
	*/
}
