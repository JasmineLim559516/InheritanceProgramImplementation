public class Student {
    
    private String name;
    private int age;
    private int grade;
    
    public Student(String name, int age, int grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public void attendClass()
    {
        System.out.println("I am attending class!");
    }
    
    public void study()
    {
        System.out.println("I am studying!");
    }
    
    public void sleep()
    {
        System.out.println("I am sleeping!");
    }
    
    public void leisureTime()
    {
        System.out.println("I am relaxing!");
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public int getGrade()
    {
        return grade;
    }
    
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
}
