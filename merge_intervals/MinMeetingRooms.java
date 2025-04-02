import java.util.*;

class Meeting {
  int start;
  int end;

  public Meeting(int start, int end) {
    this.start = start;
    this.end = end;
  }
  public String toString(){
    return  Integer.toString(start) + "," + Integer.toString(start);
  }
};

class MinMeetingRooms {

  public static int findMinimumMeetingRooms(List<Meeting> meetings) {
    int minRooms = 0;
    int meetingRoomsInUse = 0;
    Collections.sort(meetings,(a,b) -> Integer.compare(a.start, b.start));
    Iterator<Meeting> itr = meetings.iterator();
    Meeting meeting = itr.next();
    int start = meeting.start;
    int end = meeting.end;
    minRooms++;
    meetingRoomsInUse++;

    ArrayList<Integer> endTimes = new ArrayList<>();
    endTimes.add(meeting.end);

    while(itr.hasNext()){

      Meeting meeting1 = itr.next();
      for( int endTime : endTimes){
        if(endTime <= meeting1.start)
          endTimes.remove(Integer.valueOf(endTime));
      }
      if(meeting1.start < end && endTimes.size() <= minRooms){
        minRooms++;
      }
      endTimes.add(meeting1.end);
      start = meeting1.start;
      end = meeting1.end;
    }
    return minRooms;
  }





public static void main(String[] args){

// Meetings: [[6,7], [2,4], [8,12]]
// Output: 1
// Explanation: None of the meetings overlap,
// therefore we only need one room to hold all meetings.
    ArrayList<Meeting> meetings = new ArrayList<>();
    meetings.add(new Meeting(6,7));
    meetings.add(new Meeting(2,4));
    meetings.add(new Meeting(8,12));
    System.out.println(findMinimumMeetingRooms(meetings));
    // Meetings: [[1,4], [2,3], [3,6]]
    // Output:2
    // Explanation: Since [1,4] overlaps with the other two meetings [2,3] and [3,6],
    //  we need two rooms to hold all the meetings.
    ArrayList<Meeting> meetingsOverlap = new ArrayList<>();
    meetingsOverlap.add(new Meeting(1,4));
    meetingsOverlap.add(new Meeting(2,3));
    meetingsOverlap.add(new Meeting(3,6));
    System.out.println(findMinimumMeetingRooms(meetings));

    // sorted : [[2,3],[2,4],[3,5],[4,5],]
    //[2,3] - minRoom =1, inUse= 1, endTime = 3
    // [2,4] 2 < 3 = minRoom= 2, inUse =2 , endTime=[3,4]
    // [2,3],[2,4],[3,5]. currentstart = 3 remove 3 from endTime = [4] inUse = 1
    // currentStart = 4 > endTime inUse = 1
}
}

