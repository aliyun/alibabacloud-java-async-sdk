// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Role} extends {@link TeaModel}
 *
 * <p>Role</p>
 */
public class Role extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("isPredefined")
    private String isPredefined;

    @com.aliyun.core.annotation.NameInMap("roleName")
    private String roleName;

    @com.aliyun.core.annotation.NameInMap("rolePrincipal")
    private String rolePrincipal;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    @com.aliyun.core.annotation.NameInMap("users")
    private java.util.List<User> users;

    private Role(Builder builder) {
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.isPredefined = builder.isPredefined;
        this.roleName = builder.roleName;
        this.rolePrincipal = builder.rolePrincipal;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Role create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return isPredefined
     */
    public String getIsPredefined() {
        return this.isPredefined;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return rolePrincipal
     */
    public String getRolePrincipal() {
        return this.rolePrincipal;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * @return users
     */
    public java.util.List<User> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Long createdAt; 
        private String createdBy; 
        private String description; 
        private String displayName; 
        private String isPredefined; 
        private String roleName; 
        private String rolePrincipal; 
        private Long updatedAt; 
        private String updatedBy; 
        private java.util.List<User> users; 

        private Builder() {
        } 

        private Builder(Role model) {
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.description = model.description;
            this.displayName = model.displayName;
            this.isPredefined = model.isPredefined;
            this.roleName = model.roleName;
            this.rolePrincipal = model.rolePrincipal;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
            this.users = model.users;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * createdBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * isPredefined.
         */
        public Builder isPredefined(String isPredefined) {
            this.isPredefined = isPredefined;
            return this;
        }

        /**
         * roleName.
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * rolePrincipal.
         */
        public Builder rolePrincipal(String rolePrincipal) {
            this.rolePrincipal = rolePrincipal;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * updatedBy.
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        /**
         * users.
         */
        public Builder users(java.util.List<User> users) {
            this.users = users;
            return this;
        }

        public Role build() {
            return new Role(this);
        } 

    } 

}
