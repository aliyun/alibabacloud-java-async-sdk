// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BaseUserResponse} extends {@link TeaModel}
 *
 * <p>BaseUserResponse</p>
 */
public class BaseUserResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

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

    @com.aliyun.core.annotation.NameInMap("path_status")
    private String pathStatus;

    @com.aliyun.core.annotation.NameInMap("permission")
    private java.util.Map < String, IDPermission > permission;

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
    private java.util.Map < String, ? > userData;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    private BaseUserResponse(BuilderImpl builder) {
        super(builder);
        this.avatar = builder.avatar;
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
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

    public static BaseUserResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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
     * @return pathStatus
     */
    public String getPathStatus() {
        return this.pathStatus;
    }

    /**
     * @return permission
     */
    public java.util.Map < String, IDPermission > getPermission() {
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

    public interface Builder extends Response.Builder<BaseUserResponse, Builder> {

        Builder avatar(String avatar);

        Builder createdAt(String createdAt);

        Builder creator(String creator);

        Builder defaultDriveId(String defaultDriveId);

        Builder defaultLocation(String defaultLocation);

        Builder denyChangePasswordBySelf(Boolean denyChangePasswordBySelf);

        Builder description(String description);

        Builder domainId(String domainId);

        Builder email(String email);

        Builder expiredAt(Long expiredAt);

        Builder isSync(Boolean isSync);

        Builder lastLoginTime(Long lastLoginTime);

        Builder needChangePasswordNextLogin(Boolean needChangePasswordNextLogin);

        Builder nickName(String nickName);

        Builder pathStatus(String pathStatus);

        Builder permission(java.util.Map < String, IDPermission > permission);

        Builder phone(String phone);

        Builder phoneRegion(String phoneRegion);

        Builder role(String role);

        Builder status(String status);

        Builder updatedAt(String updatedAt);

        Builder userData(java.util.Map < String, ? > userData);

        Builder userId(String userId);

        Builder userName(String userName);

        @Override
        BaseUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseUserResponse, Builder>
            implements Builder {
        private String avatar; 
        private String createdAt; 
        private String creator; 
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
        private String pathStatus; 
        private java.util.Map < String, IDPermission > permission; 
        private String phone; 
        private String phoneRegion; 
        private String role; 
        private String status; 
        private String updatedAt; 
        private java.util.Map < String, ? > userData; 
        private String userId; 
        private String userName; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseUserResponse response) {
            super(response);
            this.avatar = response.avatar;
            this.createdAt = response.createdAt;
            this.creator = response.creator;
            this.defaultDriveId = response.defaultDriveId;
            this.defaultLocation = response.defaultLocation;
            this.denyChangePasswordBySelf = response.denyChangePasswordBySelf;
            this.description = response.description;
            this.domainId = response.domainId;
            this.email = response.email;
            this.expiredAt = response.expiredAt;
            this.isSync = response.isSync;
            this.lastLoginTime = response.lastLoginTime;
            this.needChangePasswordNextLogin = response.needChangePasswordNextLogin;
            this.nickName = response.nickName;
            this.pathStatus = response.pathStatus;
            this.permission = response.permission;
            this.phone = response.phone;
            this.phoneRegion = response.phoneRegion;
            this.role = response.role;
            this.status = response.status;
            this.updatedAt = response.updatedAt;
            this.userData = response.userData;
            this.userId = response.userId;
            this.userName = response.userName;
        } 

        /**
         * avatar.
         */
        @Override
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * created_at.
         */
        @Override
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        @Override
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * default_drive_id.
         */
        @Override
        public Builder defaultDriveId(String defaultDriveId) {
            this.defaultDriveId = defaultDriveId;
            return this;
        }

        /**
         * default_location.
         */
        @Override
        public Builder defaultLocation(String defaultLocation) {
            this.defaultLocation = defaultLocation;
            return this;
        }

        /**
         * deny_change_password_by_self.
         */
        @Override
        public Builder denyChangePasswordBySelf(Boolean denyChangePasswordBySelf) {
            this.denyChangePasswordBySelf = denyChangePasswordBySelf;
            return this;
        }

        /**
         * description.
         */
        @Override
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domain_id.
         */
        @Override
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * email.
         */
        @Override
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * expired_at.
         */
        @Override
        public Builder expiredAt(Long expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }

        /**
         * is_sync.
         */
        @Override
        public Builder isSync(Boolean isSync) {
            this.isSync = isSync;
            return this;
        }

        /**
         * last_login_time.
         */
        @Override
        public Builder lastLoginTime(Long lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }

        /**
         * need_change_password_next_login.
         */
        @Override
        public Builder needChangePasswordNextLogin(Boolean needChangePasswordNextLogin) {
            this.needChangePasswordNextLogin = needChangePasswordNextLogin;
            return this;
        }

        /**
         * nick_name.
         */
        @Override
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * path_status.
         */
        @Override
        public Builder pathStatus(String pathStatus) {
            this.pathStatus = pathStatus;
            return this;
        }

        /**
         * permission.
         */
        @Override
        public Builder permission(java.util.Map < String, IDPermission > permission) {
            this.permission = permission;
            return this;
        }

        /**
         * phone.
         */
        @Override
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * phone_region.
         */
        @Override
        public Builder phoneRegion(String phoneRegion) {
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * role.
         */
        @Override
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * status.
         */
        @Override
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updated_at.
         */
        @Override
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * user_data.
         */
        @Override
        public Builder userData(java.util.Map < String, ? > userData) {
            this.userData = userData;
            return this;
        }

        /**
         * user_id.
         */
        @Override
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        @Override
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        @Override
        public BaseUserResponse build() {
            return new BaseUserResponse(this);
        } 

    } 

}
