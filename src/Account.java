import java.util.ArrayList;

public class Account {
    private String name;
    private String dateCreated;
    private String mainEmail;
    private ArrayList<String> connections;

    public Account() {
        name = "No name";
        dateCreated = "0/0/0000";
        mainEmail = "No Email";
        connections = new ArrayList<>();
    }

    public Account(String name, String dateCreated, String mainEmail, ArrayList<String> connections) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.mainEmail = mainEmail;
        this.connections = connections;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dateCreated
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the mainEmail
     */
    public String getMainEmail() {
        return mainEmail;
    }

    /**
     * @param mainEmail the mainEmail to set
     */
    public void setMainEmail(String mainEmail) {
        this.mainEmail = mainEmail;
    }

    /**
     * @return the connections
     */
    public ArrayList<String> getConnections() {
        return connections;
    }

    /**
     * @param connections the connections to set
     */
    public void setConnections(ArrayList<String> connections) {
        this.connections = connections;
    }

    @Override
    public String toString() {
        return "AccountName: " + name + ", dateCreated: " + dateCreated + ", mainEmail: " + mainEmail + ", connections: "
                + connections + "";
    }
}

