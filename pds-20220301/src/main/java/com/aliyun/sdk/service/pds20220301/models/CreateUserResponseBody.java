// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserResponseBody</p>
 */
public class CreateUserResponseBody extends TeaModel {
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
    private java.util.Map < String, ? > userData;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    private CreateUserResponseBody(Builder builder) {
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

    public static CreateUserResponseBody create() {
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
    public java.util.Map < String, ? > getUserData() {
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
        private java.util.Map < String, ? > userData; 
        private String userId; 
        private String userName; 

        /**
         * The URL of the profile picture.
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * The time when the user was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The user who created the user.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * The ID of the default drive.
         */
        public Builder defaultDriveId(String defaultDriveId) {
            this.defaultDriveId = defaultDriveId;
            return this;
        }

        /**
         * The description of the user.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The domain ID.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * The email address.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * The nickname of the user.
         */
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * The phone number.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * The role of the user. Valid values:
         * <p>
         * 
         * *   superadmin
         * *   admin
         * *   user
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * The state of the user. Valid values:
         * <p>
         * 
         * *   disabled: The user is prohibited from logon.
         * *   enabled: The user is in a normal state.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The time when the user was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * The custom data.
         */
        public Builder userData(java.util.Map < String, ? > userData) {
            this.userData = userData;
            return this;
        }

        /**
         * The user ID.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * The username.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public CreateUserResponseBody build() {
            return new CreateUserResponseBody(this);
        } 

    } 

}
