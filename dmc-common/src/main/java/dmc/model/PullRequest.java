package dmc.model;

public class PullRequest {

    private String url;
    private int id;
    private String html_url;
    private String diff_url;
    private String patch_url;
    private int number;
    private String state;
    private boolean locked;
    private String title;
    private User user;
    private String body;
    private String created_at;
    private String updated_at;
    private String closed_at;
    private String merged_at;
    private String merge_commit_sha;
    private User assignee;
    private Milestone milestone;
    private String commits_url;
    private String review_comments_url;
    private String review_comment_url;
    private String comments_url;
    private String statuses_url;
    private Head head;
    private Base base;
    private String issue_url;
    private Links _links;
    private String merged;
    private String mergeable;
    private String mergeable_state;
    private User merged_by;
    private String comments;
    private String review_comments;
    private String commits;
    private String additions;
    private String deletions;
    private String changed_files;
    private String href;

    /**
     * Gets the deletions
     *
     * @return the deletions
     */
    public String getDeletions() {
        return deletions;
    }

    /**
     * Sets the deletions
     *
     * @param deletions the deletions to set
     */
    public void setDeletions(String deletions) {
        this.deletions = deletions;
    }

    /**
     * Gets the changed_files
     *
     * @return the changed_files
     */
    public String getChanged_files() {
        return changed_files;
    }

