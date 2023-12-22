// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @Query
    @NameInMap("AvatarUrl")
    private String avatarUrl;

    @Query
    @NameInMap("DisplayId")
    private String displayId;

    @Query
    @NameInMap("DisplayName")
    @Validation(required = true, maxLength = 500)
    private String displayName;

    @Query
    @NameInMap("Email")
    @Validation(required = true)
    private String email;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LoginName")
    @Validation(required = true)
    private String loginName;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("Nickname")
    private String nickname;

    @Query
    @NameInMap("ResetPassword")
    private Boolean resetPassword;

    @Query
    @NameInMap("RoleId")
    @Validation(required = true)
    private String roleId;

    @Query
    @NameInMap("SkillLevelList")
    private String skillLevelList;

    @Query
    @NameInMap("WorkMode")
    private String workMode;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.avatarUrl = builder.avatarUrl;
        this.displayId = builder.displayId;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.instanceId = builder.instanceId;
        this.loginName = builder.loginName;
        this.mobile = builder.mobile;
        this.nickname = builder.nickname;
        this.resetPassword = builder.resetPassword;
        this.roleId = builder.roleId;
        this.skillLevelList = builder.skillLevelList;
        this.workMode = builder.workMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * @return displayId
     */
    public String getDisplayId() {
        return this.displayId;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return loginName
     */
    public String getLoginName() {
        return this.loginName;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return resetPassword
     */
    public Boolean getResetPassword() {
        return this.resetPassword;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return skillLevelList
     */
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    /**
     * @return workMode
     */
    public String getWorkMode() {
        return this.workMode;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String avatarUrl; 
        private String displayId; 
        private String displayName; 
        private String email; 
        private String instanceId; 
        private String loginName; 
        private String mobile; 
        private String nickname; 
        private Boolean resetPassword; 
        private String roleId; 
        private String skillLevelList; 
        private String workMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.avatarUrl = request.avatarUrl;
            this.displayId = request.displayId;
            this.displayName = request.displayName;
            this.email = request.email;
            this.instanceId = request.instanceId;
            this.loginName = request.loginName;
            this.mobile = request.mobile;
            this.nickname = request.nickname;
            this.resetPassword = request.resetPassword;
            this.roleId = request.roleId;
            this.skillLevelList = request.skillLevelList;
            this.workMode = request.workMode;
        } 

        /**
         * AvatarUrl.
         */
        public Builder avatarUrl(String avatarUrl) {
            this.putQueryParameter("AvatarUrl", avatarUrl);
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * DisplayId.
         */
        public Builder displayId(String displayId) {
            this.putQueryParameter("DisplayId", displayId);
            this.displayId = displayId;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LoginName.
         */
        public Builder loginName(String loginName) {
            this.putQueryParameter("LoginName", loginName);
            this.loginName = loginName;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * Nickname.
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * ResetPassword.
         */
        public Builder resetPassword(Boolean resetPassword) {
            this.putQueryParameter("ResetPassword", resetPassword);
            this.resetPassword = resetPassword;
            return this;
        }

        /**
         * RoleId.
         */
        public Builder roleId(String roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * SkillLevelList.
         */
        public Builder skillLevelList(String skillLevelList) {
            this.putQueryParameter("SkillLevelList", skillLevelList);
            this.skillLevelList = skillLevelList;
            return this;
        }

        /**
         * WorkMode.
         */
        public Builder workMode(String workMode) {
            this.putQueryParameter("WorkMode", workMode);
            this.workMode = workMode;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

}
