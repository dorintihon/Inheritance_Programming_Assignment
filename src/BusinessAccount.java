import java.util.ArrayList;

public class BusinessAccount extends Account {
    private ArrayList<String> jobs;
    private String secondaryEmail;
    private int numberOfDays;

    public BusinessAccount(String name, String dateCreated, String mainEmail, ArrayList<String> connections,
                           String secondaryEmail, int numberOfDays) {
        super(name, dateCreated, mainEmail, connections);
        this.secondaryEmail = secondaryEmail;
        this.numberOfDays = numberOfDays;
    }
    /**
     * @return the jobs
     */
    public ArrayList<String> getJobs() {
        return jobs;
    }
    /**
     * @param jobs the jobs to set
     */
    public void setJobs(ArrayList<String> jobs) {
        this.jobs = jobs;
        if(jobs.isEmpty()){
            this.jobs = null;
        }
    }
    /**
     * @return the secondaryEmail
     */
    public String getSecondaryEmail() {
        return secondaryEmail;
    }
    /**
     * @param secondaryEmail the secondaryEmail to set
     */
    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }
    /**
     * @return the numberOfDays
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }
    /**
     * @param numberOfDays the numberOfDays to set
     */
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return super.toString()+", jobs: " + jobs + ", secondaryEmail: " + secondaryEmail + ", numberOfDays: " + numberOfDays;
    }

}