public class StudentTester
{
    public static void main(String[] args)
    {
        ElementarySchoolStudent korie = new ElementarySchoolStudent("Korie", 5, 1, "tag");
        MiddleSchoolStudent amy = new MiddleSchoolStudent("Amy", 12, 7, "engineering");
        HighSchoolStudent asher = new HighSchoolStudent("Asher", 16, 10, "library", true);
        
        korie.cry();
        amy.exploreInterest();
        asher.volunteer();
        asher.work();
        System.out.println("______");
        korie.attendClass();
        amy.attendClass();
        asher.attendClass();
        System.out.println("______");
        korie.study();
        amy.study();
        asher.study();
        korie.sleep();
        amy.sleep();
        asher.sleep();
        korie.leisureTime();
        amy.leisureTime();
        asher.leisureTime();
    }
}
