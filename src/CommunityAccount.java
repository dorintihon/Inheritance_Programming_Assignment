import java.util.ArrayList;

public class CommunityAccount extends Account {
    private ArrayList<String> interestTopic;
    private String websiteLink;
    private String currentEvent;

    public CommunityAccount() {
        super();
        interestTopic=new ArrayList<>();
        websiteLink="No website";
        currentEvent="No event";

    }

    public CommunityAccount(String name, String dateCreated, String mainEmail, ArrayList<String> connections,
                            String linkToWebSite, String event) {
        super(name, dateCreated, mainEmail, connections);
        this.websiteLink = linkToWebSite;
        this.currentEvent = event;
    }
    /**
     * @return the interest
     */
    public ArrayList<String> getInterest() {
        return interestTopic;
    }
    /**
     * @param interest the interest to set
     */
    public void setInterest(ArrayList<String> interest) {
        this.interestTopic = interest;
    }
    /**
     * @return the linkToWebSite
     */
    public String getLinkToWebSite() {
        return websiteLink;
    }
    /**
     * @param linkToWebSite the linkToWebSite to set
     */
    public void setLinkToWebSite(String linkToWebSite) {
        this.websiteLink = linkToWebSite;
    }
    /**
     * @return the event
     */
    public String getEvent() {
        return currentEvent;
    }
    /**
     * @param event the event to set
     */
    public void setEvent(String event) {
        this.currentEvent = event;
        if(event.equals("Delete")){
            this.currentEvent = null;
        }
    }


    @Override
    public String toString() {
        return super.toString()+ ", interest=" + interestTopic + ", linkToWebSite=" + websiteLink + ", event=" + currentEvent ;
    }


}