    /**
     * Sets the changed_files
     *
     * @param changed_files the changed_files to set
     */
    public void setChanged_files(String changed_files) {
        this.changed_files = changed_files;
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
     * Gets the diff_url
     *
     * @return the diff_url
     */
    public String getDiff_url() {
        return diff_url;
    }

    /**
     * Sets the diff_url
     *
     * @param diff_url the diff_url to set
     */
    public void setDiff_url(String diff_url) {
        this.diff_url = diff_url;
    }

    /**
     * Gets the patch_url
     *
     * @return the patch_url
     */
    public String getPatch_url() {
        return patch_url;
    }

    /**
     * Sets the patch_url
     *
     * @param patch_url the patch_url to set
     */
    public void setPatch_url(String patch_url) {
        this.patch_url = patch_url;
    }

    /**
     * Gets the number
     *
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the number
     *
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Gets the state
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state
     *
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the locked
     *
     * @return the locked
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets the locked
     *
     * @param locked the locked to set
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    /**
     * Gets the title
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title
     *
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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
     * Gets the closed_at
     *
     * @return the closed_at
     */
    public String getClosed_at() {
        return closed_at;
    }

    /**
     * Sets the closed_at
     *
     * @param closed_at the closed_at to set
     */
    public void setClosed_at(String closed_at) {
        this.closed_at = closed_at;
    }

    /**
     * Gets the merged_at
     *
     * @return the merged_at
     */
    public String getMerged_at() {
        return merged_at;
    }

    /**
     * Sets the merged_at
     *
     * @param merged_at the merged_at to set
     */
    public void setMerged_at(String merged_at) {
        this.merged_at = merged_at;
    }

    /**
     * Gets the merge_commit_sha
     *
     * @return the merge_commit_sha
     */
    public String getMerge_commit_sha() {
        return merge_commit_sha;
    }

    /**
     * Sets the merge_commit_sha
     *
     * @param merge_commit_sha the merge_commit_sha to set
     */
    public void setMerge_commit_sha(String merge_commit_sha) {
        this.merge_commit_sha = merge_commit_sha;
    }

    /**
     * Gets the assignee
     *
     * @return the assignee
     */
    public User getAssignee() {
        return assignee;
    }

    /**
     * Sets the assignee
     *
     * @param assignee the assignee to set
     */
    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    /**
     * Gets the milestone
     *
     * @return the milestone
     */
    public Milestone getMilestone() {
        return milestone;
    }

    /**
     * Sets the milestone
     *
     * @param milestone the milestone to set
     */
    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    /**
     * Gets the commits_url
     *
     * @return the commits_url
     */
    public String getCommits_url() {
        return commits_url;
    }

    /**
     * Sets the commits_url
     *
     * @param commits_url the commits_url to set
     */
    public void setCommits_url(String commits_url) {
        this.commits_url = commits_url;
    }

    /**
     * Gets the review_comments_url
     *
     * @return the review_comments_url
     */
    public String getReview_comments_url() {
        return review_comments_url;
    }

    /**
     * Sets the review_comments_url
     *
     * @param review_comments_url the review_comments_url to set
     */
    public void setReview_comments_url(String review_comments_url) {
        this.review_comments_url = review_comments_url;
    }

    /**
     * Gets the review_comment_url
     *
     * @return the review_comment_url
     */
    public String getReview_comment_url() {
        return review_comment_url;
    }

    /**
     * Sets the review_comment_url
     *
     * @param review_comment_url the review_comment_url to set
     */
    public void setReview_comment_url(String review_comment_url) {
        this.review_comment_url = review_comment_url;
    }

    /**
     * Gets the comments_url
     *
     * @return the comments_url
     */
    public String getComments_url() {
        return comments_url;
    }

    /**
     * Sets the comments_url
     *
     * @param comments_url the comments_url to set
     */
    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    /**
     * Gets the statuses_url
     *
     * @return the statuses_url
     */
    public String getStatuses_url() {
        return statuses_url;
    }

    /**
     * Sets the statuses_url
     *
     * @param statuses_url the statuses_url to set
     */
    public void setStatuses_url(String statuses_url) {
        this.statuses_url = statuses_url;
    }

    /**
     * Gets the head
     *
     * @return the head
     */
    public Head getHead() {
        return head;
    }

    /**
     * Sets the head
     *
     * @param head the head to set
     */
    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * Gets the base
     *
     * @return the base
     */
    public Base getBase() {
        return base;
    }

    /**
     * Sets the base
     *
     * @param base the base to set
     */
    public void setBase(Base base) {
        this.base = base;
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
     * Gets the merged
     *
     * @return the merged
     */
    public String getMerged() {
        return merged;
    }

    /**
     * Sets the merged
     *
     * @param merged the merged to set
     */
    public void setMerged(String merged) {
        this.merged = merged;
    }

    /**
     * Gets the mergeable
     *
     * @return the mergeable
     */
    public String getMergeable() {
        return mergeable;
    }

    /**
     * Sets the mergeable
     *
     * @param mergeable the mergeable to set
     */
    public void setMergeable(String mergeable) {
        this.mergeable = mergeable;
    }

    /**
     * Gets the mergeable_state
     *
     * @return the mergeable_state
     */
    public String getMergeable_state() {
        return mergeable_state;
    }

    /**
     * Sets the mergeable_state
     *
     * @param mergeable_state the mergeable_state to set
     */
    public void setMergeable_state(String mergeable_state) {
        this.mergeable_state = mergeable_state;
    }

    /**
     * Gets the merged_by
     *
     * @return the merged_by
     */
    public User getMerged_by() {
        return merged_by;
    }

    /**
     * Sets the merged_by
     *
     * @param merged_by the merged_by to set
     */
    public void setMerged_by(User merged_by) {
        this.merged_by = merged_by;
    }

    /**
     * Gets the comments
     *
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the comments
     *
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Gets the review_comments
     *
     * @return the review_comments
     */
    public String getReview_comments() {
        return review_comments;
    }

    /**
     * Sets the review_comments
     *
     * @param review_comments the review_comments to set
     */
    public void setReview_comments(String review_comments) {
        this.review_comments = review_comments;
    }

    /**
     * Gets the commits
     *
     * @return the commits
     */
    public String getCommits() {
        return commits;
    }

    /**
     * Sets the commits
     *
     * @param commits the commits to set
     */
    public void setCommits(String commits) {
        this.commits = commits;
    }

    /**
     * Gets the additions
     *
     * @return the additions
     */
    public String getAdditions() {
        return additions;
    }

    /**
     * Sets the additions
     *
     * @param additions the additions to set
     */
    public void setAdditions(String additions) {
        this.additions = additions;
    }

    /**
     * Gets the href
     *
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the href
     *
     * @param href the href to set
     */
    public void setHref(String href) {
        this.href = href;
    }

}
