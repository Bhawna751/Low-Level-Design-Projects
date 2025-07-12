package.Contacts;

public class Contact{
    private String name;
    private String number;
    private List<String> tags;
    private UserPlan plan;
    private boolean locationAccess;

    public Contact(String name, String number, List<String> tags, UserPlan plan, boolean locationAccess) {
        this.name = name;
        this.number = number;
        this.tags = tags;
        this.plan = plan;
        this.locationAccess = locationAccess;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public List<String> getTags() {
        return tags;
    }

    public UserPlan getPlan() {
        return plan;
    }

    public boolean hasLocationAccess() {
        return locationAccess;
    }

    @Override
    public String toString(){
        return name + " - " + number + " - Plan: " + plan + " - Loaction Access: " + locationAccess + " Tags: " + tags;
    }
}