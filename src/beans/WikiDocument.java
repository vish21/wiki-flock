package beans;

/**
 * Created by sourabh.su on 21/01/17.
 */
public class WikiDocument {

    private String title;
    private String content;
    private String userName;
    private String teamName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String groupName) {
        this.teamName = groupName;
    }
}
