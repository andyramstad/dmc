package dmc.model;

/**
 * Repo
 */
public class Repo {

    private boolean is_private;
    private boolean is_fork;
    private boolean isPrivate;

    private int id;
    private String name;
    private String full_name;
    private User owner;
    private boolean _private;
    private String html_url;
    private String description;
    private boolean fork;
    private String url;
    private String forks_url;
    private String keys_url;
    private String collaborators_url;
    private String teams_url;
    private String hooks_url;
    private String issue_events_url;
    private String events_url;
    private String assignees_url;
    private String branches_url;
    private String tags_url;
    private String blobs_url;
    private String git_tags_url;
    private String git_refs_url;
    private String trees_url;
    private String statuses_url;
    private String languages_url;
    private String stargazers_url;
    private String contributors_url;
    private String subscribers_url;
    private String subscription_url;
    private String commits_url;
    private String git_commits_url;
    private String comments_url;
    private String issue_comment_url;
    private String contents_url;
    private String compare_url;
    private String merges_url;
    private String archive_url;
    private String downloads_url;
    private String issues_url;
    private String pulls_url;
    private String milestones_url;
    private String notifications_url;
    private String labels_url;
    private String releases_url;
    private String created_at;
    private String updated_at;
    private String pushed_at;
    private String git_url;
    private String ssh_url;
    private String clone_url;
    private String svn_url;
    private String homepage;
    private int size;
    private int stargazers_count;
    private int watchers_count;
    private String language;
    private boolean has_issues;
    private boolean has_downloads;
    private boolean has_wiki;
    private boolean has_pages;
    private int forks_count;
    private int open_issues_count;
    private int forks;
    private int open_issues;
    private int watchers;
    private String default_branch;
    private String mirror_url;

    /**
     * Gets the is_private
     *
     * @return the is_private
     */
    public boolean isIs_private() {
        return is_private;
    }

    /**
     * Sets the is_private
     *
     * @param is_private the is_private to set
     */
    public void setIs_private(boolean is_private) {
        this.is_private = is_private;
    }

    /**
     * Gets the is_fork
     *
     * @return the is_fork
     */
    public boolean isIs_fork() {
        return is_fork;
    }

    /**
     * Sets the is_fork
     *
     * @param is_fork the is_fork to set
     */
    public void setIs_fork(boolean is_fork) {
        this.is_fork = is_fork;
    }

    /**
     * Gets the isPrivate
     *
     * @return the isPrivate
     */
    public boolean isPrivate() {
        return isPrivate;
    }

    /**
     * Sets the isPrivate
     *
     * @param isPrivate the isPrivate to set
     */
    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
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
     * Gets the name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the full_name
     *
     * @return the full_name
     */
    public String getFull_name() {
        return full_name;
    }

    /**
     * Sets the full_name
     *
     * @param full_name the full_name to set
     */
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    /**
     * Gets the owner
     *
     * @return the owner
     */
    public User getOwner() {
        return owner;
    }

    /**
     * Sets the owner
     *
     * @param owner the owner to set
     */
    public void setOwner(User owner) {
        this.owner = owner;
    }

    /**
     * Gets the _private
     *
     * @return the _private
     */
    public boolean is_private() {
        return _private;
    }

