import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create subject objects
        Subjects theBangla = new Bangla("Bangla");
        Subjects theEnglish = new English("English");
        Subjects theMath = new Math("Math");

        // create Classes objects
        Classes theEight = new Eight();
        Classes theNine = new Nine();
        Classes theTen = new Ten();

        List<Student> studentList = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            System.out.println("1. Add a student");
            System.out.println("2. Edit a student");
            System.out.println("3. Delete a student");
            System.out.println("4. See the list of students individually");
            System.out.println("5. See overall info");
            System.out.println("0. Stop this Program");
            System.out.println("Choose above any operation: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1:
                    System.out.println("Enter Class any one:");
                    System.out.println(" 1 for Eight");
                    System.out.println(" 2 for Nine");
                    System.out.println(" 3 for Ten");

                    int num2 = scanner.nextInt();
                    scanner.nextLine();
                    Classes theClass;

                    switch (num2) {
                        case 1:
                            theClass = theEight;
                            break;
                        case 2:
                            theClass = theNine;
                            break;
                        case 3:
                            theClass = theTen;
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + num2);
                    }
                    System.out.println("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Choose subjects: using boolean true/false input like [Example: Bangla : true]");

                    List<Boolean> atList = new ArrayList<>();
                    ArrayList<Subjects> ls = new ArrayList<>();
                    ls.add(theMath);
                    ls.add(theEnglish);
                    ls.add(theBangla);

                    boolean is;
                    for (int i = 0; i < 3; i++) {
                        System.out.print(ls.get(i).name + " : ");
                        is = scanner.nextBoolean();
                        atList.add(is);
                    }

                    System.out.println("Average of marks: by default 0 at first");
                    //int averageOfMarks = scanner.nextInt();
                    //scanner.nextLine();
                    System.out.println("Total Days Taught: by default 0 at first");
                    //int totalDaysTaught = scanner.nextInt();
                    //scanner.nextLine();
                    System.out.println("Total Earnings: by default 0 at first");
                    //int totalEarnings = scanner.nextInt();

                    studentList.add(new Student(theClass, name, atList, 0, 0, 0));

                    break;

                case 2:
                    System.out.println("Choose student for edit (Enter Student Name): ");
                    String n1 = scanner.nextLine();
                    System.out.println("Enter number of days taught");
                    int days = scanner.nextInt();
                    scanner.nextLine();
                    int earnings = 0;
                    int index = 0;
                    for (int i=0; i<studentList.size(); i++) {
                        if (n1.equals(studentList.get(i).getName())) {
                            index = i;
                            studentList.get(i).setTotalDaysTaught(days);
                            if (theEight.getClass().equals(studentList.get(i).getCls().getClass())) {
                                Eight.setDaysTaught(days);
                            }
                            if (theNine.getClass().equals(studentList.get(i).getCls().getClass())) {
                                Nine.setDaysTaught(days);
                            }
                            if (theTen.getClass().equals(studentList.get(i).getCls().getClass())) {
                                Ten.setDaysTaught(days);
                            }
                            earnings = Student.calculateEarnings(studentList.get(i).getTheList(), days);
                            studentList.get(i).setTotalEarnings(earnings);
                        }
                    }

                    int mark;
                    boolean flag2 = true;
                    int check;
                    while (flag2) {
                        System.out.println("To continue Add marks press 1 or Stop add marks press 0");
                        check = scanner.nextInt();
                        scanner.nextLine();
                        switch (check) {
                            case 1:
                                System.out.println("Enter mark in exam");
                                mark = scanner.nextInt();
                                scanner.nextLine();
                                studentList.get(index).setMarks(mark);
                                break;

                            case 0:
                                flag2 = false;
                                break;
                        }
                       // for (int i = 0; i < studentList.size(); i++) {
                            //if (n1.equals(studentList.get(i).getName())) {
                               // studentList.get(i).setMarks(mark);
                               // earnings = Student.calculateEarnings(studentList.get(i).getTheList(), days);
                               // studentList.get(i).setTotalEarnings(earnings);
                            //}
                        //}
                    }
                    break;

                case 3:
                    System.out.println("Enter Student Name for Delete: ");
                    String name2 = scanner.nextLine();
                    for (int i=0; i<studentList.size(); i++) {
                        if (name2.equals(studentList.get(i).getName())) {
                            studentList.remove(i);
                        }
                    }
                    break;

                case 4:
                    System.out.println("1 Choose a specific class");
                    System.out.println("2 Choose a specific student");
                    int key = scanner.nextInt();
                    scanner.nextLine();
                    switch (key) {
                        case 1:
                            System.out.println("1: class Eight");
                            System.out.println("2: class Nine");
                            System.out.println("3: class Ten");
                            int cls = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Name\t" + "Total earnings\t" + "Average marks");

                            switch (cls) {
                                case 1:
                                    for (int i = 0; i < studentList.size(); i++) {
                                        boolean result = theEight.getClass().equals(studentList.get(i).getCls().getClass());
                                        if (result) {
                                            System.out.println(studentList.get(i).getName() + " \t " + studentList.get(i).getTotalEarnings() + " \t " + studentList.get(i).getAverageOfMarks());
                                        }
                                    }
                                    break;

                                case 2:
                                    for (int i = 0; i < studentList.size(); i++) {
                                        boolean result = theNine.getClass().equals(studentList.get(i).getCls().getClass());
                                        if (result) {
                                            System.out.println(studentList.get(i).getName() + " \t " + studentList.get(i).getTotalEarnings() + " \t " + studentList.get(i).getAverageOfMarks());
                                        }
                                    }
                                    break;

                                case 3:
                                    for (int i = 0; i < studentList.size(); i++) {
                                        boolean result = theTen.getClass().equals(studentList.get(i).getCls().getClass());
                                        if (result) {
                                            System.out.println(studentList.get(i).getName() + " \t " + studentList.get(i).getTotalEarnings() + " \t " + studentList.get(i).getAverageOfMarks());
                                        }
                                    }
                                    break;
                            }
                            break;

                    case 2:
                        System.out.println("pick one student: Enter Name");
                        String s1 = scanner.nextLine();
                        for (int j=0; j<studentList.size(); j++) {
                            if (s1.equals(studentList.get(j).getName())) {
                                System.out.println("Name\t"  + "Class\t" + "Total earnings\t" + "Average marks");
                                System.out.println(studentList.get(j).getName() + "\t" + studentList.get(j).getCls().getClass() +" \t " + studentList.get(j).getTotalEarnings() + " \t " + studentList.get(j).getAverageOfMarks());
                            }
                        }
                        break;
                    }
                    break;

                case 5:
                    int totalEarnings = 0;
                    System.out.println("The total days taught across all classes");
                    System.out.println(Classes.getTotalDaysTaughtAllClasses());

                    System.out.println("Individual days taught in each class");
                    System.out.println("\tClass Eight: " + Eight.getDaysTaught());
                    System.out.println("\tClass Nine: " + Nine.getDaysTaught());
                    System.out.println("\tClass Ten: " + Ten.getDaysTaught());

                    System.out.println("Total earnings");
                    System.out.println(Student.totalE + " BDT");

                    System.out.println("Individual earnings of each class");
                    int eightEarning = 0;
                    int nineEarning = 0;
                    int tenEarning = 0;
                    for (int i=0; i<studentList.size(); i++) {
                        if (theEight.getClass().equals(studentList.get(i).getCls().getClass())) {
                            eightEarning = eightEarning + studentList.get(i).getTotalEarnings();
                        }
                        if (theNine.getClass().equals(studentList.get(i).getCls().getClass())) {
                            nineEarning = nineEarning + studentList.get(i).getTotalEarnings();
                        }
                        if (theTen.getClass().equals(studentList.get(i).getCls().getClass())) {
                            tenEarning = tenEarning + studentList.get(i).getTotalEarnings();
                        }
                    }
                    System.out.println("\tEight: " + eightEarning + " BDT");
                    System.out.println("\tNine: " + nineEarning + " BDT");
                    System.out.println("\tTen: " + tenEarning + " BDT");

                    System.out.println("Individual earnings of each subject");
                    System.out.println("\tMath: " + Math.getEarnings() + " BDT");
                    System.out.println("\tEnglish: "+ English.getEarnings() + " BDT");
                    System.out.println("\tBangla: " + Bangla.getEarnings() + " BDT");

                    System.out.println("Average marks of all students");
                    int totalMark = 0;
                    int avgMark = 0;
                    for (int i=0; i<studentList.size(); i++) {
                        totalMark = totalMark + studentList.get(i).getAverageOfMarks();
                    }
                    avgMark = totalMark/studentList.size();
                    System.out.println(avgMark);
                    break;

                case 0:
                    System.out.println("Thank you for using app");
                    return;

                default:
                    throw new IllegalStateException("Unexpected value: " + num);
            }
        }
    }
}
