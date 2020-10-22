package org.example.models;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Structured class to represent a JSON User response from WordPress
 */
public class WordPressUser extends AdminUserForm  {
    /**
     * The default role a WordPress user is given upon creation. Not decided here, only referenced.
     */
    public static final String DEFAULT_ROLE = "subscriber";

    private Integer id;
    private String username;
    private String name;
    private String email;
    private String slug;
    private String phone;
    private Collection<String> roles = new ArrayList<>();

    /**
     * @return the {@link #id} of this {@link WordPressUser}
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the {@link #id} to set for this {@link WordPressUser}
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the {@link #username} of this {@link WordPressUser}
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the {@link #username} to set for this {@link WordPressUser}
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * The SSO and Username in Wordpress should be the same
     *
     * @return the SSO of this {@link WordPressUser}
     * @see #getUsername()
     */
    public String getSSO() {
        return getUsername();
    }

    /**
     * @return the {@link #name} of this {@link WordPressUser}
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the {@link #name} to set for this {@link WordPressUser}
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the {@link #email} of this {@link WordPressUser}
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the {@link #email} to set for this {@link WordPressUser}
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the {@link #slug} of this {@link WordPressUser}
     */
    public String getSlug() {
        return slug;
    }

    /**
     * @param slug the {@link #slug} to set for this {@link WordPressUser}
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * @return the {@link #roles} of this {@link WordPressUser}
     */

    public Collection<String> getRoles() {
        return roles;
    }

    /**
     * If roles is null, will default to an empty {@link ArrayList}
     *
     * @param roles the {@link #roles} to set for this {@link WordPressUser}
     */
    public void setRoles(Collection<String> roles) {
        if (roles == null)
            roles = new ArrayList<>();
        this.roles = roles;
    }

    /**
     * Assumes a user is enabled if it has any roles at all.
     *
     * @return {@code true} if the user has any roles.  Otherwise, {@code false}
     * @see #getRoles()
     */
    public boolean isEnabled() {
        return !getRoles().isEmpty();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
