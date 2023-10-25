package Student;

import java.util.Scanner;

class StudentInterface{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Student student = new Student();

      System.out.print("Enter first name: ");
      String firstName = sc.next();
      student.setFirstName(firstName);

      System.out.print("Enter middle name: ");
      String middleName = sc.next();
      student.setMiddleName(middleName);

      System.out.print("Enter last name: ");
      String lastName = sc.next();
      student.setLastName(lastName);
        
      System.out.print("Enter suffix: ");
      String suffix = sc.next();
      student.setSuffix(suffix);

      System.out.println(student.getFullName()); 
   }
}


