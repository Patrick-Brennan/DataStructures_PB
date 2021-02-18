package quiz2_Q2;

import java.util.ArrayList;
import java.util.List;

class SuperFibs {
	private List<Long> cache = new ArrayList<>();
	public static int stepsCount = 1;
	
	public SuperFibs() {
        cache.add(0L);
        cache.add(1L);
        cache.add(2L);
    }
	
	public long getNthFib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index can not be less than 0");
        }
        return computeNthFib(n);
	}
	
	private long computeNthFib(int n) {
        for (int index = cache.size(); index <= n; index++) {
            long val = cache.get(index - 1) + cache.get(index - 2) + cache.get(index - 3);
            cache.add(val);
            stepsCount++;
        }
        return cache.get(n);
    }
	
	public int getCountOfFibsComputed() {
        return stepsCount;
    }
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (long l : cache){
            sb.append(l==0 ? "": ", ");
            sb.append(l);

        }
        return sb.toString();
    }
}
