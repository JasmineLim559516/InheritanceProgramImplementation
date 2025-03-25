public class ElementarySchoolStudent extends Student {

    private String favoriteGame;
    
    public ElementarySchoolStudent(String name, int age, int grade, String favoriteGame)
    {
        super(name, age, grade);
        this.favoriteGame = favoriteGame;
    }
    
    public void cry()
    {
        System.out.println("I am crying T-T");
    }
    
    public void study()
    {
        System.out.println("I studied for 10 minutes");
    }
    
    public void sleep()
    {
        System.out.println("I slept for 12 hours last night :D");
    }
    
    public void leisureTime()
    {
        System.out.println("I've been playing " + favoriteGame + " for 3 hours!");
    }
    
    public String getFavoriteGame()
    {
        return favoriteGame;
    }
    
    public void setFavoriteGame(String game)
    {
        favoriteGame = game;
    }
}
