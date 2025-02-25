// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("default_drive_id")
    private String defaultDriveId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("nick_name")
    private String nickName;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("user_data")
    private java.util.Map<String, String> userData;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    private User(Builder builder) {
        this.avatar = builder.avatar;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.defaultDriveId = builder.defaultDriveId;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.email = builder.email;
        this.nickName = builder.nickName;
        this.phone = builder.phone;
        this.role = builder.role;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
        this.userData = builder.userData;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static User create() {
        return builder().build();
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return defaultDriveId
     */
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userData
     */
    public java.util.Map<String, String> getUserData() {
        return this.userData;
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

    public static final class Builder {
        private String avatar; 
        private Long createdAt; 
        private String creator; 
        private String defaultDriveId; 
        private String description; 
        private String domainId; 
        private String email; 
        private String nickName; 
        private String phone; 
        private String role; 
        private String status; 
        private Long updatedAt; 
        private java.util.Map<String, String> userData; 
        private String userId; 
        private String userName; 

        /**
         * avatar.
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * default_drive_id.
         */
        public Builder defaultDriveId(String defaultDriveId) {
            this.defaultDriveId = defaultDriveId;
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
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * nick_name.
         */
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updated_at.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * user_data.
         */
        public Builder userData(java.util.Map<String, String> userData) {
            this.userData = userData;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build() {
            return new User(this);
        } 

    } 

}
