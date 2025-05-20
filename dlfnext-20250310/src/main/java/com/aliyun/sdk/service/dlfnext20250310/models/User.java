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
 * {@link User} extends {@link TeaModel}
 *
 * <p>User</p>
 */
public class User extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    @com.aliyun.core.annotation.NameInMap("userPrincipal")
    private String userPrincipal;

    private User(Builder builder) {
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.displayName = builder.displayName;
        this.type = builder.type;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userPrincipal = builder.userPrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static User create() {
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
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userPrincipal
     */
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

    public static final class Builder {
        private Long createdAt; 
        private String createdBy; 
        private String displayName; 
        private String type; 
        private Long updatedAt; 
        private String updatedBy; 
        private String userId; 
        private String userName; 
        private String userPrincipal; 

        private Builder() {
        } 

        private Builder(User model) {
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.displayName = model.displayName;
            this.type = model.type;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
            this.userId = model.userId;
            this.userName = model.userName;
            this.userPrincipal = model.userPrincipal;
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
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
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
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * userPrincipal.
         */
        public Builder userPrincipal(String userPrincipal) {
            this.userPrincipal = userPrincipal;
            return this;
        }

        public User build() {
            return new User(this);
        } 

    } 

}
