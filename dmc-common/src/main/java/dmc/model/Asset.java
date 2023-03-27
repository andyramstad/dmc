package dmc.model;

public class Asset {

    private String url;
    private int id;
    private String name;
    private String label;
    private User uploader;
    private String content_type;
    private String state;
    private int size;
    private int download_count;
    private String created_at;
    private String updated_at;
    private String browser_download_url;
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
     * Gets the uploader
     *
     * @return the uploader
     */
    public User getUploader() {
        return uploader;
    }
    /**
     * Sets the uploader
     *
     * @param uploader the uploader to set
     */
    public void setUploader(User uploader) {
        this.uploader = uploader;
    }
    /**
     * Gets the content_type
     *
     * @return the content_type
     */
    public String getContent_type() {
        return content_type;
    }
    /**
     * Sets the content_type
     *
     * @param content_type the content_type to set
     */
    public void setContent_type(String content_type) {
        this.content_type = content_type;
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
     * Gets the download_count
     *
     * @return the download_count
     */
    public int getDownload_count() {
        return download_count;
    }
    /**
     * Sets the download_count
     *
     * @param download_count the download_count to set
     */
    public void setDownload_count(int download_count) {
        this.download_count = download_count;
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
     * Gets the browser_download_url
     *
     * @return the browser_download_url
     */
    public String getBrowser_download_url() {
        return browser_download_url;
    }
    /**
     * Sets the browser_download_url
     *
     * @param browser_download_url the browser_download_url to set
     */
    public void setBrowser_download_url(String browser_download_url) {
        this.browser_download_url = browser_download_url;
    }
    
    
}
