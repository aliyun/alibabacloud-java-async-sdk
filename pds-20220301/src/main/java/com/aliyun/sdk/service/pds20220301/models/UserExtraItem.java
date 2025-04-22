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
 * {@link UserExtraItem} extends {@link TeaModel}
 *
 * <p>UserExtraItem</p>
 */
public class UserExtraItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("account")
    private java.util.List<AccountLinkInfo> account;

    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("default_drive")
    private BaseDriveResponse defaultDrive;

    @com.aliyun.core.annotation.NameInMap("default_drive_id")
    private String defaultDriveId;

    @com.aliyun.core.annotation.NameInMap("default_location")
    private String defaultLocation;

    @com.aliyun.core.annotation.NameInMap("deny_change_password_by_self")
    private Boolean denyChangePasswordBySelf;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("expired_at")
    private Long expiredAt;

    @com.aliyun.core.annotation.NameInMap("is_sync")
    private Boolean isSync;

    @com.aliyun.core.annotation.NameInMap("last_login_time")
    private Long lastLoginTime;

    @com.aliyun.core.annotation.NameInMap("need_change_password_next_login")
    private Boolean needChangePasswordNextLogin;

    @com.aliyun.core.annotation.NameInMap("nick_name")
    private String nickName;

    @com.aliyun.core.annotation.NameInMap("parent_group")
    private java.util.List<BaseDriveResponse> parentGroup;

    @com.aliyun.core.annotation.NameInMap("path_status")
    private String pathStatus;

    @com.aliyun.core.annotation.NameInMap("permission")
    private java.util.Map<String, IDPermission> permission;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("phone_region")
    private String phoneRegion;

    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("user_data")
    private java.util.Map<String, ?> userData;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    private UserExtraItem(Builder builder) {
        this.account = builder.account;
        this.avatar = builder.avatar;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.defaultDrive = builder.defaultDrive;
        this.defaultDriveId = builder.defaultDriveId;
        this.defaultLocation = builder.defaultLocation;
        this.denyChangePasswordBySelf = builder.denyChangePasswordBySelf;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.email = builder.email;
        this.expiredAt = builder.expiredAt;
        this.isSync = builder.isSync;
        this.lastLoginTime = builder.lastLoginTime;
        this.needChangePasswordNextLogin = builder.needChangePasswordNextLogin;
        this.nickName = builder.nickName;
        this.parentGroup = builder.parentGroup;
        this.pathStatus = builder.pathStatus;
        this.permission = builder.permission;
        this.phone = builder.phone;
        this.phoneRegion = builder.phoneRegion;
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

    public static UserExtraItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public java.util.List<AccountLinkInfo> getAccount() {
        return this.account;
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
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return defaultDrive
     */
    public BaseDriveResponse getDefaultDrive() {
        return this.defaultDrive;
    }

    /**
     * @return defaultDriveId
     */
    public String getDefaultDriveId() {
        return this.defaultDriveId;
    }

    /**
     * @return defaultLocation
     */
    public String getDefaultLocation() {
        return this.defaultLocation;
    }

    /**
     * @return denyChangePasswordBySelf
     */
    public Boolean getDenyChangePasswordBySelf() {
        return this.denyChangePasswordBySelf;
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
     * @return expiredAt
     */
    public Long getExpiredAt() {
        return this.expiredAt;
    }

    /**
     * @return isSync
     */
    public Boolean getIsSync() {
        return this.isSync;
    }

    /**
     * @return lastLoginTime
     */
    public Long getLastLoginTime() {
        return this.lastLoginTime;
    }

    /**
     * @return needChangePasswordNextLogin
     */
    public Boolean getNeedChangePasswordNextLogin() {
        return this.needChangePasswordNextLogin;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return parentGroup
     */
    public java.util.List<BaseDriveResponse> getParentGroup() {
        return this.parentGroup;
    }

    /**
     * @return pathStatus
     */
    public String getPathStatus() {
        return this.pathStatus;
    }

    /**
     * @return permission
     */
    public java.util.Map<String, IDPermission> getPermission() {
        return this.permission;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return phoneRegion
     */
    public String getPhoneRegion() {
        return this.phoneRegion;
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
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userData
     */
    public java.util.Map<String, ?> getUserData() {
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
        private java.util.List<AccountLinkInfo> account; 
        private String avatar; 
        private String createdAt; 
        private String creator; 
        private BaseDriveResponse defaultDrive; 
        private String defaultDriveId; 
        private String defaultLocation; 
        private Boolean denyChangePasswordBySelf; 
        private String description; 
        private String domainId; 
        private String email; 
        private Long expiredAt; 
        private Boolean isSync; 
        private Long lastLoginTime; 
        private Boolean needChangePasswordNextLogin; 
        private String nickName; 
        private java.util.List<BaseDriveResponse> parentGroup; 
        private String pathStatus; 
        private java.util.Map<String, IDPermission> permission; 
        private String phone; 
        private String phoneRegion; 
        private String role; 
        private String status; 
        private String updatedAt; 
        private java.util.Map<String, ?> userData; 
        private String userId; 
        private String userName; 

        private Builder() {
        } 

        private Builder(UserExtraItem model) {
            this.account = model.account;
            this.avatar = model.avatar;
            this.createdAt = model.createdAt;
            this.creator = model.creator;
            this.defaultDrive = model.defaultDrive;
            this.defaultDriveId = model.defaultDriveId;
            this.defaultLocation = model.defaultLocation;
            this.denyChangePasswordBySelf = model.denyChangePasswordBySelf;
            this.description = model.description;
            this.domainId = model.domainId;
            this.email = model.email;
            this.expiredAt = model.expiredAt;
            this.isSync = model.isSync;
            this.lastLoginTime = model.lastLoginTime;
            this.needChangePasswordNextLogin = model.needChangePasswordNextLogin;
            this.nickName = model.nickName;
            this.parentGroup = model.parentGroup;
            this.pathStatus = model.pathStatus;
            this.permission = model.permission;
            this.phone = model.phone;
            this.phoneRegion = model.phoneRegion;
            this.role = model.role;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
            this.userData = model.userData;
            this.userId = model.userId;
            this.userName = model.userName;
        } 

        /**
         * account.
         */
        public Builder account(java.util.List<AccountLinkInfo> account) {
            this.account = account;
            return this;
        }

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
        public Builder createdAt(String createdAt) {
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
         * default_drive.
         */
        public Builder defaultDrive(BaseDriveResponse defaultDrive) {
            this.defaultDrive = defaultDrive;
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
         * default_location.
         */
        public Builder defaultLocation(String defaultLocation) {
            this.defaultLocation = defaultLocation;
            return this;
        }

        /**
         * deny_change_password_by_self.
         */
        public Builder denyChangePasswordBySelf(Boolean denyChangePasswordBySelf) {
            this.denyChangePasswordBySelf = denyChangePasswordBySelf;
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
         * expired_at.
         */
        public Builder expiredAt(Long expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }

        /**
         * is_sync.
         */
        public Builder isSync(Boolean isSync) {
            this.isSync = isSync;
            return this;
        }

        /**
         * last_login_time.
         */
        public Builder lastLoginTime(Long lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }

        /**
         * need_change_password_next_login.
         */
        public Builder needChangePasswordNextLogin(Boolean needChangePasswordNextLogin) {
            this.needChangePasswordNextLogin = needChangePasswordNextLogin;
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
         * parent_group.
         */
        public Builder parentGroup(java.util.List<BaseDriveResponse> parentGroup) {
            this.parentGroup = parentGroup;
            return this;
        }

        /**
         * path_status.
         */
        public Builder pathStatus(String pathStatus) {
            this.pathStatus = pathStatus;
            return this;
        }

        /**
         * permission.
         */
        public Builder permission(java.util.Map<String, IDPermission> permission) {
            this.permission = permission;
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
         * phone_region.
         */
        public Builder phoneRegion(String phoneRegion) {
            this.phoneRegion = phoneRegion;
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
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * user_data.
         */
        public Builder userData(java.util.Map<String, ?> userData) {
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

        public UserExtraItem build() {
            return new UserExtraItem(this);
        } 

    } 

}
