package day5;

public class Student {
    //filed / instance variable
    private int studentNumber;
    private String studentName;
    private int studentAge;
    private String studentGender;

    public void setStudentAge(int studentAge) {
        if(studentAge<1){
//            throw new RuntimeException("invalid age");
            System.out.println("invalid age");
        }else {
            this.studentAge = studentAge;
        }
    }
}
