package dmc.model;

public class Links {

    private Href self;
    private Href html;
    private Href issue;
    private Href comments;
    private Href review_comments;
    private Href review_comment;
    private Href commits;
    private Href statuses;
    private PullRequest pull_request;

    /**
     * Gets the self
     *
     * @return the self
     */
    public Href getSelf() {
        return self;
    }

    /**
     * Sets the self
     *
     * @param self the self to set
     */
    public void setSelf(Href self) {
        this.self = self;
    }

    /**
     * Gets the html
     *
     * @return the html
     */
    public Href getHtml() {
        return html;
    }

    /**
     * Sets the html
     *
     * @param html the html to set
     */
    public void setHtml(Href html) {
        this.html = html;
    }

    /**
     * Gets the issue
     *
     * @return the issue
     */
    public Href getIssue() {
        return issue;
    }

    /**
     * Sets the issue
     *
     * @param issue the issue to set
     */
    public void setIssue(Href issue) {
        this.issue = issue;
    }

    /**
     * Gets the comments
     *
     * @return the comments
     */
    public Href getComments() {
        return comments;
    }

    /**
     * Sets the comments
     *
     * @param comments the comments to set
     */
    public void setComments(Href comments) {
        this.comments = comments;
    }

    /**
     * Gets the review_comments
     *
     * @return the review_comments
     */
    public Href getReview_comments() {
        return review_comments;
    }

    /**
     * Sets the review_comments
     *
     * @param review_comments the review_comments to set
     */
    public void setReview_comments(Href review_comments) {
        this.review_comments = review_comments;
    }

    /**
     * Gets the review_comment
     *
     * @return the review_comment
     */
    public Href getReview_comment() {
        return review_comment;
    }

    /**
     * Sets the review_comment
     *
     * @param review_comment the review_comment to set
     */
    public void setReview_comment(Href review_comment) {
        this.review_comment = review_comment;
    }

    /**
     * Gets the commits
     *
     * @return the commits
     */
    public Href getCommits() {
        return commits;
    }

    /**
     * Sets the commits
     *
     * @param commits the commits to set
     */
    public void setCommits(Href commits) {
        this.commits = commits;
    }

    /**
     * Gets the statuses
     *
     * @return the statuses
     */
    public Href getStatuses() {
        return statuses;
    }

    /**
     * Sets the statuses
     *
     * @param statuses the statuses to set
     */
    public void setStatuses(Href statuses) {
        this.statuses = statuses;
    }

    /**
     * Gets the pull_request
     *
     * @return the pull_request
     */
    public PullRequest getPull_request() {
        return pull_request;
    }

    /**
     * Sets the pull_request
     *
     * @param pull_request the pull_request to set
     */
    public void setPull_request(PullRequest pull_request) {
        this.pull_request = pull_request;
    }

}
