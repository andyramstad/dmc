package dmc.model;

public class Commit {

    private String sha;
    private Committer author;
    private String message;
    private boolean distinct;
    private String url;

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
     * Gets the author
     *
     * @return the author
     */
    public Committer getAuthor() {
        return author;
    }

    /**
     * Sets the author
     *
     * @param author the author to set
     */
    public void setAuthor(Committer author) {
        this.author = author;
    }

    /**
     * Gets the message
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message
     *
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the distinct
     *
     * @return the distinct
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Sets the distinct
     *
     * @param distinct the distinct to set
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * Gets the url
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url
     *
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
