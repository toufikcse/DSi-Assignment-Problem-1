public class Subjects {
    String name;
    int daysTaught = 0;
    static int earnings = 0;

    public Subjects(String name) {
        this.name = name;
    }
}

class Math extends Subjects {
    String name;
    int daysTaught = 0;
    static int earnings = 0;

    public Math(String name) {
        super(name);
    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysTaught() {
        return daysTaught;
    }

    public void setDaysTaught(int daysTaught) {
        this.daysTaught = daysTaught;
    }

    public static int getEarnings() {
        return earnings;
    }

    public static void setEarnings(int earn) {
        earnings = earnings + earn;
    }
}

class English extends Subjects {
    String name;
    int daysTaught = 0;
    static int earnings = 0;

    public English(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysTaught() {
        return daysTaught;
    }

    public void setDaysTaught(int daysTaught) {
        this.daysTaught = daysTaught;
    }

    public static int getEarnings() {
        return earnings;
    }

    public static void setEarnings(int earn) {
        earnings = earnings + earn;
    }
}

class Bangla extends Subjects {
    String name;
    int daysTaught = 0;
    static int earnings = 0;

    public Bangla(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysTaught() {
        return daysTaught;
    }

    public void setDaysTaught(int daysTaught) {
        this.daysTaught = daysTaught;
    }

    public static int getEarnings() {
        return earnings;
    }

    public static void setEarnings(int earn) {
        earnings = earnings + earn;
    }
}


