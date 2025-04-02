import java.util.*;


/*class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};*/
//  Appointments: [[4,5], [2,3], [3,6]]
// sorted [[2,3],[3,6],[4,5]] - false

// Appointments: [[6,7], [2,4], [13, 14], [8,12], [45, 47]]
// sorted [[2,4],[6,7],[8,12],[13,14],[45,47]] - true

// Appointments: [[1,4], [2,5], [7,9]]
// sorted : [[1,4],[2,5],[7,9]]Output: false
class AppointmentConflict {

  public static boolean canAttendAllAppointments(Interval[] intervals) {
    Arrays.sort(intervals,(a,b) -> Integer.compare(a.start, b.start));
    for(int i=1;i<intervals.length;i++){
        if(intervals[i].start < intervals[i-1].end)
            return false;
    }

    return true;
  }

  public static void main(String[] args){
    Interval[] intervals = new Interval[3];
    intervals[0] = new Interval(1, 4);
    intervals[1] = new Interval(2, 5);
    intervals[2] = new Interval(7, 9);
    System.out.println(canAttendAllAppointments(intervals));

    // [[6,7], [2,4], [13, 14], [8,12], [45, 47]]
    Interval[] intervalsTrue = new Interval[5];
    intervalsTrue[0] = new Interval(6, 7);
    intervalsTrue[1] = new Interval(2, 4);
    intervalsTrue[2] = new Interval(13, 14);
    intervalsTrue[3] = new Interval(8, 12);
    intervalsTrue[4] = new Interval(45, 47);
    System.out.println(canAttendAllAppointments(intervalsTrue));
  }
}

