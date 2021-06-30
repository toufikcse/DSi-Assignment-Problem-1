public class Classes {
    private String clsName;
    private static int days = 0;
    static int earnings = 0;

    public static void setTotalDaysTaughtAllClasses(int x) {
        days = days + x;
    }

    public static int getTotalDaysTaughtAllClasses() {
        return days;
    }
}

class Eight extends Classes {
    private static int daysTaught = 0;
    String clsName = "Eight";
    int earnings = 0;

    public String getClsName() {
        return clsName;
    }

    public void setClsName(String clsName) {
        this.clsName = clsName;
    }

    public static int getDaysTaught() {
        return daysTaught;
    }

    public static void setDaysTaught(int days) {
        Classes.setTotalDaysTaughtAllClasses(days);
        daysTaught = daysTaught + days;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
}

class Nine extends Classes {
    String clsName = "Nine";
    static int daysTaught = 0;
    int earnings = 0;

    public String getClsName() {
        return clsName;
    }

    public void setClsName(String clsName) {
        this.clsName = clsName;
    }

    public static int getDaysTaught() {
        return daysTaught;
    }

    public static void setDaysTaught(int days) {
        Classes.setTotalDaysTaughtAllClasses(days);
        daysTaught = daysTaught + days;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
}

class Ten extends Classes {
    String clsName = "Ten";
    static int daysTaught = 0;
    int earnings = 0;

    public String getClsName() {
        return clsName;
    }

    public void setClsName(String clsName) {
        this.clsName = clsName;
    }

    public static int getDaysTaught() {
        return daysTaught;
    }

    public static void setDaysTaught(int days) {
        Classes.setTotalDaysTaughtAllClasses(days);
        daysTaught = daysTaught + days;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
}
