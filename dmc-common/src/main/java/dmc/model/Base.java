package dmc.model;

public class Base {

    private String label;
    private String ref;
    private String sha;
    private User user;
    private Repo repo;
    /**
     * Gets the label
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }
    /**
     * Sets the label
     *
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /**
     * Gets the ref
     *
     * @return the ref
     */
    public String getRef() {
        return ref;
    }
    /**
     * Sets the ref
     *
     * @param ref the ref to set
     */
    public void setRef(String ref) {
        this.ref = ref;
    }
    /**
     * Gets the sha
     *
     * @return the sha
     */
    public String getSha() {
        return sha;
    }
    /**
     * Sets the sha
     *
     * @param sha the sha to set
     */
    public void setSha(String sha) {
        this.sha = sha;
    }
    /**
     * Gets the user
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }
    /**
     * Sets the user
     *
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
    /**
     * Gets the repo
     *
     * @return the repo
     */
    public Repo getRepo() {
        return repo;
    }
    /**
     * Sets the repo
     *
     * @param repo the repo to set
     */
    public void setRepo(Repo repo) {
        this.repo = repo;
    }
    
    
}
