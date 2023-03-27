package dmc.model;

import java.util.List;

public class Release {

    private String url;
    private String assets_url;
    private String upload_url;
    private String html_url;
    private int id;
    private String tag_name;
    private String target_commitish;
    private String name;
    private boolean draft;
    private User author;
    private boolean prerelease;
    private String created_at;
    private String published_at;
    private List<Asset> assets;
    private String tarball_url;
    private String zipball_url;
    private String body;

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
     * Gets the assets_url
     *
     * @return the assets_url
     */
    public String getAssets_url() {
        return assets_url;
    }

    /**
     * Sets the assets_url
     *
     * @param assets_url the assets_url to set
     */
    public void setAssets_url(String assets_url) {
        this.assets_url = assets_url;
    }

    /**
     * Gets the upload_url
     *
     * @return the upload_url
     */
    public String getUpload_url() {
        return upload_url;
    }

    /**
     * Sets the upload_url
     *
     * @param upload_url the upload_url to set
     */
    public void setUpload_url(String upload_url) {
        this.upload_url = upload_url;
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
     * Gets the tag_name
     *
     * @return the tag_name
     */
    public String getTag_name() {
        return tag_name;
    }

    /**
     * Sets the tag_name
     *
     * @param tag_name the tag_name to set
     */
    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    /**
     * Gets the target_commitish
     *
     * @return the target_commitish
     */
    public String getTarget_commitish() {
        return target_commitish;
    }

    /**
     * Sets the target_commitish
     *
     * @param target_commitish the target_commitish to set
     */
    public void setTarget_commitish(String target_commitish) {
        this.target_commitish = target_commitish;
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
     * Gets the draft
     *
     * @return the draft
     */
    public boolean isDraft() {
        return draft;
    }

    /**
     * Sets the draft
     *
     * @param draft the draft to set
     */
    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    /**
     * Gets the author
     *
     * @return the author
     */
    public User getAuthor() {
        return author;
    }

    /**
     * Sets the author
     *
     * @param author the author to set
     */
    public void setAuthor(User author) {
        this.author = author;
    }

    /**
     * Gets the prerelease
     *
     * @return the prerelease
     */
    public boolean isPrerelease() {
        return prerelease;
    }

    /**
     * Sets the prerelease
     *
     * @param prerelease the prerelease to set
     */
    public void setPrerelease(boolean prerelease) {
        this.prerelease = prerelease;
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
     * Gets the published_at
     *
     * @return the published_at
     */
    public String getPublished_at() {
        return published_at;
    }

    /**
     * Sets the published_at
     *
     * @param published_at the published_at to set
     */
    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    /**
     * Gets the assets
     *
     * @return the assets
     */
    public List<Asset> getAssets() {
        return assets;
    }

    /**
     * Sets the assets
     *
     * @param assets the assets to set
     */
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    /**
     * Gets the tarball_url
     *
     * @return the tarball_url
     */
    public String getTarball_url() {
        return tarball_url;
    }

    /**
     * Sets the tarball_url
     *
     * @param tarball_url the tarball_url to set
     */
    public void setTarball_url(String tarball_url) {
        this.tarball_url = tarball_url;
    }

    /**
     * Gets the zipball_url
     *
     * @return the zipball_url
     */
    public String getZipball_url() {
        return zipball_url;
    }

    /**
     * Sets the zipball_url
     *
     * @param zipball_url the zipball_url to set
     */
    public void setZipball_url(String zipball_url) {
        this.zipball_url = zipball_url;
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

}
