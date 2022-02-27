
class Test{
    public static void main(String[] args) {
        Student arr[] = {
                new Student(101, "Suyog"),
                new Student(102, "Rutik"),
                new Student(103, "Ankush"),
                new Student(104, "Vaishnavi"),
                new Student(104, "Jayshree")
        };
        
        for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i].roll + "\t"+ arr[i].name);
        }
         
    }
}

class Student {
    int roll;
    String name;
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}