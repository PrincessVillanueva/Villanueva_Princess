package Student; 

public class Student{ 

   private String firstName;
   private String middleName;
   private String lastName;
   private String suffix;

   public Student(){
        
   }

   public String getFirstName(){
      return firstName;
   }

   public String getMiddleName(){
      return middleName;
   }

   public String getLastName(){
      return lastName;
   }

   public String getSuffix(){
      return suffix;
   }

   public void setFirstName(String fName){
      firstName = fName; 
   }

   public void setMiddleName(String mName){
      middleName = mName; 
   }

   public void setLastName(String lName){
      lastName = lName; 
   }

   public void setSuffix(String suf){
      suffix = suf; 
   }

   public String getFullName(){
      return firstName + " " + middleName + " " + lastName + " " + suffix;
   }
}