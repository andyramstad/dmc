package dmc.model;

import java.util.Date;

public class GitHubEvent {
    private String id;
    private String type;
    private Actor actor;
    private Repo repo;
    private Payload payload;
    private boolean isPublic;
    private Date created_at;
    private Org org;

    /**
     * Gets the org
     *
     * @return the org
     */
    public Org getOrg() {
        return org;
    }

    /**
     * Sets the org
     *
     * @param org the org to set
     */
    public void setOrg(Org org) {
        this.org = org;
    }

    /**
     * Gets the id
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id
     *
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type
     *
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the actor
     *
     * @return the actor
     */
    public Actor getActor() {
        return actor;
    }

    /**
     * Sets the actor
     *
     * @param actor the actor to set
     */
    public void setActor(Actor actor) {
        this.actor = actor;
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

    /**
     * Gets the payload
     *
     * @return the payload
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * Sets the payload
     *
     * @param payload the payload to set
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * Gets the isPublic
     *
     * @return the isPublic
     */
    public boolean isPublic() {
        return isPublic;
    }

    /**
     * Sets the isPublic
     *
     * @param isPublic the isPublic to set
     */
    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
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

}
