package cwk4; 


/**
 * Details of your team
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teamwork
{
    private String[] details = new String[12];
    
    public Teamwork()
    {   // in each line replace the contents of the String 
        // with the details of your team member
        // Please list the member details alphabetically by surname 
        // i.e. the surname of member1 should come alphabetically 
        // before the surname of member 2...etc
        details[0] = "team number 19";
        
        details[1] = "Pulnar";
        details[2] = "Sekhar";
        details[3] = "20049396";

        details[4] = "Scales";
        details[5] = "David";
        details[6] = "21013221";

        details[7] = "Villaflor";
        details[8] = "Steven";
        details[9] = "20049870";


        details[10] = "Aydemir";
        details[11] = "arda";
        details[12] = "20051613";

    }
    
    public String[] getTeamDetails()
    {
        return details;
    }
    
    public void displayDetails()
    {
        for(String temp:details)
        {
            System.out.println(temp.toString());
        }
    }
}
        
