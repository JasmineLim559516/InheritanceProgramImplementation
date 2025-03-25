public class MiddleSchoolStudent extends Student {
    
    private String interest;
    
    public MiddleSchoolStudent(String name, int age, int grade, String interest)
    {
        super(name, age, grade);
        this.interest = interest;
    }
    
    public void exploreInterest()
    {
        System.out.println("I am exploring " + interest + "!");
    }
    
    public void study()
    {
        System.out.println("I studied for an hour");
    }
    
    public void sleep()
    {
        System.out.println("I slept for 7 hours last night");
    }
    
    public void leisureTime()
    {
        System.out.println("I've been relaxing for 2 hours");
    }
    
    public String getInterest()
    {
        return interest;
    }
    
    public void setInterest(String interest)
    {
        this.interest = interest;
    }
}
