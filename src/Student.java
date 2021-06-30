import java.util.List;

public class Student {
    private Classes cls;
    private String name;
    private List<Boolean> theList;
    private int averageOfMarks = 0;
    private int totalDaysTaught = 0;
    private int totalEarnings = 0;
    static int totalE = 0;

    public Student(Classes cls, String name, List<Boolean> theList, int averageOfMarks, int totalDaysTaught, int totalEarnings) {
        this.cls = cls;
        this.name = name;
        this.theList = theList;
        this.averageOfMarks = averageOfMarks;
        this.totalDaysTaught = totalDaysTaught;
        this.totalEarnings = totalEarnings;
    }

    public void setTotalEarnings(int totalEarnings) {
        this.totalEarnings = totalEarnings;
        totalE = totalE + totalEarnings;
    }

    public Classes getCls() {
        return cls;
    }

    public void setCls(Classes cls) {
        this.cls = cls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Boolean> getTheList() {
        return theList;
    }

    public void setTheList(List<Boolean> theList) {
        this.theList = theList;
    }

    public int getAverageOfMarks() {
        //System.out.println("get averageofMarks: " + averageOfMarks);
        return averageOfMarks;
    }

    public void setAverageOfMarks(int averageOfMarks, int count) {
        //System.out.println("mark: " + averageOfMarks + " count: " + count);
        this.averageOfMarks = averageOfMarks/count;
    }

    int count= 0;
    int marks = 0;
    public void setMarks(int mark) {
        marks = marks + mark;
        count++;
        setAverageOfMarks(marks, count);
    }

    public int getMarks() {
        return marks;
    }

    public int getTotalDaysTaught() {
        return totalDaysTaught;
    }

    public void setTotalDaysTaught(int totalDaysTaught) {
        this.totalDaysTaught = totalDaysTaught + totalDaysTaught;
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }

    static int calculateEarnings( List<Boolean> theList, int days) {
        int earnings = 0;

        if (theList.get(0) == true && theList.get(1) == true && theList.get(2) == true) {
            earnings = 3*days;
            Math.setEarnings(days);
            English.setEarnings(days);
            Bangla.setEarnings(days);
        }
        if (theList.get(0) == true && theList.get(1) == true && theList.get(2) == false) {
            earnings = 2*days;
            Math.setEarnings(days);
            English.setEarnings(days);
        }
        if (theList.get(0) == true && theList.get(1) == false && theList.get(2) == true) {
            earnings = 2*days;
            Math.setEarnings(days);
            Bangla.setEarnings(days);
        }
        if (theList.get(0) == true && theList.get(1) == false && theList.get(2) == false) {
            earnings = 1*days;
            Math.setEarnings(days);
        }
        if (theList.get(0) == false && theList.get(1) == true && theList.get(2) == true) {
            earnings = 2*days;
            English.setEarnings(days);
            Bangla.setEarnings(days);
        }
        if (theList.get(0) == false && theList.get(1) == true && theList.get(2) == false) {
            earnings = 1*days;
            English.setEarnings(days);
        }
        if (theList.get(0) == false && theList.get(1) == false && theList.get(2) == true) {
            earnings = 1*days;
            Bangla.setEarnings(days);
        }
        return earnings;
    }
}
