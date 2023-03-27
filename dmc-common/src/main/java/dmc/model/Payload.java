package dmc.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Payload {

    private String ref;
    private String refType;
    private String masterBranch;
    private String description;
    private String pusherType;
    private String push_id;
    private String ref_type;
    private String size;
    private String master_branch;
    private String distinct_size;
    private String pusher_type;
    private String head;
    private String action;
    private String before;
    private String number;
    private Issue issue;
    private Date created_at;
    private List<Commit> commits;
    private PullRequest pull_request;
    private Release release;
    private Comment comment;
    private User member;
    private Forkee forkee;
    private List<Page> pages;

    @JsonAnySetter
    public void add(String property, String value) {
        System.out.println(property);
    }

    /**
     * Gets the number
     *
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the number
     *
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Gets the issue
     *
     * @return the issue
     */
    public Issue getIssue() {
        return issue;
    }

    /**
     * Sets the issue
     *
     * @param issue the issue to set
     */
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    /**
     * Gets the created_at
     *
     * @return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * Sets the created_at
     *
     * @param created_at the created_at to set
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * Gets the commits
     *
     * @return the commits
     */
    public List<Commit> getCommits() {
        return commits;
    }

    /**
     * Sets the commits
     *
     * @param commits the commits to set
     */
    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    /**
     * Gets the before
     *
     * @return the before
     */
    public String getBefore() {
        return before;
    }

    /**
     * Sets the before
     *
     * @param before the before to set
     */
    public void setBefore(String before) {
        this.before = before;
    }

    /**
     * Gets the pusher_type
     *
     * @return the pusher_type
     */
    public String getPusher_type() {
        return pusher_type;
    }

    /**
     * Sets the pusher_type
     *
     * @param pusher_type the pusher_type to set
     */
    public void setPusher_type(String pusher_type) {
        this.pusher_type = pusher_type;
    }

    /**
     * Gets the head
     *
     * @return the head
     */
    public String getHead() {
        return head;
    }

    /**
     * Sets the head
     *
     * @param head the head to set
     */
    public void setHead(String head) {
        this.head = head;
    }

    /**
     * Gets the action
     *
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action
     *
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Gets the master_branch
     *
     * @return the master_branch
     */
    public String getMaster_branch() {
        return master_branch;
    }

    /**
     * Sets the master_branch
     *
     * @param master_branch the master_branch to set
     */
    public void setMaster_branch(String master_branch) {
        this.master_branch = master_branch;
    }

    /**
     * Gets the distinct_size
     *
     * @return the distinct_size
     */
    public String getDistinct_size() {
        return distinct_size;
    }

    /**
     * Sets the distinct_size
     *
     * @param distinct_size the distinct_size to set
     */
    public void setDistinct_size(String distinct_size) {
        this.distinct_size = distinct_size;
    }

    /**
     * Gets the ref_type
     *
     * @return the ref_type
     */
    public String getRef_type() {
        return ref_type;
    }

    /**
     * Sets the ref_type
     *
     * @param ref_type the ref_type to set
     */
    public void setRef_type(String ref_type) {
        this.ref_type = ref_type;
    }

    /**
     * Gets the size
     *
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the size
     *
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
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
     * Gets the refType
     *
     * @return the refType
     */
    public String getRefType() {
        return refType;
    }

    /**
     * Sets the refType
     *
     * @param refType the refType to set
     */
    public void setRefType(String refType) {
        this.refType = refType;
    }

    /**
     * Gets the masterBranch
     *
     * @return the masterBranch
     */
    public String getMasterBranch() {
        return masterBranch;
    }

    /**
     * Sets the masterBranch
     *
     * @param masterBranch the masterBranch to set
     */
    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    /**
     * Gets the description
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description
     *
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the pusherType
     *
     * @return the pusherType
     */
    public String getPusherType() {
        return pusherType;
    }

    /**
     * Sets the pusherType
     *
     * @param pusherType the pusherType to set
     */
    public void setPusherType(String pusherType) {
        this.pusherType = pusherType;
    }

    /**
     * Gets the push_id
     *
     * @return the push_id
     */
    public String getPush_id() {
        return push_id;
    }

    /**
     * Sets the push_id
     *
     * @param push_id the push_id to set
     */
    public void setPush_id(String push_id) {
        this.push_id = push_id;
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

    /**
     * Gets the release
     *
     * @return the release
     */
    public Release getRelease() {
        return release;
    }

    /**
     * Sets the release
     *
     * @param release the release to set
     */
    public void setRelease(Release release) {
        this.release = release;
    }

    /**
     * Gets the comment
     *
     * @return the comment
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the comment
     *
     * @param comment the comment to set
     */
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    /**
     * Gets the member
     *
     * @return the member
     */
    public User getMember() {
        return member;
    }

    /**
     * Sets the member
     *
     * @param member the member to set
     */
    public void setMember(User member) {
        this.member = member;
    }

    /**
     * Gets the forkee
     *
     * @return the forkee
     */
    public Forkee getForkee() {
        return forkee;
    }

    /**
     * Sets the forkee
     *
     * @param forkee the forkee to set
     */
    public void setForkee(Forkee forkee) {
        this.forkee = forkee;
    }

    /**
     * Gets the pages
     *
     * @return the pages
     */
    public List<Page> getPages() {
        return pages;
    }

    /**
     * Sets the pages
     *
     * @param pages the pages to set
     */
    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

}
