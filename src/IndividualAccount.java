import java.util.ArrayList;

public class IndividualAccount extends Account {
    private ArrayList<String> accomplishments;
    private ArrayList<String> skills;
    private String notice;
    private String educationDetails;

    public IndividualAccount(){
        accomplishments=new ArrayList<>();
        skills=new ArrayList<>();
        notice="";
        educationDetails="";
    }
    public IndividualAccount(String name, String dateCreated, String mainEmail, ArrayList<String> connections,
                             String notice, String educationDetails) {
        super(name, dateCreated, mainEmail, connections);
        this.notice = notice;
        this.educationDetails = educationDetails;
    }
    /**
     * @return the accomplishments
     */
    public ArrayList<String> getAccomplishments() {
        return accomplishments;
    }
    /**
     * @param accomplishments the accomplishments to set
     */
    public void setAccomplishments(ArrayList<String> accomplishments) {
        this.accomplishments = accomplishments;
    }
    /**
     * @return the skills
     */
    public ArrayList<String> getSkills() {
        return skills;
    }
    /**
     * @param skills the skills to set
     */
    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
    /**
     * @return the notice
     */
    public String getNotice() {
        return notice;
    }
    /**
     * @param notice the notice to set
     */
    public void setNotice(String notice) {
        this.notice = notice;
        if (notice.equals("Delete")){
            this.notice= null;
        }

    }
    /**
     * @return the educationDetails
     */
    public String getEducationDetails() {
        return educationDetails;
    }
    /**
     * @param educationDetails the educationDetails to set
     */
    public void setEducationDetails(String educationDetails) {
        this.educationDetails = educationDetails;
    }


    @Override
    public String toString() {
        return super.toString()+ ", Accomplishments: " + accomplishments + ", Skills: " + skills + ", Notice: " + notice
                + ", EducationDetails: " + educationDetails;
    }

}