    /**
     * Sets the _private
     *
     * @param _private the _private to set
     */
    public void set_private(boolean _private) {
        this._private = _private;
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
     * Gets the fork
     *
     * @return the fork
     */
    public boolean isFork() {
        return fork;
    }

    /**
     * Sets the fork
     *
     * @param fork the fork to set
     */
    public void setFork(boolean fork) {
        this.fork = fork;
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
     * Gets the forks_url
     *
     * @return the forks_url
     */
    public String getForks_url() {
        return forks_url;
    }

    /**
     * Sets the forks_url
     *
     * @param forks_url the forks_url to set
     */
    public void setForks_url(String forks_url) {
        this.forks_url = forks_url;
    }

    /**
     * Gets the keys_url
     *
     * @return the keys_url
     */
    public String getKeys_url() {
        return keys_url;
    }

    /**
     * Sets the keys_url
     *
     * @param keys_url the keys_url to set
     */
    public void setKeys_url(String keys_url) {
        this.keys_url = keys_url;
    }

    /**
     * Gets the collaborators_url
     *
     * @return the collaborators_url
     */
    public String getCollaborators_url() {
        return collaborators_url;
    }

    /**
     * Sets the collaborators_url
     *
     * @param collaborators_url the collaborators_url to set
     */
    public void setCollaborators_url(String collaborators_url) {
        this.collaborators_url = collaborators_url;
    }

    /**
     * Gets the teams_url
     *
     * @return the teams_url
     */
    public String getTeams_url() {
        return teams_url;
    }

    /**
     * Sets the teams_url
     *
     * @param teams_url the teams_url to set
     */
    public void setTeams_url(String teams_url) {
        this.teams_url = teams_url;
    }

    /**
     * Gets the hooks_url
     *
     * @return the hooks_url
     */
    public String getHooks_url() {
        return hooks_url;
    }

    /**
     * Sets the hooks_url
     *
     * @param hooks_url the hooks_url to set
     */
    public void setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
    }

    /**
     * Gets the issue_events_url
     *
     * @return the issue_events_url
     */
    public String getIssue_events_url() {
        return issue_events_url;
    }

    /**
     * Sets the issue_events_url
     *
     * @param issue_events_url the issue_events_url to set
     */
    public void setIssue_events_url(String issue_events_url) {
        this.issue_events_url = issue_events_url;
    }

    /**
     * Gets the events_url
     *
     * @return the events_url
     */
    public String getEvents_url() {
        return events_url;
    }

    /**
     * Sets the events_url
     *
     * @param events_url the events_url to set
     */
    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    /**
     * Gets the assignees_url
     *
     * @return the assignees_url
     */
    public String getAssignees_url() {
        return assignees_url;
    }

    /**
     * Sets the assignees_url
     *
     * @param assignees_url the assignees_url to set
     */
    public void setAssignees_url(String assignees_url) {
        this.assignees_url = assignees_url;
    }

    /**
     * Gets the branches_url
     *
     * @return the branches_url
     */
    public String getBranches_url() {
        return branches_url;
    }

    /**
     * Sets the branches_url
     *
     * @param branches_url the branches_url to set
     */
    public void setBranches_url(String branches_url) {
        this.branches_url = branches_url;
    }

    /**
     * Gets the tags_url
     *
     * @return the tags_url
     */
    public String getTags_url() {
        return tags_url;
    }

    /**
     * Sets the tags_url
     *
     * @param tags_url the tags_url to set
     */
    public void setTags_url(String tags_url) {
        this.tags_url = tags_url;
    }

    /**
     * Gets the blobs_url
     *
     * @return the blobs_url
     */
    public String getBlobs_url() {
        return blobs_url;
    }

    /**
     * Sets the blobs_url
     *
     * @param blobs_url the blobs_url to set
     */
    public void setBlobs_url(String blobs_url) {
        this.blobs_url = blobs_url;
    }

    /**
     * Gets the git_tags_url
     *
     * @return the git_tags_url
     */
    public String getGit_tags_url() {
        return git_tags_url;
    }

    /**
     * Sets the git_tags_url
     *
     * @param git_tags_url the git_tags_url to set
     */
    public void setGit_tags_url(String git_tags_url) {
        this.git_tags_url = git_tags_url;
    }

    /**
     * Gets the git_refs_url
     *
     * @return the git_refs_url
     */
    public String getGit_refs_url() {
        return git_refs_url;
    }

    /**
     * Sets the git_refs_url
     *
     * @param git_refs_url the git_refs_url to set
     */
    public void setGit_refs_url(String git_refs_url) {
        this.git_refs_url = git_refs_url;
    }

    /**
     * Gets the trees_url
     *
     * @return the trees_url
     */
    public String getTrees_url() {
        return trees_url;
    }

    /**
     * Sets the trees_url
     *
     * @param trees_url the trees_url to set
     */
    public void setTrees_url(String trees_url) {
        this.trees_url = trees_url;
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
     * Gets the languages_url
     *
     * @return the languages_url
     */
    public String getLanguages_url() {
        return languages_url;
    }

    /**
     * Sets the languages_url
     *
     * @param languages_url the languages_url to set
     */
    public void setLanguages_url(String languages_url) {
        this.languages_url = languages_url;
    }

    /**
     * Gets the stargazers_url
     *
     * @return the stargazers_url
     */
    public String getStargazers_url() {
        return stargazers_url;
    }

    /**
     * Sets the stargazers_url
     *
     * @param stargazers_url the stargazers_url to set
     */
    public void setStargazers_url(String stargazers_url) {
        this.stargazers_url = stargazers_url;
    }

    /**
     * Gets the contributors_url
     *
     * @return the contributors_url
     */
    public String getContributors_url() {
        return contributors_url;
    }

    /**
     * Sets the contributors_url
     *
     * @param contributors_url the contributors_url to set
     */
    public void setContributors_url(String contributors_url) {
        this.contributors_url = contributors_url;
    }

    /**
     * Gets the subscribers_url
     *
     * @return the subscribers_url
     */
    public String getSubscribers_url() {
        return subscribers_url;
    }

    /**
     * Sets the subscribers_url
     *
     * @param subscribers_url the subscribers_url to set
     */
    public void setSubscribers_url(String subscribers_url) {
        this.subscribers_url = subscribers_url;
    }

    /**
     * Gets the subscription_url
     *
     * @return the subscription_url
     */
    public String getSubscription_url() {
        return subscription_url;
    }

    /**
     * Sets the subscription_url
     *
     * @param subscription_url the subscription_url to set
     */
    public void setSubscription_url(String subscription_url) {
        this.subscription_url = subscription_url;
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
     * Gets the git_commits_url
     *
     * @return the git_commits_url
     */
    public String getGit_commits_url() {
        return git_commits_url;
    }

    /**
     * Sets the git_commits_url
     *
     * @param git_commits_url the git_commits_url to set
     */
    public void setGit_commits_url(String git_commits_url) {
        this.git_commits_url = git_commits_url;
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
     * Gets the issue_comment_url
     *
     * @return the issue_comment_url
     */
    public String getIssue_comment_url() {
        return issue_comment_url;
    }

    /**
     * Sets the issue_comment_url
     *
     * @param issue_comment_url the issue_comment_url to set
     */
    public void setIssue_comment_url(String issue_comment_url) {
        this.issue_comment_url = issue_comment_url;
    }

    /**
     * Gets the contents_url
     *
     * @return the contents_url
     */
    public String getContents_url() {
        return contents_url;
    }

    /**
     * Sets the contents_url
     *
     * @param contents_url the contents_url to set
     */
    public void setContents_url(String contents_url) {
        this.contents_url = contents_url;
    }

    /**
     * Gets the compare_url
     *
     * @return the compare_url
     */
    public String getCompare_url() {
        return compare_url;
    }

    /**
     * Sets the compare_url
     *
     * @param compare_url the compare_url to set
     */
    public void setCompare_url(String compare_url) {
        this.compare_url = compare_url;
    }

    /**
     * Gets the merges_url
     *
     * @return the merges_url
     */
    public String getMerges_url() {
        return merges_url;
    }

    /**
     * Sets the merges_url
     *
     * @param merges_url the merges_url to set
     */
    public void setMerges_url(String merges_url) {
        this.merges_url = merges_url;
    }

    /**
     * Gets the archive_url
     *
     * @return the archive_url
     */
    public String getArchive_url() {
        return archive_url;
    }

    /**
     * Sets the archive_url
     *
     * @param archive_url the archive_url to set
     */
    public void setArchive_url(String archive_url) {
        this.archive_url = archive_url;
    }

    /**
     * Gets the downloads_url
     *
     * @return the downloads_url
     */
    public String getDownloads_url() {
        return downloads_url;
    }

    /**
     * Sets the downloads_url
     *
     * @param downloads_url the downloads_url to set
     */
    public void setDownloads_url(String downloads_url) {
        this.downloads_url = downloads_url;
    }

    /**
     * Gets the issues_url
     *
     * @return the issues_url
     */
    public String getIssues_url() {
        return issues_url;
    }

    /**
     * Sets the issues_url
     *
     * @param issues_url the issues_url to set
     */
    public void setIssues_url(String issues_url) {
        this.issues_url = issues_url;
    }

    /**
     * Gets the pulls_url
     *
     * @return the pulls_url
     */
    public String getPulls_url() {
        return pulls_url;
    }

    /**
     * Sets the pulls_url
     *
     * @param pulls_url the pulls_url to set
     */
    public void setPulls_url(String pulls_url) {
        this.pulls_url = pulls_url;
    }

    /**
     * Gets the milestones_url
     *
     * @return the milestones_url
     */
    public String getMilestones_url() {
        return milestones_url;
    }

    /**
     * Sets the milestones_url
     *
     * @param milestones_url the milestones_url to set
     */
    public void setMilestones_url(String milestones_url) {
        this.milestones_url = milestones_url;
    }

    /**
     * Gets the notifications_url
     *
     * @return the notifications_url
     */
    public String getNotifications_url() {
        return notifications_url;
    }

    /**
     * Sets the notifications_url
     *
     * @param notifications_url the notifications_url to set
     */
    public void setNotifications_url(String notifications_url) {
        this.notifications_url = notifications_url;
    }

    /**
     * Gets the labels_url
     *
     * @return the labels_url
     */
    public String getLabels_url() {
        return labels_url;
    }

    /**
     * Sets the labels_url
     *
     * @param labels_url the labels_url to set
     */
    public void setLabels_url(String labels_url) {
        this.labels_url = labels_url;
    }

    /**
     * Gets the releases_url
     *
     * @return the releases_url
     */
    public String getReleases_url() {
        return releases_url;
    }

    /**
     * Sets the releases_url
     *
     * @param releases_url the releases_url to set
     */
    public void setReleases_url(String releases_url) {
        this.releases_url = releases_url;
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
     * Gets the pushed_at
     *
     * @return the pushed_at
     */
    public String getPushed_at() {
        return pushed_at;
    }

    /**
     * Sets the pushed_at
     *
     * @param pushed_at the pushed_at to set
     */
    public void setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
    }

    /**
     * Gets the git_url
     *
     * @return the git_url
     */
    public String getGit_url() {
        return git_url;
    }

    /**
     * Sets the git_url
     *
     * @param git_url the git_url to set
     */
    public void setGit_url(String git_url) {
        this.git_url = git_url;
    }

    /**
     * Gets the ssh_url
     *
     * @return the ssh_url
     */
    public String getSsh_url() {
        return ssh_url;
    }

    /**
     * Sets the ssh_url
     *
     * @param ssh_url the ssh_url to set
     */
    public void setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
    }

    /**
     * Gets the clone_url
     *
     * @return the clone_url
     */
    public String getClone_url() {
        return clone_url;
    }

    /**
     * Sets the clone_url
     *
     * @param clone_url the clone_url to set
     */
    public void setClone_url(String clone_url) {
        this.clone_url = clone_url;
    }

    /**
     * Gets the svn_url
     *
     * @return the svn_url
     */
    public String getSvn_url() {
        return svn_url;
    }

    /**
     * Sets the svn_url
     *
     * @param svn_url the svn_url to set
     */
    public void setSvn_url(String svn_url) {
        this.svn_url = svn_url;
    }

    /**
     * Gets the homepage
     *
     * @return the homepage
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * Sets the homepage
     *
     * @param homepage the homepage to set
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * Gets the size
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the size
     *
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Gets the stargazers_count
     *
     * @return the stargazers_count
     */
    public int getStargazers_count() {
        return stargazers_count;
    }

    /**
     * Sets the stargazers_count
     *
     * @param stargazers_count the stargazers_count to set
     */
    public void setStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    /**
     * Gets the watchers_count
     *
     * @return the watchers_count
     */
    public int getWatchers_count() {
        return watchers_count;
    }

    /**
     * Sets the watchers_count
     *
     * @param watchers_count the watchers_count to set
     */
    public void setWatchers_count(int watchers_count) {
        this.watchers_count = watchers_count;
    }

    /**
     * Gets the language
     *
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language
     *
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Gets the has_issues
     *
     * @return the has_issues
     */
    public boolean isHas_issues() {
        return has_issues;
    }

    /**
     * Sets the has_issues
     *
     * @param has_issues the has_issues to set
     */
    public void setHas_issues(boolean has_issues) {
        this.has_issues = has_issues;
    }

    /**
     * Gets the has_downloads
     *
     * @return the has_downloads
     */
    public boolean isHas_downloads() {
        return has_downloads;
    }

    /**
     * Sets the has_downloads
     *
     * @param has_downloads the has_downloads to set
     */
    public void setHas_downloads(boolean has_downloads) {
        this.has_downloads = has_downloads;
    }

    /**
     * Gets the has_wiki
     *
     * @return the has_wiki
     */
    public boolean isHas_wiki() {
        return has_wiki;
    }

    /**
     * Sets the has_wiki
     *
     * @param has_wiki the has_wiki to set
     */
    public void setHas_wiki(boolean has_wiki) {
        this.has_wiki = has_wiki;
    }

    /**
     * Gets the has_pages
     *
     * @return the has_pages
     */
    public boolean isHas_pages() {
        return has_pages;
    }

    /**
     * Sets the has_pages
     *
     * @param has_pages the has_pages to set
     */
    public void setHas_pages(boolean has_pages) {
        this.has_pages = has_pages;
    }

    /**
     * Gets the forks_count
     *
     * @return the forks_count
     */
    public int getForks_count() {
        return forks_count;
    }

    /**
     * Sets the forks_count
     *
     * @param forks_count the forks_count to set
     */
    public void setForks_count(int forks_count) {
        this.forks_count = forks_count;
    }

    /**
     * Gets the open_issues_count
     *
     * @return the open_issues_count
     */
    public int getOpen_issues_count() {
        return open_issues_count;
    }

    /**
     * Sets the open_issues_count
     *
     * @param open_issues_count the open_issues_count to set
     */
    public void setOpen_issues_count(int open_issues_count) {
        this.open_issues_count = open_issues_count;
    }

    /**
     * Gets the forks
     *
     * @return the forks
     */
    public int getForks() {
        return forks;
    }

    /**
     * Sets the forks
     *
     * @param forks the forks to set
     */
    public void setForks(int forks) {
        this.forks = forks;
    }

    /**
     * Gets the open_issues
     *
     * @return the open_issues
     */
    public int getOpen_issues() {
        return open_issues;
    }

    /**
     * Sets the open_issues
     *
     * @param open_issues the open_issues to set
     */
    public void setOpen_issues(int open_issues) {
        this.open_issues = open_issues;
    }

    /**
     * Gets the watchers
     *
     * @return the watchers
     */
    public int getWatchers() {
        return watchers;
    }

    /**
     * Sets the watchers
     *
     * @param watchers the watchers to set
     */
    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    /**
     * Gets the default_branch
     *
     * @return the default_branch
     */
    public String getDefault_branch() {
        return default_branch;
    }

    /**
     * Sets the default_branch
     *
     * @param default_branch the default_branch to set
     */
    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    /**
     * Gets the mirror_url
     *
     * @return the mirror_url
     */
    public String getMirror_url() {
        return mirror_url;
    }

    /**
     * Sets the mirror_url
     *
     * @param mirror_url the mirror_url to set
     */
    public void setMirror_url(String mirror_url) {
        this.mirror_url = mirror_url;
    }

}