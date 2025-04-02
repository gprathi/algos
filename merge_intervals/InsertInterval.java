// Given a list of non-overlapping intervals sorted by their start time,
// insert a given interval at the correct position and merge all necessary intervals to produce a list that has only mutually exclusive intervals.

// Example 1:

// Input: Intervals=[[1,3], [5,7], [8,12]], New Interval=[4,6]
// Output: [[1,3], [4,7], [8,12]]
// Explanation: After insertion, since [4,6] overlaps with [5,7],
// we merged them into one [4,7].

// Input: Intervals=[[1,3], [5,7], [8,12]], New Interval=[4,10]
// Output: [[1,3], [4,12]]
// Explanation: After insertion, since [4,10] overlaps with [5,7] & [8,12],
// we merged them into [4,12].


// end > start. check end++
import java.util.*;

class Interval{
    private int start;
    private int end;

    public Interval(int x, int y){
        start = x;
        end = y;
    }
}

public class InsertInterval {

    public List<Interval> insert(List<Interval> intervals){
        List<Interval> mergedIntervals = new LinkedList<Interval>();
        Iterator<Interval> intervalItr =  intervals.iterator(); {

        };

        return mergedIntervals;

    }

    public static void main(String[] args){

    }
}
