package dmc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {

    private String url;
    private String html_url;
    private String issue_url;
    private int id;
    private User user;
    private String created_at;
    private String updated_at;
    private String body;
    private String position;
    private String diff_hunk;
    private String line;
    private String path;
    private String original_position;
    private String commit_id;
    private String original_commit_id;
    private String pull_request_url;
    private Links _links;

    /**
     * Gets the _links
     *
     * @return the _links
     */
    public Links get_links() {
        return _links;
    }

    /**
     * Sets the _links
     *
     * @param _links the _links to set
     */
    public void set_links(Links _links) {
        this._links = _links;
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

    /**
     * Gets the html_url
     *
     * @return the html_url
     */
    public String getHtml_url() {
        return html_url;
    }

    /**
     * Sets the html_url
     *
     * @param html_url the html_url to set
     */
    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    /**
     * Gets the issue_url
     *
     * @return the issue_url
     */
    public String getIssue_url() {
        return issue_url;
    }

    /**
     * Sets the issue_url
     *
     * @param issue_url the issue_url to set
     */
    public void setIssue_url(String issue_url) {
        this.issue_url = issue_url;
    }

    /**
     * Gets the id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * Gets the created_at
     *
     * @return the created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * Sets the created_at
     *
     * @param created_at the created_at to set
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * Gets the updated_at
     *
     * @return the updated_at
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * Sets the updated_at
     *
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * Gets the body
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the body
     *
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Gets the position
     *
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the position
     *
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Gets the diff_hunk
     *
     * @return the diff_hunk
     */
    public String getDiff_hunk() {
        return diff_hunk;
    }

    /**
     * Sets the diff_hunk
     *
     * @param diff_hunk the diff_hunk to set
     */
    public void setDiff_hunk(String diff_hunk) {
        this.diff_hunk = diff_hunk;
    }

    /**
     * Gets the line
     *
     * @return the line
     */
    public String getLine() {
        return line;
    }

    /**
     * Sets the line
     *
     * @param line the line to set
     */
    public void setLine(String line) {
        this.line = line;
    }

    /**
     * Gets the path
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the path
     *
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Gets the original_position
     *
     * @return the original_position
     */
    public String getOriginal_position() {
        return original_position;
    }

    /**
     * Sets the original_position
     *
     * @param original_position the original_position to set
     */
    public void setOriginal_position(String original_position) {
        this.original_position = original_position;
    }

    /**
     * Gets the commit_id
     *
     * @return the commit_id
     */
    public String getCommit_id() {
        return commit_id;
    }

    /**
     * Sets the commit_id
     *
     * @param commit_id the commit_id to set
     */
    public void setCommit_id(String commit_id) {
        this.commit_id = commit_id;
    }

    /**
     * Gets the original_commit_id
     *
     * @return the original_commit_id
     */
    public String getOriginal_commit_id() {
        return original_commit_id;
    }

    /**
     * Sets the original_commit_id
     *
     * @param original_commit_id the original_commit_id to set
     */
    public void setOriginal_commit_id(String original_commit_id) {
        this.original_commit_id = original_commit_id;
    }

    /**
     * Gets the pull_request_url
     *
     * @return the pull_request_url
     */
    public String getPull_request_url() {
        return pull_request_url;
    }

    /**
     * Sets the pull_request_url
     *
     * @param pull_request_url the pull_request_url to set
     */
    public void setPull_request_url(String pull_request_url) {
        this.pull_request_url = pull_request_url;
    }

}
