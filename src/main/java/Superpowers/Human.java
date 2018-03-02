package Superpowers;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {

   private String name;
   private int age;
   private String gender;
   private String occupation;
   private String address;

   public Human(){

   }

   public Human(String name, int age, String gender, String occupation, String address){
       this.name = name;
       this.age = age;
       this.gender = gender;
       this.occupation = occupation;
       this.address = address;

   }

   public String getName(){
       return name;
   }

    public int getAge() {
        return age;
    }

    public String getGender(){
       return gender;
    }

    public String getOccupation(){
       return occupation;
    }

    public String getAddress(){
       return address;
    }
}


