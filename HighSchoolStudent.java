public class HighSchoolStudent extends Student {
    
    private String volunteerPlace;
    private boolean hasJob;
    
    public HighSchoolStudent(String name, int age, int grade, String volunteerPlace, boolean job)
    {
        super(name, age, grade);
        this.volunteerPlace = volunteerPlace;
        hasJob = job;
    }
    
    public void volunteer()
    {
        System.out.println("I am volunteering at the " + volunteerPlace);
    }
    
    public void work()
    {
        if (hasJob)
        {
            System.out.println("I am working");
        }
        else
        {
            System.out.println("I don't have a job");
        }
    }
    
    public void study()
    {
        System.out.println("I studied for 4 hours");
    }
    
    public void sleep()
    {
        System.out.println("I slept for 3 hours last night");
    }
    
    public void leisureTime()
    {
        System.out.println("I've been relaxing for 1 hour");
    }
    
    public String getVolunteerPlace()
    {
        return volunteerPlace;
    }
    
    public void setVolunteerPlace(String place)
    {
        volunteerPlace = place;
    }
    
    public boolean getVocationalState()
    {
        return hasJob;
    }
    
    public void setVocationalState(boolean job)
    {
        hasJob = job;
    }
}
