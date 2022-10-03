package daily.java;

public class SampleClass {

    public static void main(String[] args) {

        //person1 object of Person class type
        Person person1 = new Person();

        //Initializing person1 Object fields
        person1.personName = "Tony";
        person1.personId = "Tony123";
        person1.personLocation = "Rome";

        //Invoke person1 object method
        person1.displayPersonInfo();
    }
}

class Person{
    //class fields
    public String personName;
    public String personId;
    public String personLocation;

    //class method
    public void displayPersonInfo() {
        System.out.println(personId + " : " + personName + " lives in " + personLocation);
    }

}
